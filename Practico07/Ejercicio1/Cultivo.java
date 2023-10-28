package Practico07.Ejercicio1;
import java.util.ArrayList;
public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedades = new ArrayList<>();
    public Cultivo (String nombre){
        setNombre(nombre);
    }
    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;  
        }
    }
    //ArrayList
    public void addEnfermedad(Enfermedad e){
        this.enfermedades.add(e);
    }
}
