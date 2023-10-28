package Practico04.Ejercicio4;

public class Main {
    public static void main(String [] args){
        Contingente p1 = new Contingente(null, null, 0, 2001, 1, 1, null);
        // Futbolista p2 = new Futbolista(null, null, 0, 0, 0, 0, null, null, false, false, 0);
        // Entrenador p3 = new Entrenador(null, null, 0, 0, 0, 0, null, 0);
        // Masajista p4 = new Masajista(null, null, 0, 0, 0, 0, null, null, 0);
        
        System.out.println(p1.estaParaEvento());
    }
}
