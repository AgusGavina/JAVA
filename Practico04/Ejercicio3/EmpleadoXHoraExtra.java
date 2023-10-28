package Practico04.Ejercicio3;

public class EmpleadoXHoraExtra extends EmpleadoContratado {
    private int horasTrabajadas;
    private double montoXHora;
    public EmpleadoXHoraExtra(int ht, double mh, double s){
        super(s);
        setHT(ht);
        setMH(mh);
    }
    public int getHT() {
        return this.horasTrabajadas;
    }
    public double getMH() {
        return this.montoXHora;
    }
    public void setHT(int ht){
        if(ht > 0){
            this.horasTrabajadas = ht;
        }
    }
    public void setMH(double mh){
        if(mh > 0){
            this.montoXHora = mh;
        }
    }
    @Override
    public double getSalario(){
        return super.getSalario() + (getHT() * getMH());
    }
}
