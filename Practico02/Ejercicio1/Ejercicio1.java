package Practico02.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args){
        //Creo una serie
        Serie serie1 = new Serie("The Walking Dead", 3, "Matan zombies", "Agustin", "Suspenso");
        // Creo un arreglo de objetos que va a contener todas las temporadas   
        serie1.arrTemporadas[0].setCantEp(5);
        System.out.println(serie1.arrTemporadas[0].getCantEp());
        System.out.println(serie1.arrTemporadas[1].getCantEp());
    }   
}
