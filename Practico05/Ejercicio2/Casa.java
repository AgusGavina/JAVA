package Practico05.Ejercicio2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int capacidad;
    private ArrayList<String> cualidadesRequeridas;
    private ArrayList<String> familiaresEnCasa;
    private ArrayList<Casa> casasEnemigas;
    private ArrayList<Alumno> alumnos;

    public Casa(String nombre, int capacidad) {
        setNombre(nombre);
        setCapacidad(capacidad);
        this.cualidadesRequeridas = new ArrayList<>();
        this.familiaresEnCasa = new ArrayList<>();
        this.casasEnemigas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    public void setNombre(String nombre){
        if(nombre != null && nombre != ""){
            this.nombre = nombre;
        }
    }
    public void setCapacidad(int capacidad){
        if(capacidad > 0){
            this.capacidad = capacidad;
        }
    }
    
    // Agregar cualidades requeridas para pertenecer a la casa
    public void agregarCualidadRequerida(String cualidad) {
        cualidadesRequeridas.add(cualidad);
    }

    // Agregar familiar que debe estar en la misma casa
    public void agregarFamiliarEnCasa(String nombreFamiliar) {
        familiaresEnCasa.add(nombreFamiliar);
    }

    // Agregar casa enemiga
    public void agregarCasaEnemiga(Casa casaEnemiga) {
        casasEnemigas.add(casaEnemiga);
    }

    // Comprobar si un alumno cumple con los requisitos para pertenecer a la casa
    public boolean esApto(Alumno alumno) {
        return capacidadDisponible() > 0 && tieneCualidadesRequeridas(alumno) && tieneFamiliarEnCasa(alumno) && noEsDeCasaEnemiga(alumno);
    }

    // Agregar un alumno a la casa
    public void agregarAlumno(Alumno alumno) {
        if (esApto(alumno)) {
            alumnos.add(alumno);
        }
    }

    // Verificar si la casa está llena
    public boolean estaLlena() {
        return alumnos.size() >= this.capacidad;
    }

    // Obtener la capacidad disponible en la casa
    public int capacidadDisponible() {
        return this.capacidad - alumnos.size();
    }

    // Verificar si el alumno tiene las cualidades requeridas
    private boolean tieneCualidadesRequeridas(Alumno alumno) {
        return alumno.getCualidades().containsAll(cualidadesRequeridas);
    }

    // Verificar si el alumno tiene un familiar en la casa
    private boolean tieneFamiliarEnCasa(Alumno alumno) {
        for (String familiar : alumno.getFamiliares()) {
            if (familiaresEnCasa.contains(familiar)) {
                return true;
            }
        }
        return false;
    }

    // Verificar si el alumno no es de una casa enemiga
    private boolean noEsDeCasaEnemiga(Alumno alumno) {
        for (Casa casaEnemiga : casasEnemigas) {
            if (alumno.getCasa().equals(casaEnemiga)) {
                return false;
            }
        }
        return true;
    }

    // Imprimir cualquier ArrayList<String>
    public String getArrayListText(ArrayList<String> arrlist){
        String text = "";
        for(int i = 0; i < arrlist.size(); i++){
            text = text + arrlist.get(i) + " ";
        }
        return text;
    }

    public String getArrayListCasa(ArrayList<Casa> arrlist){
        String text = "";
        for(int i = 0; i < arrlist.size(); i++){
            text = text + arrlist.get(i) + " ";
        }
        return text;
    }

    public String getArrayListAlumnos(ArrayList<Alumno> arrlist){
        String text = "";
        for(int i = 0; i < arrlist.size(); i++){
            text = text + arrlist.get(i) + " ";
        }
        return text;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\nCapacidad: " + getCapacidad() + "\nCualidades requeridas: " + getArrayListText(this.cualidadesRequeridas) + "\nFamilias de la casa: " + getArrayListText(this.familiaresEnCasa) + "\nCasas Enemigas: " + getArrayListCasa(this.casasEnemigas) + "\nAlumnos: "+getArrayListAlumnos(this.alumnos);
    }
}
