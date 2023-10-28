package Practico04.Ejercicio5;

public class ProductoCongeladoPorNitrogeno extends ProductoFrio{
    private String imce;
    private int ten;
    public ProductoCongeladoPorNitrogeno(int yFV, int mFV, int dFV, int yFE, int mFE, int dFE, int nroLote, String tipo, String granjaOrigen, int cosa, double temp, String imce, int ten){
        super(yFV, mFV, dFV, yFE, mFE, dFE, nroLote, tipo, granjaOrigen, cosa, temp);
        setIMCE(imce);
        setTEN(ten);
    }
    public void setIMCE(String imce){
        if(imce != null && imce != ""){
            this.imce = imce;
        }
    }
    public void setTEN(int ten){
        if(ten > 0){
            this.ten = ten;
        }
    }
    public String getIMCE() {
        return this.imce;
    }
    public int getTEN() {
        return this.ten;
    }
    @Override
    public String toString(){
        return super.toString()+"\nInformación del metodo de congelamiento empleado: "+getIMCE()+"\nTiempo de exposición al nitrogeno: "+getTEN()+"seg";
    }
}
