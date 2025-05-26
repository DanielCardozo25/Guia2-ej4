package ej2_04;

public class Electrodomestico extends Producto {

    private final int impuesto = 21;
    private final int descuento = 10;

    public Electrodomestico(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.getPrecioBase() * 0.9;
    }
}
