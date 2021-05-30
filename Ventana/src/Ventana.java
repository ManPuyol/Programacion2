import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ventana extends Frame{
	
public Ventana(){
	super("Ejemplo de ventana");
	this.add(b,BorderLayout.CENTER);
	this.addWindowListener(new TrataEventosCierre());
	b.addMouseListener(new TrataEventos()) ;
	
	
	setSize(500,200);
	setVisible(true);

}

Button b = new Button("Press Me");


class TrataEventos extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			System.out.print("Button Clicked");
			b.setBackground(Color.blue);
			b.setLabel("Azul");
	  		}
		public void mouseEntered(MouseEvent e){
			System.out.print("Button Entered");
	  		}
		public void mouseExited(MouseEvent e){
			System.out.print("Button Exited");
	  		}
		public void mousePressed(MouseEvent e){
			System.out.print("Button Pressed");
			b.setBackground(Color.red);
			b.setLabel("Rojo");
	  		}
		}	 
class TrataEventosCierre extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
     }
}



}