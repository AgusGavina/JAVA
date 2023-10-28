package Practico06.Ejercicio1;
import java.time.LocalDate;
public class Cliente {
    //Atributos
    private String nombre, celular;
    private LocalDate fechaDevolucion;
    //Constructor
    public Cliente(String n, String c, int y, int m, int d){
        setNombre(n);
        setCelular(c);
        setFechaDevolucion(y, m, d);
    }
    // Getters
    public String getCelular() {
        return this.celular;
    }
    public String getNombre() {
        return this.nombre;
    }
    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    //Setters
    public void setCelular(String celular) {
        if(nombre != null){
            this.celular = celular;
        }
    }
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }
    public void setFechaDevolucion(int y, int m, int d) {
        this.fechaDevolucion = LocalDate.of(y, m, d);
    }
    // Metodos
    public void alquilar(Producto p){
        if(p.getCopiasDisponibles() > 0){
            
        }
    }

    @Override
    public String toString(){
        return "\n\tNombre: "+getNombre()+"\n\tCelular: "+getCelular()+"\n\tFecha de devolcion: "+getFechaDevolucion();
    }
}
