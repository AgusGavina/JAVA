package Practico04.Ejercicio5;

public class ProductoFrio extends Producto{
    private int cosa;
    private double temp;
    public ProductoFrio(int yFV, int mFV, int dFV, int yFE, int mFE, int dFE, int nroLote, String tipo, String granjaOrigen, int cosa, double temp){
        super(yFV, mFV, dFV, yFE, mFE, dFE, nroLote, tipo, granjaOrigen);
        setCOSA(cosa);
        setTemp(temp);
    }
    public void setCOSA(int cosa){
        if(cosa > 0){
            this.cosa = cosa;
        }
    }
    public void setTemp(double temp){
        if(temp > 0){
            this.temp = temp;
        }
    }
    public int getCOSA() {
        return this.cosa;
    }
    public double getTemp() {
        return this.temp;
    }
    @Override
    public String toString(){
        return super.toString()+"\nCodigo del organismo e supervición alimentaria: "+getCOSA()+"\nTemperatura de mantenimiento recomendada: "+getTemp()+"°C";
    }
}
