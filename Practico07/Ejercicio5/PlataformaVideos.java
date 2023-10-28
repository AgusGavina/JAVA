package Practico07.Ejercicio5;

import java.util.ArrayList;

public class PlataformaVideos {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void addPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void imprimirToStrings(ArrayList<Pelicula> arr) {
        for (Pelicula pelicula : arr) {
            System.out.println(pelicula.toString());
        }
    }

    // Buscadores
    public void buscarPorTitulo(String tituloConsulta) {
        ArrayList<Pelicula> peliculasDeInteres = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(tituloConsulta)) {
                peliculasDeInteres.add(pelicula);
            }
        }
        if (peliculasDeInteres.size() > 0) {
            imprimirToStrings(peliculasDeInteres);
        } else {
            System.out.println("No se encontro ninguna pelicula con esa caracteristica");
        }
    }

    public void buscarPorGenero(String generoConsultado) {
        ArrayList<Pelicula> peliculasDeInteres = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            boolean var = false;
            for (String genero : pelicula.getGeneros()) {
                if (var == false && genero == generoConsultado) {
                    peliculasDeInteres.add(pelicula);
                    var = true;
                }
            }
        }
        if (peliculasDeInteres.size() > 0) {
            imprimirToStrings(peliculasDeInteres);
        } else {
            System.out.println("No se encontro ninguna pelicula con esa caracteristica");
        }
    }

    public void buscadorPorActorPeroNoDirector(String actorConsulta, String directorConsulta){
        ArrayList<Pelicula> peliculasDeInteres = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            boolean seEncontroActorNoDeseado = false;
            for (String actor : pelicula.getActores()) {
                if(actor == actorConsulta && seEncontroActorNoDeseado != false){
                    for (String director : pelicula.getDirectores()) {
                        if(director != directorConsulta){
                            peliculasDeInteres.add(pelicula);
                        }
                        else{
                            seEncontroActorNoDeseado = true;
                        }
                    }
                }
            }
            if (seEncontroActorNoDeseado != false) {
                int ultPos = peliculasDeInteres.size() - 1;
                peliculasDeInteres.remove(ultPos);
            }
        }
        if (peliculasDeInteres.size() > 0) {
            imprimirToStrings(peliculasDeInteres);
        } else {
            System.out.println("No se encontro ninguna pelicula con esa caracteristica");
        }
    }

    public void buscadorPoranioYminutoMenores(int anioConsulta, int duracionConsulta){
        ArrayList<Pelicula> peliculasDeInteres = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getAnioEstreno() < anioConsulta && pelicula.getDuracion() < duracionConsulta) {
                peliculasDeInteres.add(pelicula);
            }
        }
        if (peliculasDeInteres.size() > 0) {
            imprimirToStrings(peliculasDeInteres);
        } else {
            System.out.println("No se encontro ninguna pelicula con esa caracteristica");
        }
    }

    // CEO
    public void CEO(Pelicula pelicula){
        boolean condicion1 = true;
        boolean condicion2 = true;
        if(pelicula.getDuracion() < 120){
            for (String genero : pelicula.getGeneros()) {
                if(genero == "Comedia"){
                    condicion1 = false;
                }
            }
        }
        if(pelicula.getAnioEstreno() > 2017){
            for (String genero : pelicula.getGeneros()) {
                if(genero == "infantil" || genero == "documental"){
                    condicion1 = false;
                }
            }
        }
        if(condicion1 == true && condicion2 == true){
            System.out.println("La pelicula es recomendable");
        }
        else{
            System.out.println("La pelicula NO es recomendable");
        }
    }
}
