package Practico04.Ejercicio5;
import java.time.LocalDate;
public class Producto {
    //Atributos
    private LocalDate fechaVen;
    private LocalDate fechaEnvasado;
    private int nroLote;
    private String tipo, granjaOrigen;
    //Constructor
    public Producto (int yFV, int mFV, int dFV, int yFE, int mFE, int dFE, int nroLote, String tipo, String granjaOrigen){
        setFechaVen(yFV, mFV, dFV);
        setFechaEnvasado(yFE, mFE, dFE);
        setNroLote(nroLote);
        setTipo(tipo);
        setGranjaOrigen(granjaOrigen);
    }
    //Setters
    public void setFechaVen(int y, int m, int d){
        fechaVen = LocalDate.of(y, m, d);
    }
    public void setFechaEnvasado(int y, int m, int d){
        fechaEnvasado = LocalDate.of(y, m, d);
    }
    public void setNroLote(int nroLote){
        if(nroLote > 0){
            this.nroLote = nroLote;
        }
    }
    public void setTipo (String tipo){
        if(tipo != null && tipo != ""){
            this.tipo = tipo;
        }
    }
    public void setGranjaOrigen (String granjaOrigen){
        if(granjaOrigen != null && granjaOrigen != ""){
            this.granjaOrigen = granjaOrigen;
        }
    }
    //getters
    public LocalDate getFechaVen() {
        return this.fechaVen;
    }
    public LocalDate getFechaEnvasado() {
        return this.fechaEnvasado;
    }
    public int getNroLote() {
        return this.nroLote;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getGranjaOrigen() {
        return this.granjaOrigen;
    }

    @Override
    public String toString(){
        return "Fecha de vencimiento: "+getFechaVen()+"\nFecha de envasado: "+getFechaEnvasado()+"\nNumero de lote: "+getNroLote()+"\nTipo: "+getTipo()+"\nGranja de origen: "+getGranjaOrigen();
    }
}
