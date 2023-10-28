package Practico05.Ejercicio2;
import java.util.ArrayList;
public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<String> familiares;
    private Casa casa;

    public Alumno(String nombre, Casa casa) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.casa = casa;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null && nombre != ""){
            this.nombre = nombre;
        }
    }

    // Agregar cualidades del alumno
    public void agregarCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    // Agregar familiar del alumno
    public void agregarFamiliar(String nombreFamiliar) {
        familiares.add(nombreFamiliar);
    }

    // Obtener la casa del alumno
    public String getCasa() {
        return this.casa.getNombre();
    }

    // Obtener las cualidades del alumno
    public ArrayList<String> getCualidades() {
        return this.cualidades;
    }

    // Obtener los familiares del alumno
    public ArrayList<String> getFamiliares() {
        return this.familiares;
    }

    // Imprimir cualquier ArrayList<String>
    public String getArrayListText(ArrayList<String> arrlist){
        String text = "";
        for(int i = 0; i < arrlist.size(); i++){
            text = text + arrlist.get(i) + " ";
        }
        return text;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nCasa: "+getCasa()+"\nCualidades: "+getArrayListText(this.cualidades)+"\nFamiliares: "+getArrayListText(this.familiares);
    }
}
