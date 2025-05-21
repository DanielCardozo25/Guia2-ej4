package ej2_04;

public class Electrodomestico extends Producto{
    
    private final int impuesto=21;
    private final int descuento=10;

    public Electrodomestico(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }
    
    @Override
    public void calcularPrecioFinal(){
        System.out.println("\nArticulo: " + super.getNombre()
                + "\nMarca: " + super.getMarca()
                + "\nPrecio final(+IVA:21%, -10% OFF): " + (super.getPrecioBase()*1.21)*0.9);
    }
}
