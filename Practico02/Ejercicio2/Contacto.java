package Practico02.Ejercicio2;

public class Contacto {
    private String nombre, telefono, correo;

    //Constructor
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    //Getters y Setters
    public void setCorreo(String correo){
        if(correo != null && correo != ""){
            this.correo = correo;
        }
    }
    public void setTelefono(String telefono){
        if(telefono != null && telefono != ""){
            this.telefono = telefono;
        }
    }
    public void setNombre(String nombre){
        if(nombre != null && nombre != ""){
            this.nombre = nombre;
        }
    }
    public String getMail(){
        return this.correo;
    }
    public String getNroTel(){
        return this.telefono;
    }
    public String getNombre(){
        return this.nombre;
    }
}
