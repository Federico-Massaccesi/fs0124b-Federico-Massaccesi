package org.example;

import it.epicode.Evento;
import it.epicode.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        final Logger logger = LoggerFactory.getLogger(Main.class);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

        EntityManager em = emf.createEntityManager();

        List<Evento> listaEventi = new ArrayList<>();


        var ev1 = new Evento("Evento 1", new Date(), "Descrizione evento 1", TipoEvento.PUBBLICO,20000);

        var ev2 = new Evento("Evento 2", new Date(), "Descrizione evento 1", TipoEvento.PUBBLICO,20000);

        listaEventi.add(ev1);
        listaEventi.add(ev2);

        try{
            EntityTransaction trans = em.getTransaction();

            trans.begin();

            listaEventi.stream().forEach(ev -> em.persist(ev));

            trans.commit();

            em.close();
            emf.close();



        }catch (Exception e){
            logger.error(e.getMessage());
        }


    }
}