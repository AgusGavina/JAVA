package Practico01;
public class Electrodomestico {
    //Atributos
    String nombre;
    double precioBase;
    String color;
    int consumoEnergetico;
    double peso;
    //Valores por defecto
    public Electrodomestico(){
        color = "gris plata";
        consumoEnergetico = 10;
        precioBase = 100;
        peso = 2;
    }
    //Metodos get
    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }
    public double getPrecioBase(){
        return precioBase;
    }
    public int getConsumoEnergetico(){
        return consumoEnergetico;
    }
    public double getPeso(){
        return peso;
    }
    //Metodos set
    public void setNombre(String nuevoname){
        nombre = nuevoname;
    }
    public void setColor(String nuevocolor){
        color = nuevocolor;
    }
    public void setPrecioBase(double nuevopb){
        precioBase = nuevopb;
    }
    public void setConsumoEnergetico(int nuevoce){
        consumoEnergetico = nuevoce;
    }
    public void set(double nuevopeso){
        peso = nuevopeso;
    }
    //Otros metodos
    public void bajoConsumo(){
        boolean var;
        if(consumoEnergetico < 45){
            var = true;
        }
        else{
            var = false;
        }
        System.out.println("¿Es de bajo consumo el electrodometico? "+var);
    }
    public void calcBalance(){
        double var = precioBase / peso;
        if(var > 3){
            System.out.println("Balance: "+var+". El producto es de alta gama");
        }
        else{
            System.out.println("Balance: "+var+". El producto es de gama baja");
        }
    }
}
