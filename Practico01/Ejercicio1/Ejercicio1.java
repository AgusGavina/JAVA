package Practico01.Ejercicio1;

public class Ejercicio1 {
    public static void main(String [] args){
        Persona p1 = new Persona();
        System.out.println(p1.getFechaNac());
        System.out.println(p1.getEdad());
        p1.setFechaNac(2004, 02, 04);
        System.out.println(p1.getFechaNac());
        System.out.println(p1.getEdad());
    }
}
