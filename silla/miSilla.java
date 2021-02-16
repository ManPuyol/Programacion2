package silla;

public class miSilla
{
	
    private static String black = "\033[30m";
    private static String red = "\033[31m"; 
    private static String green = "\033[32m"; 
    private static String yellow = "\033[33m"; 
    private static String blue = "\033[34m"; 
    private static String purple = "\033[35m"; 
    private static String cyan = "\033[36m"; 
    private static String white = "\033[37m";
    private static String reset = "\u001B[0m";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Silla x, y;
		x = new Silla(yellow, "cocina", 130);
		y = new Silla(red, "nórdico", 150);
		
		x.dibujar();
		y.dibujar();
		
		x.sentar(80);
		y.sentar(50);

		
		x.levantar();
		y.levantar();
		x.sentar(90);
		y.sentar(70);
		
		
		x.dibujar();
		y.dibujar();
		

	}

}
