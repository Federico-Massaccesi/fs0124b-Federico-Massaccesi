package org.example;

import it.epicode.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EventoDAO implements EventoInterface {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Sample");

    static EntityManager em = emf.createEntityManager();

    static final Logger logger = LoggerFactory.getLogger(EventoDAO.class);

    @Override
    public void save(Evento ev) {

        em.persist(ev);
    }


    public void getById(Integer id) {

//        return em.find(Evento.class, id);
    }

    @Override
    public void delete(Evento ev) {

        em.remove(ev);
    }
}
