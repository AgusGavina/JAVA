package Practico07.Ejercicio5;
import java.util.ArrayList;
public class Pelicula {
    private String titulo, sinopsis;
    private int anioEstreno, edadMinVerPelicula, duracion;
    private ArrayList<String> generos;
    private ArrayList<String> directores;
    private ArrayList<String> actores;

    public Pelicula(String titulo, String sinopsis, int anioEstreno, int edadMinVerPelicula, int duracion){
        setTitulo(titulo);
        setSinopsis(sinopsis);
        setAnioEstreno(anioEstreno);
        setEdadMinVerPelicula(edadMinVerPelicula);
        setDuracion(duracion);
        this.generos = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
    }
    // Getters
    public String getTitulo() {
        return this.titulo;
    }
    public String getSinopsis() {
        return this.sinopsis;
    }
    public int getAnioEstreno() {
        return this.anioEstreno;
    }
    public int getEdadMinVerPelicula() {
        return this.edadMinVerPelicula;
    }
    public int getDuracion() {
        return this.duracion;
    }
    public ArrayList<String> getActores() {
        return this.actores;
    }
    public ArrayList<String> getDirectores() {
        return this.directores;
    }
    public ArrayList<String> getGeneros() {
        return this.generos;
    }
    //Setters
    public void setTitulo(String titulo) {
        if(titulo != null){
           this.titulo = titulo; 
        }
    }
    public void setSinopsis(String sinopsis){
        if(sinopsis != null){
            this.sinopsis = sinopsis;
        }
    }
    public void setAnioEstreno(int anioEstreno){
        if(anioEstreno > 1894){
            this.anioEstreno = anioEstreno;
        }
    }
    public void setEdadMinVerPelicula(int edadMinVerPelicula){
        if(edadMinVerPelicula > 0){
            this.edadMinVerPelicula = edadMinVerPelicula;
        }
    }
    public void setDuracion(int duracion){
        if(duracion > 0){
            this.duracion = duracion;
        }
    }
    //ArrayList
    public void addElementArrayList(ArrayList<String> arr, String element){
        arr.add(element);
    }
    public String imprimirArrayList(ArrayList<String> arr){
        String text = null;
        for(String element : arr){
            text = text + element + " - ";
        }
        return text;
    }

    @Override
    public String toString(){
        return "Nombre: "+getTitulo()+"\nSinopsis: "+getSinopsis()+"\nDirector/es: "+imprimirArrayList(directores)+"\nGenero/s"+imprimirArrayList(generos)+"\nActores: "+imprimirArrayList(actores)+"\nEdad minima para ver la pelicula: "+getEdadMinVerPelicula();
    }
}
