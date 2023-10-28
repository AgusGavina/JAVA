package Practico02.Ejercicio2;

import java.time.LocalDate;

public class Reunion {
    private String lugar, tema;
    private int duracionMinutos, cantPresentes;
    LocalDate fecha = LocalDate.of(2000, 01, 01);

    //Constructor
    public Reunion(){

    }

    // Getters y Setters
    public void setLugar(String lugar){
        if(lugar != null && lugar != ""){
            this.lugar = lugar;
        }
    }
    public void setTema(String tema){
        if(tema != null && tema != ""){
            this.tema = tema;
        }
    }
    public void setDuracionMinutos(int duracionMinutos){
        if(duracionMinutos > 0){
            this.duracionMinutos = duracionMinutos;
        }
    }
    public void setPresente(boolean presente){
        if(presente == false && cantPresentes != 0){
            this.cantPresentes--;
        }
        else{
            this.cantPresentes++;
        }
    }
}
