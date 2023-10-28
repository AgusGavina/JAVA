package Practico04.Ejercicio1;

class AlarmaLuminosa extends Alarma{
    private Luz luz = new Luz();
    
    public AlarmaLuminosa(boolean bw, boolean od, boolean ow, boolean m){
        super(bw, od, ow, m);
    }  

    public void senalSonora(){
        super.senalSonora();
        if(comprobar() == true){
            luz.encender();
        }
    }
}
