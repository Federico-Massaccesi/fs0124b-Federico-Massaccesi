package it.epicode;

public abstract class  Prodotti{

    private static Integer ISBN = 1;

    private Integer newISBN;

    private String titolo;

    private Integer annoPubblicazione;

    private Integer numeroPagine;

    public Prodotti( String titolo, Integer annoPubblicazione, Integer numeroPagine){

        this.newISBN = ISBN;

        this.ISBN++;

        this.titolo = titolo;

        this.annoPubblicazione = annoPubblicazione;

        this.numeroPagine = numeroPagine;

    }

    public  Integer getNewISBN() {
        return newISBN;
    }

    public  void setNewISBN(Integer newISBN) {
       this.newISBN = newISBN;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }


}
