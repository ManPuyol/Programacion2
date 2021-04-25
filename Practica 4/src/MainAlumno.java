import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MainAlumno {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		//HastMap para relacionar dni y alumnos.
		HashMap<String,Alumno> alumnos = new HashMap<String, Alumno>() ;

		cargarContenido("C:\\Users\\pelai\\eclipse-workspace\\Practica 4\\src\\FicheroAlumno.txt",alumnos) ;

		Collection<Alumno> coleccion = alumnos.values();

		for (Alumno a : coleccion) {
		System.out.println(a.getNombre()) ;
		System.out.println(a.getApellidos ());
		System.out.println(a.getNotaMedia()) ;
		tipoAlumno(a);
		System.out.println("----------------");
		}

		//Busqueda de un alunno a partir de un DNI
		Alumno a = alumnos.get("556677882");

		if (a==null){
            System.out.println("No se ha encontrado el alumo");
        }
		else{
            System.out.println("Nombre: "+ a.getNombre());
            System.out.println("Apellides: " + a.getApellidos());
            System.out.println("Nota media: " + a.getNotaMedia());
            tipoAlumno (a) ;
        }
    }
	
	public static void cargarContenido(String archivo, HashMap<String,Alumno> la) throws
        FileNotFoundException, IOException {

        String linea,dni;

        Alumno a = null;

        FileReader f = new FileReader (archivo) ;

        BufferedReader b = new BufferedReader (f) ;

        ArrayList<String> arraylist = cargarArray(b);
        Iterator<String> it = arraylist.iterator();

        while (it.hasNext()) {
            linea = it.next();
            dni = it.next();
            if (linea.equals("GII")) {

            a = new AlumnoGII(it.hasNext()?it.next():null,it.hasNext()?it.next():null,it.hasNext()?Float.parseFloat (it.next()):0,it.hasNext()?Boolean.parseBoolean(it.next()):false);

            }else if (linea.equals ("GIIAA") ) {

            a = new AlumnoGIIAA(it.hasNext()?it.next():null,it.hasNext()?it.next():null,it.hasNext()?Float.parseFloat (it.next()):0,it.hasNext()?Boolean.parseBoolean(it.next()):false);
            }else if (linea.equals("GIOI")) {

            a = new AlumnoIOI(it.hasNext()?it.next():null,it.hasNext()?it.next():null,it.hasNext()?Float.parseFloat (it.next()):0,it.hasNext()?Boolean.parseBoolean(it.next()):false) ;
            }
            la.put (dni, a);

            b.close();
        }
	}

    /**
    * Muestra por pantalla el grado al que pertenece el alumno.
    ** @param a Alumno que deseamos confirmar su grado
    */
    public static void tipoAlumno(Alumno a) {
        if(a instanceof AlumnoGII){
        System.out.println("Pertenece al GII");}
        else if (a instanceof AlumnoIOI){
        System.out.println("Pertenece al GIOI");}
        else if (a instanceof AlumnoGIIAA){
        System.out.println("Pertenece al GIIAA");}
    
    }
    
    public static ArrayList<String> cargarArray( BufferedReader b) throws IOException{
    ArrayList<String> arraylist = new ArrayList<String>() ;
    String cadena = null;
    while((cadena = b.readLine()) != null) {
    arraylist.add(cadena) ;
    
    }
    
    return arraylist;
	
    }


}
