package Practico06.Ejercicio1;

public class Vehiculo extends Producto {
    // Atributos
    private String marca, patente, tipo;
    private double km;
    // Constructor
    public Vehiculo(String nombre, int copiasDisponibles, String marca, String patente, String tipo, double km){
        super(nombre, copiasDisponibles);
        setMarca(marca);
        setPatente(patente);
        setTipo(tipo);
        setKm(km);
    }
    //Getters
    public String getMarca(){
        return this.marca;
    }
    public String getPatente(){
        return this.patente;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getKm(){
        return this.km;
    }
    // Setters
    public void setMarca(String marca) {
        if(marca != null){
            this.marca = marca;
        }
    }
    public void setPatente(String patente) {
        if(patente != null){
            this.patente = patente;
        }
    }
    public void setTipo(String tipo) {
        if(tipo != null){
            this.tipo = tipo;
        }       
    }
    public void setKm(double km) {
        if(km > 0){
            this.km = km;
        }
    }
}
