package es.g4;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int mat, int st, String[] d) {
        super(mat, st, d);
    }

    public int calculateSalary(int ore,int euroOra){

        return ore*euroOra;
    }
}
