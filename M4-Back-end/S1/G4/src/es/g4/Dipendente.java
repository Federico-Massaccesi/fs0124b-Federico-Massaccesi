package es.g4;

public abstract class Dipendente {

    private int matricola;

    private int stipendio;

    private String[] dipartimento = {"PRODUZIONE","AMMINISTRAZIONE","VENDITE"};

    public Dipendente(int mat, int st, String[] d){

        matricola = mat;

        stipendio= st;

        dipartimento = d;

    }

    public String[] setDipartimento(String newDip){

        return dipartimento = new String[] {newDip};
    }

    public int getMatricola(){

        return matricola;

    }

    public int getStipendio(){

        return stipendio;
    }

    public String getDipartimento() {

         String dip = dipartimento[0];

         return dip;
    }

    public int calculateSalary(){
        return this.getStipendio();
    };



}
