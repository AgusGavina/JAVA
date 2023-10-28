package Practico04.Ejercicio1;

class Alarma {
    private boolean breakWindow, openDoor, openWindow, motion;
    private Timbre timbre = new Timbre();

    public Alarma(boolean bw, boolean od, boolean ow, boolean m) {
        setBW(bw);
        setOD(od);
        setOW(ow);
        setM(m);
    }

    //Getters y Setters
    public boolean getBW(){
        return this.breakWindow;
    }
    public boolean getOD(){
        return this.openDoor;
    }
    public boolean getOW(){
        return this.openWindow;
    }
    public boolean getM(){
        return this.motion;
    }
    public void setBW(boolean bw){
        this.breakWindow = bw;
    }
    public void setOD(boolean od){
        this.openDoor = od;
    }
    public void setOW(boolean ow){
        this.openWindow = ow;
    }
    public void setM(boolean m){
        this.motion = m;
    }
    public boolean comprobar(){
        if(getBW() == true){
            return true;
        }
        else if(getOD() == true){
            return true;
        }
        else if(getOW() == true){
            return true;
        }
        else if(getM() == true){
            return true;
        }
        else{
            return false;
        }
    }
    public void senalSonora(){
        if(comprobar() == true){
            timbre.hacerSonar();
        }
        else{
            System.out.println("Todo ok.");
        }
    }
}