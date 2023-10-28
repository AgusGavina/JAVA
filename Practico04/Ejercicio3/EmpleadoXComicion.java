package Practico04.Ejercicio3;

public class EmpleadoXComicion extends EmpleadoContratado {
    private int ventasHeachas;
    private double montoXVenta;
    public EmpleadoXComicion(int vh, double mv, double s){
        super(s);
        setVH(vh);
        setMV(mv);
    }
    public int getVH(){
        return this.ventasHeachas;
    }
    public double getMV(){
        return this.montoXVenta;
    }
    public void setVH(int vh){
        if(vh > 0){
            this.ventasHeachas = vh;
        }
    }
    public void setMV(double mv){
        if(mv > 0){
            this.montoXVenta = mv;
        }
    }   
    @Override
    public double getSalario(){
        return super.getSalario() + (getVH() * getMV());
    }
}
