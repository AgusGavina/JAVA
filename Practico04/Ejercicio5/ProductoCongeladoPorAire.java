package Practico04.Ejercicio5;

public class ProductoCongeladoPorAire extends ProductoFrio{
    private double nitrogeno, oxigeno, dioxidoDeCarbono, vaporDeAgua;
    public ProductoCongeladoPorAire(int yFV, int mFV, int dFV, int yFE, int mFE, int dFE, int nroLote, String tipo, String granjaOrigen, int cosa, double temp, double n, double o, double dc, double va){
        super(yFV, mFV, dFV, yFE, mFE, dFE, nroLote, tipo, granjaOrigen, cosa, temp);
        setNitrogeno(n);
        setOxigeno(o);
        setDioxidoDeCarbono(dc);
        setVaporDeAgua(va);
    }
    public void setNitrogeno(double nitrogeno){
        if(nitrogeno > 0){
            this.nitrogeno = nitrogeno;
        }
    }
    public void setOxigeno(double oxigeno){
        if(oxigeno > 0){
            this.oxigeno = oxigeno;
        }
    }
    public void setDioxidoDeCarbono(double dioxidoDeCarbono){
        if(dioxidoDeCarbono > 0){
            this.dioxidoDeCarbono = dioxidoDeCarbono;
        }
    }
    public void setVaporDeAgua(double vaporDeAgua){
        if(vaporDeAgua > 0){
            this.vaporDeAgua = vaporDeAgua;
        }
    }
    public double getNitrogeno() {
        return this.nitrogeno;
    }
    public double getOxigeno() {
        return this.oxigeno;
    }
    public double getDioxidoDeCarbono() {
        return this.dioxidoDeCarbono;
    }
    public double getVaporDeAgua() {
        return this.vaporDeAgua;
    }
    @Override
    public String toString(){
        return super.toString()+"\n% Nitrogeno: "+getNitrogeno()+"\n% Oxigeno: "+getOxigeno()+"\n% Dioxido de Carbono: "+getDioxidoDeCarbono()+"\n% Vapor de agua: "+getVaporDeAgua();
    }
}
