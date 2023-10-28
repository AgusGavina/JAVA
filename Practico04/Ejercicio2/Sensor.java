package Practico04.Ejercicio2;

public class Sensor {
    private String nameZone;
    private boolean detectMotion;

    public Sensor(String nz, boolean dm){
        setNZ(nz);
        setDM(dm);
    }

    public String getNZ(){
        return this.nameZone;
    }
    public boolean getDM(){
        return this.detectMotion;
    }
    public void setNZ(String nz){
        if(nz != null && nz != ""){
            this.nameZone = nz;
        }
    }
    public void setDM(boolean dm){
        this.detectMotion = dm;
    }
}
