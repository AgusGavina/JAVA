package Practico04.Ejercicio5;

public class ProductoCongeladoPorAgua extends ProductoFrio{
    private double gsxla;
    public ProductoCongeladoPorAgua(int yFV, int mFV, int dFV, int yFE, int mFE, int dFE, int nroLote, String tipo, String granjaOrigen, int cosa, double temp, double gsxla){
        super(yFV, mFV, dFV, yFE, mFE, dFE, nroLote, tipo, granjaOrigen, cosa, temp);
        setGSXLA(gsxla);
    }
    public void setGSXLA(double gsxla){
        if(gsxla > 0){
            this.gsxla = gsxla;
        }
    }
    public double getGSXLA() {
        return this.gsxla;
    }
    @Override
    public String toString(){
        return super.toString()+"\nGRamo de sal por litro de agua: "+getGSXLA();
    }
}