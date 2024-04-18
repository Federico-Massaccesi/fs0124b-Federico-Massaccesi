package es.g4;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(int matricola, int stipendio, String[] dipartimento) {

        super(matricola, stipendio, dipartimento);

    }

    public int calculateSalary(){

        return this.getStipendio();
    }
}
