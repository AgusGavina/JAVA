package Practico04.Ejercicio3;

public class EmpleadoContratado {
    private double salario;
    public EmpleadoContratado(double s){
        setSalario(s);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double s){
        if(s > 0){
            this.salario = s;
        }
    }
}
