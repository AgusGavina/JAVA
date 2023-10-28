package Practico03.Ejercicio1;

public class Persona {
    private String nombre;
    private int dni;
    private final int MINDNI = 20000000;
    private final int MAXDNI = 99999999;
    //Constructor
    public Persona(String nom, int dni){
        setNombre(nom);
        setDni(dni);
    }
    //Getters y Setters
    public String getNombre(){
        return this.nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public void setNombre(String nombre){
        if(nombre != " " && nombre != null){
            this.nombre = nombre;
        }
    }
    public void setDni(int dni){
        if(dni >= this.MINDNI && dni <= this.MAXDNI){
            this.dni = dni;
        }
    }
    //Metodos
    
}
