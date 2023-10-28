package Practico04.Ejercicio2;

class Alarma {
    private Sensor s1;
    private Sensor s2;
    private Sensor s3;
    private Sensor s4;
    private Timbre timbre = new Timbre();

    public Alarma(String ns1, String ns2, String ns3, String ns4) {
        s1 = new Sensor(ns1, false);
        s2 = new Sensor(ns2, true);
        s3 = new Sensor(ns3, false);
        s4 = new Sensor(ns4, false);
    }
    public void comprobar(){
        if(s1.getDM() == true){
            senalSonora(s1);
        }
        else if(s2.getDM() == true){
            senalSonora(s2);
        }
        else if(s3.getDM() == true){
            senalSonora(s3);
        }
        else if(s4.getDM() == true){
            senalSonora(s4);
        }
        else{
            System.out.println("Todo ok.");
        }
    }
    public void senalSonora(Sensor s){
        timbre.hacerSonar();
        System.out.println("En la zona: "+s.getNZ());
    }
}