import java.util.Arrays;

public class Sim {

    private long numeroTelefono;

    private float creditoDisponibile;

    private long[] cronologiaChiamate;

    public Sim(long n) {

        numeroTelefono = n;

        creditoDisponibile = 0;

        cronologiaChiamate = new long[0];
    }

    public void stampaDati(Sim x){
        System.out.println(x.numeroTelefono);
        System.out.println(x.creditoDisponibile+"€");
        System.out.println(Arrays.toString(x.cronologiaChiamate));
    }

    public void getDatiChiamata(long numeroEntrante){

        System.out.println(numeroEntrante);


    }
}
