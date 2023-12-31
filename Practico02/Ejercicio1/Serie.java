package Practico02.Ejercicio1;

public class Serie {
    //Atributos
    private String titulo;
    private int cantTemp;
    private String descripcion;
    private String creador;
    private String genero;
    public Temporada arrTemporadas[] = new Temporada[this.cantTemp];

    //Valores por defecto
    public Serie(){
        this.titulo = "Nombre de la serie";
        this.cantTemp = 1;
        this.descripcion = "Descripcion de la serie";
        this.creador = "Nombre del creador";
        this.genero = "Genero de la serie";
        generarTemporadas(this.cantTemp);
    }
    public Serie(String titulo, int cantTemp, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.cantTemp = cantTemp;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        generarTemporadas(this.cantTemp);
    }
    // Metodos get
    public String getTitulo(){
        return this.titulo;
    }
    public int getCantTemp(){
        return this.cantTemp;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public String getCreador(){
        return this.creador;
    }
    public String getGenero(){
        return this.genero;
    }
    // Metodos set
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setCantTemp(int cantTemp){
        this.cantTemp = cantTemp;
        generarTemporadas(this.cantTemp);
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setCreador(String creador){
        this.creador = creador;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    //Otros
    public void generarTemporadas(int cantTemp){
        for(int i = 0; i < cantTemp; i++){
            arrTemporadas[i] = new Temporada();
        }
    }
}
