package Practico04.Ejercicio2;

class AlarmaLuminosa extends Alarma{
    private Luz luz = new Luz();
    
    public AlarmaLuminosa(String ns1, String ns2, String ns3, String ns4){
        super(ns1, ns2, ns3, ns4);
    }  

    public void senalSonora(Sensor s){
        super.senalSonora(s);
        luz.encender();
    }
}
