package it.epicode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import servizi.FunzionalitàArchivio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);


        Libri libro1 = new Libri( "paolo",  2012,  1226,  "paolo", "horror");

        Libri libro2 = new Libri( "chiara",  2021,  1226,  "paolo", "horror");

        Riviste riv1 = new Riviste("Chi", 2012, 1226, Periodicità.MENSILE);
        FunzionalitàArchivio archivio = new FunzionalitàArchivio();

        archivio.addProdotto(libro1);
        archivio.addProdotto(libro2);
        archivio.addProdotto(riv1);

    archivio.load();
    }
}