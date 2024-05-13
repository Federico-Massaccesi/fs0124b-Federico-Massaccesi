package it.epicode.G1.elements;

public class Toppings extends Prodotti {

    private String nomeIngrediente;

    public Toppings(double prezzo,String informazioniNutrizionali, String nomeIngrediente) {
        super(prezzo, informazioniNutrizionali);
        this.nomeIngrediente = nomeIngrediente;
    }

    public Toppings() {
    }


    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "prezzo=" + super.getPrezzo() +
                ", informazioniNutrizionali=" + super.getInformazioniNutrizionali() +
                ", nomeIngrediente=" + nomeIngrediente +
                '}';
    }
}
