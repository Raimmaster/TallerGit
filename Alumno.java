package Escuela;

public class Alumno{
   private int numCuenta;
   private String primerNombre;
   private String apellido;
   private int nota;   
   
    public Alumno(int numCuenta, String primerNombre, String apellido) {
        this.numCuenta = numCuenta;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
	//Prueba de Git
	this.apellido = "Inter";
    }

    //GETs
    //Conflicto Git
    public int getNumCuenta() {
        return numCuenta;
    }

    public String getPrimerNombre() {
        primerNombre = "Leonardo";
        return primerNombre;

    }

    public String getApellido() {
    	apellido = "Vasquez";
        return apellido;
    }

    public int getNota() {
        return nota;
    }

    /*
        Settear el numero de cuenta
    */
    public void setNumCuenta(int num) {
        //Validar que el numero de cuenta no sea menor que 1
    }
    
    /*
        Settear la nota
    */
    public void setNota(int note){
        //Validar que la nota esté entre 0 y 100
    }
    
    /*
        Settear el primer nombre
    */
    public void setPrimerNombre(String nombre) {
        //Que el nombre no tenga más de 20 caracteres
    }

    /*
        Settear el apellido
    */
    public void setApellido(String lastName) {
        //Que el nombre no tenga más de 20 caracteres
    }   
       
}
