package Alumno;

//Atributos//
public class Alumno {
    private String Nombre;
    private String Clase;
    private String Grado;
    
//Metodos
public String getNombre() {
    return Nombre;
}    

public void setNombre(String Nombre) {
    this.Nombre = Nombre;
}

public String getClase() {
    return Clase;
}

public void setClase(String Clase) { 
    this.Clase = Clase;
}

public String getGrado() {
    return Grado;
}

public void setGrado(String Grado) { 
    this.Grado = Grado;
           
    }

public void VerDatos(){
    System.out.println(Nombre);
    System.out.println(Clase);
    System.out.println(Grado);
}
}
