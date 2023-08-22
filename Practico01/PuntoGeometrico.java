package Practico01;
public class PuntoGeometrico{
    private int x, y;
    public PuntoGeometrico(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString() {
        return x + ", " + y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x += x;
        this.y += y;
    }
    public void desplazarX(int x){
        this.x += x;
    }
    public void desplazarY(int y){
        this.y += y;
    }
    public double calcEuclidea(int x1, int y1){
        double distancia = Math.sqrt((Math.pow((this.x - x1),2))+(Math.pow((this.y - y1),2)));
        return distancia;
    }
}