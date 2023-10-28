package Practico06.Ejercicio2;
import java.util.ArrayList;
public class Main {
    public static void ordenarFilaCamiones(ArrayList<Camion> arr){
        int i = 0;
        while(i < (arr.size() - 1)){
            if(arr.get(i).getDiaDeCarga().isAfter(arr.get((i+1)).getDiaDeCarga())){
                Camion c1 = arr.get(i);
                Camion c2 = arr.get((i+1));
                arr.set((i+1), c1);
                arr.set(i, c2);
                if(i != 0){
                    i--;
                }
            }
            else {
                i++;
            } 
        }
    }
    public static void ordenarFilaBarcos(ArrayList<Barco> arr){
        int i = 0;
        while(i < (arr.size() - 1)){
            if(arr.get(i).getCapacidad() < arr.get((i+1)).getCapacidad()){
                Barco b1 = arr.get(i);
                Barco b2 = arr.get((i+1));
                arr.set((i+1), b1);
                arr.set(i, b2);
                if(i != 0){
                    i--;
                }
            }
            else {
                i++;
            } 
        }
    }
    public static void impListCamiones(ArrayList<Camion> arr){
        for(Camion c : arr){
            System.out.println(c.getDiaDeCarga());
        }
    }
    public static void impListBarcos(ArrayList<Barco> arr){
        for(Barco b : arr){
            System.out.println(b.getCapacidad());
        }
    }
    public static void main(String [] args){
        ArrayList<Camion> filaCamiones = new ArrayList<>();
        ArrayList<Barco> filaBarcos = new ArrayList<>();

        //Barcos
        Barco b1 = new Barco(2);
        Barco b2 = new Barco(3);
        Barco b3 = new Barco(4);
        filaBarcos.add(b1);
        filaBarcos.add(b2);
        filaBarcos.add(b3);
        impListBarcos(filaBarcos);
        ordenarFilaBarcos(filaBarcos);
        System.out.println("");
        impListBarcos(filaBarcos);
        //Camiones
        // Camion c2 = new Camion(2023, 4, 10);
        // Camion c3 = new Camion(2023, 4, 5);
        // Camion c1 = new Camion(2023, 4, 2);
        // filaCamiones.add(c1);
        // filaCamiones.add(c2);
        // filaCamiones.add(c3);
        // impListCamiones(filaCamiones);
        // ordenarFilaCamiones(filaCamiones);
        // System.out.println("");
        // impListCamiones(filaCamiones);
    }
}
