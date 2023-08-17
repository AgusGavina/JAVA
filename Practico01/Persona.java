package Practico01;
public class Persona {
    //Atributos
    String nombre, apellido, sexo, fechaDeNacimiento;
    int dni, edad;
    double peso, altura;
    //valores por defecto
    public Persona(){
        nombre = "N";
        apellido = "N";
        sexo = "femenino";
        fechaDeNacimiento = "1 de Enero del 2000";
        peso = 1; 
        altura = 1;
    }
    //Metodos set
    public void setNombre(String newname){
        nombre = newname;
    }
    public void setApellido(String newsurname){
        apellido = newsurname;
    }
    public void setSexo(String newsex){
        sexo = newsex;
    }
    public void setFechaNacimiento(String newbirthdate){
        fechaDeNacimiento = newbirthdate;
    }
    public void setEdad(int newage){
        edad = newage;
    }
    public void setPeso(double newweight){
        peso = newweight;
    }
    public void setAltura(double newheight){
        altura = newheight;
    }
    //Metodos get
    public String getNombre(){
        return nombre;
    }    
    public String getApellido(){
        return apellido;
    }    
    public String getFechaNacimiento(){
        return fechaDeNacimiento;
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
        System.out.println("Hoy es mi cumpleños. "+fechaDeNacimiento);
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
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nSexo: "+sexo+"\nFecha de Nacimiento: "+fechaDeNacimiento+"\nDNI: "+dni+"\nEdad: "+edad+"\nPeso(kg): "+peso+"\nAltura(m): "+altura);
    }
    //Constructores
    public Persona(int DNI){
        dni = DNI;
    }
    public Persona(int DNI, int age){
        dni = DNI;
        edad = age;
    }
    public Persona(int DNI, int age, double weight){
        dni = DNI;
        edad = age;
        peso = weight;
    }
    public Persona(int DNI, int age, double weight, double height){
        dni = DNI;
        edad = age;
        peso = weight;
        altura = height;
    }
    public Persona(int DNI, int age, double weight, double height, String name){
        dni = DNI;
        edad = age;
        peso = weight;
        altura = height;
        nombre = name;
    }
    public Persona(int DNI, int age, double weight, double height, String name, String surname){
        dni = DNI;
        edad = age;
        peso = weight;
        altura = height;
        nombre = name;
        apellido = surname;
    }
    public Persona(int DNI, int age, double weight, double height, String name, String surname, String sex){
        dni = DNI;
        edad = age;
        peso = weight;
        altura = height;
        nombre = name;
        apellido = surname;
        sexo = sex;
    }
    public Persona(int DNI, int age, double weight, double height, String name, String surname, String sex, String birthdate){
        dni = DNI;
        edad = age;
        peso = weight;
        altura = height;
        nombre = name;
        apellido = surname;
        sexo = sex;
        fechaDeNacimiento = birthdate;
    }
}
