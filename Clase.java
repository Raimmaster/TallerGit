package Escuela;

public class Clase{
    private String nombreClase;
    private int numAlumnos;    
    private Alumno [] alumnos;
    
    public Clase(String nom, int cantAlumnos){
        nombreClase = nom;
        alumnos = new Alumno[cantAlumnos];        
    }
    
    /*
        Devolver el nombre de la clase
    */
    public String getNombreClase(){
        return "Nombre";
    }
    
    public void ingresarAlumnos(){
        for(int i = 0; i < alumnos.length; i++){
            //Crear los alumnos
        }
    }
    
    public Alumno getTopAlumnoDeClase(){
        //Obtener el alumno con la mejor nota de la clase
        for(int i = 0; i < alumnos.length; i++){
            //BUSCAR
        }
        return null;
    }
}
