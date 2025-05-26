package ej2_04;

public class Producto implements Vendible {

    private String nombre;
    private int precioBase;
    private String marca;

    public Producto(String nombre, int precioBase, String marca) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public double calcularPrecioFinal() {

        return 0;
    }

}
