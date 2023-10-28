package Practico04.Ejercicio1;

public class Principal {
    public static void main(String [] args){
        Alarma a = new Alarma(false, false, false, false);
        AlarmaLuminosa b = new AlarmaLuminosa(false, false, false, false);
        b.senalSonora();
        b.setBW(true);
        b.senalSonora();

    }
}
