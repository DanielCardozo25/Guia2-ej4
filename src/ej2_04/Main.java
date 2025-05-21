package ej2_04;

public class Main {

    public static void main(String[] args) {
        Producto n1 = new Electrodomestico("horno",1000,"Sanyo");
        Producto n2 = new Ropa("Remera",100,"Mistral");
        
        n1.calcularPrecioFinal();
        n2.calcularPrecioFinal();
    }
    
}
