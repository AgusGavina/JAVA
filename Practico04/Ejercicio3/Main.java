package Practico04.Ejercicio3;

public class Main {
    public static void main(String [] args){
        EmpleadoContratado e1 = new EmpleadoContratado(200);
        EmpleadoXHoraExtra e2 = new EmpleadoXHoraExtra(5, 20, 200);
        EmpleadoXComicion e3 = new EmpleadoXComicion(2, 500, 200);
        System.out.println(e1.getSalario()+" "+e2.getSalario()+" "+e3.getSalario());
    }
}
