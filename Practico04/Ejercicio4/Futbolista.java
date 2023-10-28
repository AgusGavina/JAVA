package Practico04.Ejercicio4;

public class Futbolista extends Contingente{
    //Atributos
    private String posicion;
    private boolean zurdo, derecho;
    private int goles;
    //Constructor
    public Futbolista(String n, String a, int np, int y, int m, int d, String e, String pos, boolean zurdo, boolean derecho, int goles){
        super(n, a, np, y, m, d, e);
        setPosicion(pos);
        setZurdo(zurdo);
        setDerecho(derecho);
        setGoles(goles);
    }
    //Setters
    public void setPosicion(String pos){
        if(pos != null && pos != ""){
            this.posicion = pos;
        }
    }
    public void setZurdo(boolean zurdo){
        this.zurdo = zurdo;
    }
    public void setDerecho(boolean derecho){
        this.derecho = derecho;
    }
    public void setGoles(int goles){
        if(goles > 0){
            this.goles = goles;
        }
    }
    //Getters
    public int getGoles() {
        return this.goles;
    }
    public String getPosicion() {
        return this.posicion;
    }
    public boolean getZurdo(){
        return this.zurdo;
    }
    public boolean getDerecho(){
        return this.derecho;
    }
}
