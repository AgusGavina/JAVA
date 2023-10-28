package Practico01.Ejercicio3;

public class Rectangulo {
    private int c1;
    private int c2;

    public Rectangulo(){
        this.c1 = 1;
        this.c2 = 1;
    }
    public void setC1(int c1){
        this.c1 = c1;
    }
    public void setC2(int c2){
        this.c2 = c2;
    }
    public double calcArea(){
        double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        double area = h + c1 + c2;
        return area;
    }
    public int compRec(double area){
        double areaRecComp = 10;
        int var;
        if(area > areaRecComp){
            var = 1;
        }
        else if(area < areaRecComp){
            var = -1;
        }
        else{
            var = 0;
        }
        return var;
    }
    public boolean cuadrado(){
        boolean var;
        if(c1 == c2){
            var = true;
        }
        else{
            var = false;
        }
        return var;
    }
    public void acostadoVsParado(){
        if(c1 > c2){
            System.out.println("Acostado");
        }
        else if(c1 < c2){
            System.out.println("Parado");
        }
        else{
            System.out.println("Sus lados son iguales");
        }
    }
}
