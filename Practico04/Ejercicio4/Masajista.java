package Practico04.Ejercicio4;

public class Masajista extends Contingente{
    private String infoTitulo;
    private int aniosExperiencia;
    public Masajista(String n, String a, int np, int y, int m, int d, String e, String it, int ae){
        super(n, a, np, y, m, d, e);
        setInfoTitulo(it);
        setAniosExperiencia(ae);
    }
    public void setInfoTitulo(String it){
        if(it != null && it != ""){
            this.infoTitulo = it;
        }
    }
    public void setAniosExperiencia(int ae){
        if(ae > 0){
            this.aniosExperiencia = ae;
        }
    }
    //Getters
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public String getInfoTitulo() {
        return infoTitulo;
    }
}
