package ej2_04;

public class Ropa extends Producto {

    private final int impuesto = 21;
    private final int descuento = 5;

    public Ropa(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.getPrecioBase() * 0.95;
    }
}
