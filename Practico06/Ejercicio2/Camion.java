package Practico06.Ejercicio2;
import java.time.LocalDate;
public class Camion {
    private LocalDate diaDeCarga;
    public Camion(int y, int m, int d){
        setDiaDeCarga(y, m, d);
    }
    public LocalDate getDiaDeCarga() {
        return this.diaDeCarga;
    }
    public void setDiaDeCarga(int y, int m, int d) {
        this.diaDeCarga = LocalDate.of(y, m, d);
    }
}
