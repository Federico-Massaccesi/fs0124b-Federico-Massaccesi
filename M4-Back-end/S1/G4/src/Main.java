import es.g4.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente(1234, 25, new String[]{"PRODUZIONE"});

        d1.setDipartimento("AMMINISTRAZIONE");

        System.out.println(d1.getDipartimento());

        Dipendente d2 = new Dipendente(5678, 35, new String[]{"AMMINISTRAZIONE"});

        Dipendente d3 = new Dipendente(91011, 50, new String[]{"VENDITE"});

        Dipendente[] allD = new Dipendente[]{d1, d2, d3};

        for (int i = 0; i < allD.length; i++) {

            System.out.println(allD[i].getMatricola());
        }
    }
}
