import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Evaluador {
    private String nombre;
    private boolean esExperto;
    private Set<String> temasConocidos;

    public Evaluador(String nombre, boolean esExperto, Set<String> temasConocidos) {
        this.nombre = nombre;
        this.esExperto = esExperto;
        this.temasConocidos = temasConocidos;
    }

    public boolean esAptoParaTrabajo(Trabajo trabajo) {
        if (trabajo instanceof Poster) {
            for (String palabraClave : trabajo.getPalabrasClave()) {
                if (temasConocidos.contains(palabraClave)) {
                    return true;
                }
            }
        } else {
            List<String> temasTrabajo = trabajo.getPalabrasClave();
            return temasConocidos.containsAll(temasTrabajo);
        }
        return false;
    }

    public boolean esExperto() {
        return esExperto;
    }

    public int contarTrabajosAsignados(List<Trabajo> trabajos) {
        int count = 0;
        for (Trabajo trabajo : trabajos) {
            if (trabajo.getEvaluadorAsignado() == this) {
                count++;
            }
        }
        return count;
    }
}

abstract class Trabajo {
    private String titulo;
    private List<String> palabrasClave;
    private Evaluador evaluadorAsignado;

    public Trabajo(String titulo, List<String> palabrasClave) {
        this.titulo = titulo;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public Evaluador getEvaluadorAsignado() {
        return evaluadorAsignado;
    }

    public void asignarEvaluador(Evaluador evaluador) {
        evaluadorAsignado = evaluador;
    }
}

class Articulo extends Trabajo {
    public Articulo(String titulo, List<String> palabrasClave) {
        super(titulo, palabrasClave);
    }
}

class Resumen extends Trabajo {
    public Resumen(String titulo, List<String> palabrasClave) {
        super(titulo, palabrasClave);
    }
}

class Poster extends Trabajo {
    public Poster(String titulo, List<String> palabrasClave) {
        super(titulo, palabrasClave);
    }
}

public class CongresoComputacion {
    public static void main(String[] args) {
        // Crear evaluadores
        Evaluador evaluador1 = new Evaluador("Evaluador1", true, Set.of("Algoritmos", "Redes de comunicación"));
        Evaluador evaluador2 = new Evaluador("Evaluador2", false, Set.of("Algoritmos", "Lenguajes de programación"));
        Evaluador evaluador3 = new Evaluador("Evaluador3", true, Set.of("Agentes", "Visualización"));

        // Crear trabajos
        Trabajo trabajo1 = new Articulo("Artículo 1", List.of("Algoritmos", "Redes de comunicación"));
        Trabajo trabajo2 = new Resumen("Resumen 1", List.of("Lenguajes de programación", "Redes de comunicación"));
        Trabajo trabajo3 = new Poster("Poster 1", List.of("Agentes", "Inteligencia Artificial"));

        // Asignar evaluadores a los trabajos
        if (evaluador1.esAptoParaTrabajo(trabajo1)) {
            trabajo1.asignarEvaluador(evaluador1);
        }

        if (evaluador2.esAptoParaTrabajo(trabajo2)) {
            trabajo2.asignarEvaluador(evaluador2);
        }

        if (evaluador3.esAptoParaTrabajo(trabajo3)) {
            trabajo3.asignarEvaluador(evaluador3);
        }

        // Determinar qué evaluador puede asignarse a un determinado trabajo
        System.out.println("Evaluador para Trabajo 1: " + trabajo1.getEvaluadorAsignado().esExperto());
        System.out.println("Evaluador para Trabajo 2: " + trabajo2.getEvaluadorAsignado().esExperto());
        System.out.println("Evaluador para Trabajo 3: " + trabajo3.getEvaluadorAsignado().esExperto());

        // Determinar cuántos trabajos tiene un evaluador determinado
        System.out.println("Trabajos asignados a Evaluador1: " + evaluador1.contarTrabajosAsignados(List.of(trabajo1, trabajo2, trabajo3)));
        System.out.println("Trabajos asignados a Evaluador2: " + evaluador2.contarTrabajosAsignados(List.of(trabajo1, trabajo2, trabajo3)));
        System.out.println("Trabajos asignados a Evaluador3: " + evaluador3.contarTrabajosAsignados(List.of(trabajo1, trabajo2, trabajo3)));
    }
}
