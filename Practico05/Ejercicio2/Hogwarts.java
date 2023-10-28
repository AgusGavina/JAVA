package Practico05.Ejercicio2;
import java.util.ArrayList;
class Hogwarts {
    private String nombre;
    protected ArrayList<String> cualidades = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null && nombre != ""){
            this.nombre = nombre;
        }
    }
    public void getArrayList(ArrayList<Object> arrlist){
        for(int i = 0; i < arrlist.size(); i++){
            System.out.println(arrlist.get(i));
        }
    }
    public void addArrayList(ArrayList<String> arrlist, String text){
        arrlist.add(text);
    }
}