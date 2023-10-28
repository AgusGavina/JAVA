package Practico06.Ejercicio1;
import java.util.ArrayList;
public abstract class Producto {
    // Atributos
    private String nombre;
    private ArrayList <Cliente> arrendatarios = new ArrayList<>();
    private int copiasDisponibles, contCopias;
    // Constructor
    public Producto(String nombre, int copiasDisponibles){
        setNombre(nombre);
        setCopiasDisponibles(copiasDisponibles);
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getCopiasDisponibles() {
        return this.copiasDisponibles;
    }
    //Setters
    public void setCopiasDisponibles(int copiasDisponibles) {
        if(copiasDisponibles > 0){
            this.copiasDisponibles = copiasDisponibles;
            this.contCopias = copiasDisponibles;
        }
    }
    public void setNombre(String nombre) {
        if(nombre != null){
          this.nombre = nombre;  
        }
    }
    // ArrayList
    public String getArrendarios(){
        String text = "";
        for(Cliente cliente : this.arrendatarios){
            text += cliente.toString();
        }
        return text;
    }
    public void addArrendatario(Cliente arrendatario){
        if(this.contCopias >= 1){
            arrendatarios.add(arrendatario);
            this.contCopias--;
        }
        else{
            System.out.println("Error. No hay mas copias para alquilar");
        }
    }
    public void removeArrendatario(int posCliente){
        if(this.contCopias < this.copiasDisponibles){
            this.arrendatarios.remove(posCliente);
            this.contCopias++;
        }
        else{
            System.out.println("Error. Ya estan todas las copias en la casa");
        }
    }

    @Override
    public String toString(){
        return "\nDatos Arrendatario/s: "+getArrendarios()+"\nCopias disponibles: "+getCopiasDisponibles();
    }
}
