package Recuperatorio_Tema_1;
import java.util.ArrayList;
public class Elemento {
    private String nombre;
    private double peso, precio;
    protected ArrayList<String> categorias;
    public Elemento(String nombre){
        setNombre(nombre);
    }
    public void setNombre(String nombre){
        if(nombre != null){
            this.nombre = nombre;
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getPrecio(){
        return this.precio;
    }
    public ArrayList<String> getCategorias(){
        return this.categorias;
    }
}
