package es.g4;

public class Dirigente extends Dipendente {
    public Dirigente(int mat, int st, String[] d) {
        super(mat, st, d);
    }

    public int calculateSalary(){

        return this.getStipendio();
    }
}
