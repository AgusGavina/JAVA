package Practico05.Ejercicio2;

public class Resolucion {//Hogwarts
    public static void main(String[] args) {
        Casa griffindor = new Casa("Griffindor", 10);
        griffindor.agregarCualidadRequerida("Valentía");

        Casa slytherin = new Casa("Slytherin", 8);
        slytherin.agregarCualidadRequerida("Astucia");
        slytherin.agregarFamiliarEnCasa("Malfoy");
        slytherin.agregarCasaEnemiga(griffindor);

        Alumno harry = new Alumno("Harry Potter", griffindor);
        harry.agregarCualidad("Valentía");

        Alumno draco = new Alumno("Draco Malfoy", slytherin);
        draco.agregarCualidad("Astucia");
        draco.agregarFamiliar("Narcissa Malfoy");

        // Asignar alumnos a las casas
        griffindor.agregarAlumno(harry);
        slytherin.agregarAlumno(draco);

        System.out.println(harry.toString());
    }
}
