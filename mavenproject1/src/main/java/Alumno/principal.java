
package Alumno;

public class principal {
    
    public static void main(String[] args) {
        System.out.println("Los datos del Alumno Regular son : \n");
        
        AlumnoRegular Reg=new AlumnoRegular();
        Reg.setNombre("Andy");
        Reg.setClase("Programación");
        Reg.setGrado("Quinto");
        Reg.VerDatos();
        System.out.println(" \n");

        System.out.println("Los datos del Alumno Becario son : \n");
        
        AlumnoBecario bec=new AlumnoBecario();
        bec.setNombre("Luis");
        bec.setClase("Programación");
        bec.setGrado("Quinto");
        bec.VerDatos();
        System.out.println(" \n");
    }
    
}
