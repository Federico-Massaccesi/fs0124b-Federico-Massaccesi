package servizi;

import it.epicode.Prodotti;

import java.util.List;
import java.util.Optional;

public interface Funzionalità {

    void addProdotto(Prodotti prodotto);

    void removeByISBN(Integer ISBN);

    Optional<Prodotti> getByISBN(Integer ISBN);

    List<Prodotti> getByAnnoPubblicazione(Integer annoPubblicazione);

    List<Prodotti> getByAutore(String autore);

    void save();

    void load();
}
