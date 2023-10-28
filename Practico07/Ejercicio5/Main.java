package Practico07.Ejercicio5;

public class Main {
    public static void main(String [] args){
        Pelicula p1 = new Pelicula("El lobo de Wall Street", "Algo de texto", 2012, 12, 123);
        p1.addElementArrayList(p1.getDirectores(), "Guillermo del toro");
        p1.addElementArrayList(p1.getGeneros(), "Terror");
    }
}
