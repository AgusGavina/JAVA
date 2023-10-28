package Practico06.Ejercicio2;

public class Barco {
    private int capacidad;
    public Barco(int capacidad){
        setCapacidad(capacidad);
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    public void setCapacidad(int capacidad) {
        if(capacidad > 0){
            this.capacidad = capacidad;
        }  
    }
}
