package ej2_04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("TIENDA ONLINE\n"
                + "Articulo || Marca || Precio || Precio con descuento\n");

        ArrayList<Producto> prod = new ArrayList();

        prod.add(new Electrodomestico("Horno", 1000, "Sanyo"));
        prod.add(new Ropa("Remera", 100, "Mistral"));
        prod.add(new Electrodomestico("TV", 1800, "Samsung"));
        prod.add(new Ropa("Jean", 250, "Levi"));

        CarritoDeCompras c = new CarritoDeCompras(prod);
        c.CalculoTotaldeCompra();

    }

}
