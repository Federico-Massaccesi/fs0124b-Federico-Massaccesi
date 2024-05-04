package org.example;

import it.biblioteca.prodotti.Libri;
import it.biblioteca.prodotti.Periodicita;
import it.biblioteca.prodotti.Riviste;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);

        var dao = new BibliotecaDAO();

        var libro1 = new Libri("libro dell", 120, 2018,"fausto", "horror");


        dao.save(libro1);

        System.out.println(dao.getByAutore("mario"));
    }



}