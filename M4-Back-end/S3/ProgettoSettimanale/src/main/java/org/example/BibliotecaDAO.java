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

        em.getTransaction().begin();
        em.persist(prod);
        em.getTransaction().commit();
    }

    @Override
    public void removeByISBN(Integer ISBN) {


    }

    @Override
    public Optional<Prodotti> getByISBN(Integer ISBN) {

        try {
            var query = em.createNamedQuery("GET_BY_ISBN");

            query.setParameter("ISBN", ISBN);

//            return query.getResultList().get(0);


        }catch (Exception e) {

        }

    }

    @Override
    public Prodotti getByAnno(Integer anno) {
        return null;
    }

    @Override
    public List<Prodotti> getByAutore(String autore) {
        return List.of();
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
