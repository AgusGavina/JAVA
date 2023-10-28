package Practico07.Ejercicio1;
import java.util.ArrayList;
public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivos = new ArrayList<>();
    private ArrayList<Enfermedad> enfermedadesQueCura = new ArrayList<>();
    public ProductoQuimico(String nombre){
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
    //ArrayLists
    public void addCultivo(Cultivo c){
        this.cultivos.add(c);
    }
    public void addEnfermedad(Enfermedad e){
        this.enfermedadesQueCura.add(e);
    }
    
}