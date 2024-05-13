package it.epicode.G1.elements;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Pizza extends Prodotti {

    private List<Toppings> ingredientiPizza;

    public Pizza(String informazioniNutrizionali, double prezzo, List<Toppings> ingredientiPizza) {
        super(prezzo,informazioniNutrizionali);
        this.ingredientiPizza = new ArrayList<>();
        ingredientiPizza.add(new Toppings(2.5,"fefwfew", "pomodoro"));
        ingredientiPizza.add(new Toppings(2.0,"pefkpkfe", "mozzarella"));
    }
    public Pizza( String informazioniNutrizionali, double prezzo) {
        super(prezzo,informazioniNutrizionali);
        this.ingredientiPizza = new ArrayList<>();
        ingredientiPizza.add(new Toppings(2.5,"fefwfew", "pomodoro"));
        ingredientiPizza.add(new Toppings(2.0,"pefkpkfe", "mozzarella"));
    }

    public Pizza() {
    }

    public List<Toppings> getIngredientiPizza() {
        return ingredientiPizza;
    }

    public void setIngredientiPizza(List<Toppings> ingredientiPizza) {
        this.ingredientiPizza = ingredientiPizza;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                ", prezzo=" + (super.getPrezzo()) +
                ", informazioniNutrizionali='" + (super.getInformazioniNutrizionali()) + '\'' +
                "ingredientiPizza=" + ingredientiPizza +
                '}';
    }
}
