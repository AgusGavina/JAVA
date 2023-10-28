package Practico07.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

class ProductoQuimico {
    private String nombre;
    private List<String> cultivosNoRecomendados;
    private List<String> estadosPatologicosTratados;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = new ArrayList<>();
        this.estadosPatologicosTratados = new ArrayList<>();
    }

    public void agregarCultivoNoRecomendado(String cultivo) {
        cultivosNoRecomendados.add(cultivo);
    }

    public void agregarEstadoPatologicoTratado(String estadoPatologico) {
        estadosPatologicosTratados.add(estadoPatologico);
    }

    public boolean puedeTratarEnfermedad(Enfermedad enfermedad) {
        return estadosPatologicosTratados.containsAll(enfermedad.getEstadosPatologicos());
    }

    public String getNombre() {
        return nombre;
    }
}

class Enfermedad {
    private String nombre;
    private List<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public void agregarEstadoPatologico(String estadoPatologico) {
        estadosPatologicos.add(estadoPatologico);
    }

    public List<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

    public String getNombre() {
        return nombre;
    }
}

class Cultivo {
    private String nombre;
    private List<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public void agregarEnfermedadFrecuente(Enfermedad enfermedad) {
        enfermedadesFrecuentes.add(enfermedad);
    }

    public List<Enfermedad> getEnfermedadesFrecuentes() {
        return enfermedadesFrecuentes;
    }

    public String getNombre() {
        return nombre;
    }
}

public class SistemaAgroquimicos {
    public static void main(String[] args) {
        ProductoQuimico agroquimico1 = new ProductoQuimico("Agroquimico1");
        agroquimico1.agregarEstadoPatologicoTratado("deshidratación");
        agroquimico1.agregarEstadoPatologicoTratado("hojas amarillas");

        ProductoQuimico agroquimico2 = new ProductoQuimico("Agroquimico2");
        agroquimico2.agregarEstadoPatologicoTratado("hojas amarillas");
        agroquimico2.agregarCultivoNoRecomendado("girasol");

        Enfermedad enfermedad1 = new Enfermedad("Cochinilla");
        enfermedad1.agregarEstadoPatologico("deshidratación");
        enfermedad1.agregarEstadoPatologico("hojas amarillas");

        Cultivo cultivo1 = new Cultivo("Trigo");
        cultivo1.agregarEnfermedadFrecuente(enfermedad1);

        // Proveer un listado de agroquímicos que pueden tratar una enfermedad determinada
        System.out.println("Agroquímicos para la enfermedad Cochinilla:");
        for (ProductoQuimico agroquimico : List.of(agroquimico1, agroquimico2)) {
            if (agroquimico.puedeTratarEnfermedad(enfermedad1)) {
                System.out.println(agroquimico.getNombre());
            }
        }

        // Dado un cultivo y una enfermedad, devolver el listado de agroquímicos que pueden tratar
        Cultivo cultivoSeleccionado = cultivo1;
        Enfermedad enfermedadSeleccionada = enfermedad1;

        System.out.println("Agroquímicos para el cultivo " + cultivoSeleccionado.getNombre() +
                           " y la enfermedad " + enfermedadSeleccionada.getNombre() + ":");
        for (ProductoQuimico agroquimico : List.of(agroquimico1, agroquimico2)) {
            if (!agroquimico.cultivosNoRecomendados.contains(cultivoSeleccionado.getNombre()) &&
                agroquimico.puedeTratarEnfermedad(enfermedadSeleccionada)) {
                System.out.println(agroquimico.getNombre());
            }
        }
    }
}


