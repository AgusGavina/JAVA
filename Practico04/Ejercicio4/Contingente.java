package Practico04.Ejercicio4;
import java.time.LocalDate;
public class Contingente {
    //Atributos
    private String nombre, apellido, estado;
    private int nroPasaporte;
    private LocalDate fechaNac;
    //Contructor
    public Contingente (String n, String a, int np, int y, int m, int d, String e){
        setNombre(n);
        setApellido(a);
        setNroPas(np);
        setFechaNac(y, m, d);
        setEstado(e);
    }
    //Setters
    public void setNombre(String n){
        if(n != null && n != ""){
            this.nombre = n;
        }
    }
    public void setApellido(String a){
        if(a != null && a != ""){
            this.apellido = a;
        }
    }
    public void setEstado(String e){
        if(e != null && e != ""){
            this.estado = e;
        }
    }
    public void setNroPas(int np){
        if(np > 0){
            this.nroPasaporte = np;
        }
    }
    public void setFechaNac(int y, int m, int d){
        fechaNac = LocalDate.of(y, m, d);
    }
    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getNroPasaporte() {
        return this.nroPasaporte;
    }
    public LocalDate getFechaNac() {
        return this.fechaNac;
    }
    public String getEstado() {
        return this.estado;
    }
    //Metodos
    public boolean estaParaEvento(){
        if(getEstado() == "En pais de origen"){
            return true;
        }
        else{
            return false;
        }
    }
}
