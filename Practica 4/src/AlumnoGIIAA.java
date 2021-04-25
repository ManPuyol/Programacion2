public class AlumnoGIIAA extends AlumnoEPS {

public AlumnoGIIAA(String nombre, String apellidos,float nota,boolean becario) {
super (nombre, apellidos, nota,becario) ;
}

public void isBecario(){
	becario=true;
}

}