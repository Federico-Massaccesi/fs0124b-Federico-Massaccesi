//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
//ES1
    Rettangolo rettangolo1 = new Rettangolo(2,6);
        System.out.println(rettangolo1.getArea());

        System.out.println(rettangolo1.getPerimetro());

        Rettangolo rettangolo2 = new Rettangolo(10,12);

        rettangolo1.stampaRettangoli(rettangolo1);

        rettangolo1.stampaDueRettangoli(rettangolo1,rettangolo2);

        //////////////////////////////////////////////////////////////////////////

        //ES2

        Sim sim1 = new Sim(3662556652L);

        sim1.stampaDati(sim1);
    }
}