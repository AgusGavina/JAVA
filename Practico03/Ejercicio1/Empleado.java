package Practico03.Ejercicio1;

public class Empleado extends Persona{
    private int cantEncReal;
    //Constructor
    public Empleado(String nom, int dni){
        super(nom, dni);
        this.cantEncReal = 0;
    }
    //Getters y Setters
    public int getCantEncReal(){
        return this.cantEncReal;
    }
    public void sumarUno(){
        this.cantEncReal++;
    }
    
}
