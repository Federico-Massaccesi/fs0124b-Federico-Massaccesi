package es.g4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        Dipendente d1 = new Dipendente(1234, 25, new String[]{"PRODUZIONE"});

        d1.setDipartimento("AMMINISTRAZIONE");

        System.out.println(d1.getDipartimento());

        Dipendente d2 = new Dipendente(5678, 35, new String[]{"AMMINISTRAZIONE"});

        Dipendente d3 = new Dipendente(91011, 50, new String[]{"VENDITE"});

        Dipendente[] allD = new Dipendente[]{d1, d2, d3};

        for (Dipendente dipendente : allD) {

            System.out.println(dipendente.getMatricola());
        }
        */
        //ES2

        DipendenteFullTime dFull = new DipendenteFullTime(1234, 25, new String[]{"PRODUZIONE"});

        DipendentePartTime dPart = new DipendentePartTime(5678, 35,new String[]{"PRODUZIONE"});

        Dirigente dDir = new Dirigente(91011, 50, new String[]{"VENDITE"});

        Dipendente[] allD2 = new Dipendente[]{dFull, dPart, dDir};

        for (int i = 0; i < allD2.length; i++){

            int sommaStipendi =+allD2[i].calculateSalary();
            if(i == (allD2.length -1) ) {
                System.out.println("La somma dei salari è:" +sommaStipendi);
            }
        }
    }
}
