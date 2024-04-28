package servizi;

import it.epicode.Libri;
import it.epicode.Prodotti;
import it.epicode.Riviste;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class FunzionalitàArchivio implements Funzionalità {

    private static final Logger logger = LoggerFactory.getLogger(FunzionalitàArchivio.class);

    private final ArrayList<Prodotti> listaProdotti = new ArrayList<>();

    private static final String STORAGE = "./prodotti.csv";


    public List<Prodotti> getList(){
    //metodo per ricavare l'intera lista di prodotti
        return listaProdotti.stream().toList();
    }
    @Override
    public void addProdotto(Prodotti prodotto) {
    //metodo che data un'istanza di Prodotti come parametro la aggiugne alla lista e
    //richiama il metodo save per tenere il file di testo aggiornato
        listaProdotti.add(prodotto);
        save();
    }

    @Override
    public void removeByISBN(Integer ISBN) {
        //metodo che, dato un ISBN come parametro trova il prodotto all'interno della lista con quello specifico ISBN
        //lo rimuove e richiama il metodo save per aggiornare il file di testo
        listaProdotti.removeIf(prodotto -> prodotto.getNewISBN().equals(ISBN));
        save();

    }

    @Override
    public Optional<Prodotti> getByISBN(Integer ISBN) {
    //metodo che, dato un ISBN come parametro, ritorna il prodotto all'interno della lista con quello specifico ISBN
        var prod = listaProdotti.stream()
                .filter(prodotto -> prodotto.getNewISBN().equals(ISBN))
                .findFirst();
        return prod;
    }

    @Override
    public List<Prodotti> getByAnnoPubblicazione(Integer annoPubblicazione) {
        //metodo che, dato un anno di pubblicazione come parametro,
        // ritorna una lista di prodotti  con quello specifico anno di pubblicazione
        var prod = listaProdotti.stream().filter(prodotto -> prodotto.getAnnoPubblicazione().equals(annoPubblicazione))
                .toList();

        return prod;
    }

    @Override
    public List<Prodotti> getByAutore(String autore) {
    //metodo che, data una stringa con il nome dell'autore, filtra la lista dei prodotti
        // e ritorna tutti i prodotti che hanno quell'autore
        var prod = listaProdotti.stream().filter(p -> p instanceof Libri && ((Libri) p).getAutore().equals(autore))
                .toList();

        return prod;
    }

    @Override
    public void save() {
    // metodo che salva la lista dei prodotti in un file di testo
        File file = new File(STORAGE);

        try{

            FileUtils.delete(file);
        }catch(IOException e){

            logger.error("Errore durante l'eliminazione del file", e);
        }
        //apro uno stream sulla lista dei prodotti
        listaProdotti.stream().forEach(prodotto -> {
            try{
                //per ogni prodotto controllo se è un'istanza di una specifica classe e in base a quello prendo dei dati
                if (prodotto instanceof Libri) {
                    var lines = Arrays.asList(prodotto.getNewISBN(), prodotto.getTitolo(),
                            prodotto.getAnnoPubblicazione(), prodotto.getNumeroPagine(),
                            ((Libri) prodotto).getAutore(), ((Libri) prodotto).getGenere());
                    //per ogni iterazione scrivo i dati del prodotto nel file di testo
                    FileUtils.writeLines(file, StandardCharsets.ISO_8859_1.name(), lines,true);
                }else if(prodotto instanceof Riviste){

                    var lines = Arrays.asList(prodotto.getNewISBN(), prodotto.getTitolo(),
                            prodotto.getNumeroPagine(),
                            prodotto.getAnnoPubblicazione(),
                            ((Riviste) prodotto).getPeriodicità());
                    FileUtils.writeLines(file, StandardCharsets.ISO_8859_1.name(), lines,true);
                }


            }catch(IOException e){
                logger.error("Errore durante la scrittura del file", e);
            }
        });
    }

    @Override
    public void load() {

File f = new File(STORAGE);
try{
    var l = FileUtils.readLines(f, StandardCharsets.ISO_8859_1);
    List<String> newArr = new ArrayList<>();
    for(int i = 0; i<l.size();i++){
        var s = l.get(i).split(",");
        newArr.add(Arrays.toString(s));
        System.out.println(newArr);
    }
}catch (IOException e){
    logger.error("Errore durante la lettura del file", e);
}
    }
}
