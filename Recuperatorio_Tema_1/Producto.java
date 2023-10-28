package Recuperatorio_Tema_1;
import java.util.ArrayList;
public class Producto extends Elemento{
    public Producto(String nombre, double precio, double peso){
        super(nombre);
        setPrecio(precio);
        setPeso(peso);
        this.categorias = new ArrayList<>(); 
    }
    public void setPrecio(double precio){
        if(precio > 0){
            this.precio = precio;
        }
    }
}
