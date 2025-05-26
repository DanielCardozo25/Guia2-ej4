package ej2_04;

import java.util.ArrayList;

public class CarritoDeCompras {

    private ArrayList<Producto> listaProd;

    public CarritoDeCompras(ArrayList<Producto> c) {
        this.listaProd = c;
    }

    public void CalculoTotaldeCompra() {
        double aux = 0;
        for (int i = 0; i < listaProd.size(); i++) {
            Producto prod = listaProd.get(i);
            aux += prod.calcularPrecioFinal();
            System.out.println(prod.getNombre() + "|| "
                    + prod.getMarca() + "|| "
                    + prod.getPrecioBase() + "|| "
                    + prod.calcularPrecioFinal());
        }
        System.out.println("\nIVA(Incluido en el precio): 21% || Ropa -5% || Electrodomestico -10%"
                + "\n\nCosto total de la compra: " + aux);
    }
}
