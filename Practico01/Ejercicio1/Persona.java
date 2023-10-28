package Practico01.Ejercicio1;
import java.time.LocalDate;
import java.time.Period;
public class Persona {
    //Atributos
    private String nombre, apellido, sexo;
    private int dni, edad;
    private double peso, altura;
    private LocalDate today = LocalDate.now();
    private LocalDate fechaNac;

    //Constructor
    public Persona(){
        this(0, "N", "N", 2000, 01, 01, 1, 1, "Femenino");
        
    }
    public Persona(int dni, String nombre, String apellido, int year, int month, int day, double peso, double altura, String sexo){
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setFechaNac(year, month, day);
        setAltura(day);
        setPeso(peso);
        setAltura(altura);
        setSexo(sexo);
    }

    //Metodos set
    public void setEdad(){
        Period periodo = Period.between(fechaNac, today);
        edad = periodo.getYears();
    }
    public void setNombre(String nombre){
        if(nombre != null && nombre != "") {
            this.nombre = nombre;
        }
    }
    public void setApellido(String apellido){
        if(apellido != null && apellido != "") {
            this.apellido = apellido;
        }       
    }
    public void setSexo(String sexo){
        if(sexo != null && sexo != "") {
            this.sexo = sexo;
        }
    }
    public void setFechaNac(int year, int month, int day){
        fechaNac = LocalDate.of(year, month, day);
        setEdad();
    }
    public void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        }    
    }
    public void setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
        } 
    }
    public void setDni(int dni){
        if(dni >= 10000000 && dni <= 49999999){
            this.dni = dni;
        }
    }

    //Metodos get
    public String getNombre(){
        return nombre;
    }    
    public String getApellido(){
        return apellido;
    }    
    public String getFechaNac(){
        return fechaNac.toString();
    }
    public String getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public int getDni(){
        return dni;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }

    //Otros metodos
    public void nombreCompleto(){
        System.out.println(getNombre()+" "+getApellido());
    }    
    public void calcularMC(){
        double masaCorp = peso / (altura * altura);
        if(masaCorp >= 18.5 && masaCorp <= 25){
            System.out.println("Mi masa corporal es de "+masaCorp+". Estoy saludable");
        }
        else{
            System.out.println("Mi masa corporal es de "+masaCorp+". No estoy saludable");
        }
    }
    public void hoyCumple(){
        if(fechaNac.isEqual(today)){
            System.out.println("Hoy es mi cumpleños. "+fechaNac);
        }
        else{
            System.out.println("Hoy NO es mi cumpleaños, es el "+fechaNac);
        }
    }
    public void edad(){
        if(edad >= 18){
            System.out.println("Soy mayor de edad, tengo "+edad);
        }
        else{
            System.out.println("Soy menor de edad, tengo "+edad);
        }
    }
    public void votar(){
        if(edad >= 16){
            System.out.println("Puedo votar porque tengo "+edad);
        }
        else{
            System.out.println("No puedo votar porque tengo "+edad);
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nSexo: "+sexo+"\nFecha de Nacimiento: "+fechaNac+"\nDNI: "+dni+"\nEdad: "+edad+"\nPeso(kg): "+peso+"\nAltura(m): "+altura);
    }
}
