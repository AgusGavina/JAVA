package Practico05.Ejercicio1;

import java.util.LinkedList;

class Pila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    // Agregar un elemento en el tope de la pila
    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    // Retirar y retornar el elemento del tope de la pila
    public T pop() {
        if (!isEmpty()) {
            return elementos.removeFirst();
        }
        throw new IllegalStateException("La pila está vacía");
    }

    // Consultar el elemento en el tope de la pila
    public T top() {
        if (!isEmpty()) {
            return elementos.getFirst();
        }
        throw new IllegalStateException("La pila está vacía");
    }

    // Obtener la cantidad de elementos en la pila
    public int size() {
        return elementos.size();
    }

    // Crear una copia de la pila original manteniendo el mismo orden
    public Pila<T> copy() {
        Pila<T> copia = new Pila<>();
        copia.elementos.addAll(this.elementos);
        return copia;
    }

    // Crear una copia de la pila original con elementos en orden inverso
    public Pila<T> reverse() {
        Pila<T> pilaInversa = new Pila<>();
        LinkedList<T> copiaElementos = new LinkedList<>(this.elementos);
        while (!copiaElementos.isEmpty()) {
            pilaInversa.push(copiaElementos.removeFirst());
        }
        return pilaInversa;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Elemento en el tope de la pila: " + pila.top());

        Pila<Integer> copiaPila = pila.copy();
        System.out.println("Copia de la pila:");
        while (!copiaPila.isEmpty()) {
            System.out.print(copiaPila.pop() + " ");
        }

        System.out.println("\nPila original:");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }

        Pila<Integer> pilaInversa = copiaPila.reverse();
        System.out.println("\nPila inversa:");
        while (!pilaInversa.isEmpty()) {
            System.out.print(pilaInversa.pop() + " ");
        }
    }
}

