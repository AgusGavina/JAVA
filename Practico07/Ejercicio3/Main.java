package Practico07.Ejercicio3;

public class Main {
    public static void main(String [] args){
        Planta p1 = new Planta("Epipremnum aureum", "Epipremnum", ": Araceae", "Monocotyledoneae", "Planta de interior", 3, 4);
        p1.addNombresVulgares("potus");
        p1.addNombresVulgares("photos");
        p1.addNombresVulgares("potos");
        System.out.println(p1.toString());
        
    }
}
