package ej2_04;

public class Ropa extends Producto {

    private final int impuesto = 21;
    private final int descuento = 5;

    public Ropa(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public void calcularPrecioFinal() {
        System.out.println("\nArticulo: " + super.getNombre()
                + "\nMarca: " + super.getMarca()
                + "\nPrecio final(+IVA:21% -5% OFF): " + (super.getPrecioBase() * 1.21) * 0.95);
    }
}
