package Practico07.Ejercicio3;

import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas = new ArrayList<>();

    public void imprimirLista(ArrayList<Planta> arr) {
        for (Planta planta : this.plantas) {
            System.out.println(planta.toString());
        }
    }
    public void buscadorXnombreCientifico(String nc) {
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            if (planta.getNombreCientifico().equals(nc)) {
                plantasDeInteres.add(planta);
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }

    public void buscadorXnombreVulgar(String nv) {
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            for (int i = 0; i < planta.getNombresVulgares().size(); i++) {
                if (planta.getNombresVulgares().get(i).equals(nv)) {
                    plantasDeInteres.add(planta);
                }
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }

    public void buscadorXclasificacion(String cs){
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            if (planta.getClasifSuperior().equals(cs)) {
                plantasDeInteres.add(planta);
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }

    public void buscadorXsolMayorYriegoMenorQue(int s, int r){
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            if (planta.getSol() > s && planta.getRiego() < r) {
                plantasDeInteres.add(planta);
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }
    public void buscadorXsolMenorYriegoMayorQue(int s, int r){
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            if (planta.getSol() < s && planta.getRiego() > r) {
                plantasDeInteres.add(planta);
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }

    public void buscadorXtipoYriegoMenorQue(String t, int r){
        ArrayList<Planta> plantasDeInteres = new ArrayList<>();
        for (Planta planta : this.plantas) {
            if ((planta.getTipo().equalsIgnoreCase(t)) && (planta.getRiego() < r)) {
                plantasDeInteres.add(planta);
            }
        }
        if (plantasDeInteres.size() > 0) {
            imprimirLista(plantasDeInteres);
        } else {
            System.out.println("No se encontro ninguna planta con la caracteristica solicitada");
        }
    }
}
