package Practico02.Ejercicio1;

public class Capitulo {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    //Valores iniciales
    public Capitulo(){
        this.titulo = "Nombre del capitulo";
        this.descripcion = "Descripcion del capitulo";
        this.visto = false;
        this.calificacion = -1;
    }
    //Metodos get
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public boolean getVisto(){
        return this.visto;
    }
    public int getCalificacion(){
        return this.calificacion;
    }
    //Metodos set
    public void setTitulo(String titulo){
       this.titulo = titulo; 
    }
    public void setDescripcion(String descripcion){
       this.descripcion = descripcion; 
    }
    public void setVisto(boolean visto){
       this.visto = visto; 
    }
    public void setCalificacion(int calificacion){
        if(calificacion >= 1 && calificacion <= 5){
            this.calificacion = calificacion; 
        }
        else{
            System.out.println("El valor ingresado no es correcto, tiene que ser un numero entre 1 y 5");
        }
    }
}
