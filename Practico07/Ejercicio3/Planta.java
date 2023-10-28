package Practico07.Ejercicio3;
import java.util.ArrayList;
public class Planta {
    private String nombreCientifico, clasifSuperior, familia, clase, tipo;
    private int riego, sol;
    private ArrayList<String> nombresVulgares = new ArrayList<>();
    public Planta(String nc, String cs, String familia, String clase, String tipo, int riego, int sol){
        setNombreCientifico(nc);
        setClasifSuperior(cs);
        setFamilia(familia);
        setTipo(tipo);
        setClase(clase);
        setRiego(riego);
        setSol(sol);
    }
    //Getters
    public String getNombreCientifico(){
        return this.nombreCientifico;
    }
    public String getClasifSuperior(){
        return this.clasifSuperior;
    }
    public String getFamilia(){
        return this.familia;
    }
    public String getClase(){
        return this.clase;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getRiego(){
        return this.riego;
    }
    public int getSol(){
        return this.sol;
    }
    public ArrayList<String> getNombresVulgares() {
        return this.nombresVulgares;
    }
    //ArrayList
    public String getTextoNombresVulgares() {
        String text = null;
        for(int i = 0; i < this.nombresVulgares.size(); i++){
            if(i == (this.nombresVulgares.size() - 1)){
                text += this.nombresVulgares.get(i) ;
            }
            else {
                text = text + this.nombresVulgares.get(i) + " - ";
            }
        }
        return text;
    }
    public void addNombresVulgares(String nuevoNombre){
        this.nombresVulgares.add(nuevoNombre);
    }
    //Setters
    public void setNombreCientifico(String nombreCientifico){
        if(nombreCientifico != null){
            this.nombreCientifico = nombreCientifico;
        }
    }
    public void setClasifSuperior(String clasifSuperior){
        if(clasifSuperior != null){
            this.clasifSuperior = clasifSuperior;
        }
    }
    public void setFamilia(String familia){
        if(familia != null){
            this.familia = familia;
        }
    }
    public void setClase(String clase){
        if(clase != null){
            this.clase = clase;
        }
    }
    public void setTipo(String tipo){
        if(tipo != null){
            this.tipo = tipo;
        }
    }
    public void setRiego(int riego){
        if(riego >= 1 && riego <= 10){
            this.riego = riego;
        }
    }
    public void setSol(int sol){
        if(sol >= 1 && sol <= 10){
            this.sol = sol;
        }
    }

    @Override
    public String toString(){
        return "Nombre Científico: "+getNombreCientifico()+"\t\tClase: "+getClase()+"\nNombres vulgares: "+getTextoNombresVulgares()+"\t"+getTipo()+"\nClaificación superior: "+getClasifSuperior()+"\t\tRiego: "+getRiego()+"\nFamilia: "+getFamilia()+"\t\t\t\tSol: "+getSol();
    }
}
