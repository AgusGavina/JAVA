package Practico02.Ejercicio1;

public class Temporada {
    private int cantEp;
    public Capitulo arrCapitulos[];

    public Temporada(){
        this.cantEp = 0;
    }
    public Temporada(int cantEp){
        this.cantEp = cantEp;
        generarCapitulos();
    }
    public int getCantEp(){
        return this.cantEp;
    }
    public void setCantEp(int cantEp){
        this.cantEp = cantEp;
        generarCapitulos();
    }
    public void generarCapitulos(){
        for(int i = 0; i < this.cantEp; i++){
            arrCapitulos[i] = new Capitulo();
        }
    }
}
