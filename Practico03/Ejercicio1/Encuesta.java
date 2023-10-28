package Practico03.Ejercicio1;
import java.util.ArrayList;
public class Encuesta {
    private ArrayList<String> preguntas = new ArrayList<>();
    private String nomP, nomE;
    private int dniP, dniE, pos;
    Encuesta(String nomP, String nomE, int dniP, int dniE){
        this.nomP = nomP;
        this.nomE = nomE;
        this.dniP = dniP;
        this.dniE = dniE;
        this.pos = 0;
    }
    //Getter y Setters
    public String getNomP(){
        return this.nomP;
    }
    public String getNomE(){
        return this.nomE;
    }
    public int getDniP(){
        return this.dniP;
    }
    public int getDniE(){
        return this.dniE;
    }
    //Metodos
    public void agregarPregunta(String pregunta){
        if(pregunta != "" && pregunta != null){
            pregunta = preguntas.get(pos);
            this.pos++;
        }
        else{
            System.out.println("Error. Intente de nuevo");
        }
    }
    public void imprimirPreguntas(){
        for(int i = 0; i < preguntas.size(); i++){
            System.out.println(preguntas.get(i));
        }
    }
     
}
