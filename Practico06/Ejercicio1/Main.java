package Practico06.Ejercicio1;

public class Main {
    public static void main(String [] args){
        //Clientes
        Cliente c1 = new Cliente("Agustin", "2494000674", 2222, 2, 2);
        Cliente c2 = new Cliente("carlos", "2494000674", 2222, 2, 2);
        //Productos
        Pelicula pelicula1 = new Pelicula("El lobo de Wall Street", 2, "Guillermo del Toro", "Guilermo del Toro", "Tom Hanks");
        
        pelicula1.addArrendatario(c1);
        pelicula1.removeArrendatario(0);

        //System.out.println(pelicula1.toString());
    }
}
