package org.example;

import it.biblioteca.data.Prestito;
import it.biblioteca.prodotti.Prodotti;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Optional;


public class BibliotecaDAO implements DAOInterface {

    private static final Logger logger = LoggerFactory.getLogger(BibliotecaDAO.class);

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");

    protected EntityManager em = emf.createEntityManager();

    @Override
    public void save(Prodotti prod) {

        var transaction = em.getTransaction();

        transaction.begin();

        em.persist(prod);

        transaction.commit();
    }

    @Override
    public void removeByISBN(Integer ISBN) {


    }

    @Override
    public Optional<Prodotti> getByISBN(Integer ISBN) {

        try {
            var query = em.createNamedQuery("GET_BY_ISBN");

            query.setParameter("ISBN", ISBN);

            var prod = (Prodotti) query.getSingleResult();

                return Optional.of(prod);

        }catch (Exception e) {
            logger.error("Elemento con ISBN specificato inesistente", e);
            return Optional.empty();
        }

    }

    @Override
    public List<Prodotti> getByAnno(Integer anno) {
        try {
            var query = em.createNamedQuery("GET_BY_ANNO");

            query.setParameter("AUTORE", anno);

            List<Prodotti> result = query.getResultList();

            return result;

        }catch (Exception e) {
            logger.error("Nessun libro uscito in questo anno nel catalogo", e);
            return null;
        }
    }

    @Override
    public List<Prodotti> getByAutore(String autore) {
        try {
            var query = em.createNamedQuery("GET_BY_AUTORE");

            query.setParameter("AUTORE", autore);

            List<Prodotti> result = query.getResultList();

            return result;

        }catch (Exception e) {
            logger.error("Elemento con ISBN specificato inesistente", e);
            return null;
        }
    }

    @Override
    public Prodotti getByTitolo(String titolo) {
        return null;
    }

    @Override
    public List<Prodotti> getElementiInPrestito(Integer numeroTessera) {
        return List.of();
    }

    @Override
    public List<Prestito> getPrestitiScadutiNonRestituiti() {
        return List.of();
    }
}
