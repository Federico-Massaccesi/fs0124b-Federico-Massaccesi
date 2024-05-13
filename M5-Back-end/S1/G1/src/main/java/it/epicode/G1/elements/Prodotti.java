package it.epicode.G1.elements;

public abstract class Prodotti {

    private double prezzo;

    private String informazioniNutrizionali;

    public Prodotti(double prezzo, String informazioniNutrizionali) {
        this.prezzo = prezzo;
        this.informazioniNutrizionali = informazioniNutrizionali;
    }

    public Prodotti() {
    }

    public String getInformazioniNutrizionali() {
        return informazioniNutrizionali;
    }

    public void setInformazioniNutrizionali(String informazioniNutrizionali) {
        this.informazioniNutrizionali = informazioniNutrizionali;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "prezzo=" + prezzo +
                ", informazioniNutrizionali='" + informazioniNutrizionali + '\'' +
                '}';
    }
}
