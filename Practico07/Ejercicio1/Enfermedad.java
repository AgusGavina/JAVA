package Practico07.Ejercicio1;
import java.util.ArrayList;
public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos = new ArrayList<>();
    public Enfermedad (String nombre){
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
    public void addEstadoPatologico(String e){
        this.estadosPatologicos.add(e);
    }
}
