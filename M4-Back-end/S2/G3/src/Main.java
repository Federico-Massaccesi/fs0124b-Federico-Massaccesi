import it.epicode.Product;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Long productId = 1L;

        List<Product> lista = new ArrayList<>();

        Product p1 = new Product(1, "Prodotto 1", "Books", 110.);

        Product p2 = new Product(1, "Prodotto 2", "Books", 10.);
    }
}