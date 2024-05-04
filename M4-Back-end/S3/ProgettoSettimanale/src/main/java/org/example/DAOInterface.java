package org.example;

import it.biblioteca.data.Prestito;
import it.biblioteca.prodotti.Prodotti;

import java.util.List;
import java.util.Optional;

public interface DAOInterface {

    public void save(Prodotti prod);

    public void removeByISBN(Integer ISBN);

    public Optional<Prodotti> getByISBN(Integer ISBN);

    public List<Prodotti> getByAnno(Integer anno);

    public List<Prodotti > getByAutore(String autore);

    public Prodotti getByTitolo(String titolo);

    public List<Prodotti> getElementiInPrestito(Integer numeroTessera);

    public List<Prestito> getPrestitiScadutiNonRestituiti();


}
