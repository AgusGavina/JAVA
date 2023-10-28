package Practico06.Ejercicio1;

public class Pelicula extends Producto {
    //Atributos
    private String director, guionista, actor;
    // Constructor
    public Pelicula(String nombre, int copiasDisponibles, String director, String guionista, String actor){
        super(nombre, copiasDisponibles);
        setDirector(director);
        setGuionista(guionista);
        setActor(actor);
    }
    // Getters
    public String getDirector() {
        return this.director;
    }
    public String getGuionista() {
        return this.guionista;
    }
    public String getActor() {
        return this.actor;
    }
    // Setters
    public void setDirector(String director){
        if(director != null){
            this.director = director;
        }
    }
    public void setGuionista(String guionista){
        if(guionista != null){
            this.guionista = guionista;
        }
    }
    public void setActor(String actor){
        if(actor != null){
            this.actor = actor;
        }
    }

    @Override
    public String toString(){
        return "Nombre del producto: "+getNombre()+"\nDirector: "+getDirector()+"\nGuionista: "+getGuionista()+"\nActor: "+getActor()+super.toString();
    }
}