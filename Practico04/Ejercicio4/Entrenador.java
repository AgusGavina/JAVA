package Practico04.Ejercicio4;

public class Entrenador extends Contingente{
    private int idFed;
    public Entrenador(String n, String a, int np, int y, int m, int d, String e, int idFed){
        super(n, a, np, y, m, d, e);
        setIdFed(idFed);
    }
    public void setIdFed(int idFed){
        if(idFed > 0){
            this.idFed = idFed;
        }
    }
    public int getIdFed() {
        return this.idFed;
    }
}
