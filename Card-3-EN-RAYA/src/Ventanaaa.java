import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ventanaaa extends Frame{
private Button b1, b2, b3,b4;
private final CardLayout cl;
private final Panel cardpanel;
private boolean turno = true;

Ventanaaa(){
super("Ejemplo de ventana");
b1 = new Button("A");
b2= new Button("B");
b3= new Button("C");
b4= new Button("D");

//Panel que va a contener tres paneles organizados
//como CardLayout
cardpanel = new Panel();
cl = new CardLayout();
cardpanel.setLayout(cl);

Button a = new Button("A");
Button b = new Button("B");
Button c = new Button("C");
Button d = new Button("D");

Button x0 = new Button("");
Button x1 = new Button("");
Button x2 = new Button("");
Button x3 = new Button("");
Button x4 = new Button("");
Button x5 = new Button("");
Button x6 = new Button("");
Button x7 = new Button("");
Button x8 = new Button("");

TextArea t = new TextArea();

//El primer panel
final Panel panelbotones = new Panel();
panelbotones.add(a);
panelbotones.add(b);
panelbotones.add(c);
panelbotones.add(d);
//El segundo Panel
final Panel panelTexto = new Panel();
panelTexto.add(new TextField(10));
panelTexto.add(new TextField(10));
//El tercer Panel
final Panel panelArea = new Panel();
panelArea.add(t);

//El Cuarto panel
final Panel panelPizarra = new Panel();
panelPizarra.setLayout(new GridLayout(3,3));
panelPizarra.add(x0);
panelPizarra.add(x1);
panelPizarra.add(x2);
panelPizarra.add(x3);
panelPizarra.add(x4);
panelPizarra.add(x5);
panelPizarra.add(x6);
panelPizarra.add(x7);
panelPizarra.add(x8);

//Panel de inicio
final Panel inicioPanel = new Panel( ) ;
inicioPanel.setBackground (new Color(.85f,.85f ,.85f));
inicioPanel.add(new Label("Ejemplo de CardLayout" )) ;
//A�adimos los tres panelens asignandoles un nombre
cardpanel.add(inicioPanel, "inicial");
cardpanel.add(panelbotones, "Botones");
cardpanel.add(panelTexto, "Texto");
cardpanel.add(panelArea, "Area");
cardpanel.add(panelPizarra, "Pizarra");
//Panel de control desde donde se selecciona el subpanel a mostrar

Panel controlpanel = new Panel();
b1 = new Button("Botones");
b2 = new Button("Texto");
b3 = new Button("Area de texto");
b4 = new Button("Pizarra");

//Si se pulsa b1, mostramos el panel de los botones
b1.addMouseListener(new MouseAdapter ( ){
public void mousePressed(final MouseEvent e ){
cl.show(cardpanel , "Botones" ) ;
}
});
//Si se pulsa b2, mostramos el panel del texto
b2.addMouseListener(new MouseAdapter ( ){
public void mousePressed(final MouseEvent e ){
cl.show(cardpanel , "Texto" ) ;
}
});
//Si se pulsa b3, mostramos el panel del texto
b3.addMouseListener(new MouseAdapter ( ){
public void mousePressed(final MouseEvent e ){
cl.show(cardpanel , "Area" ) ;
}
});
//Si se pulsa b4, mostramos el panel del texto
b4.addMouseListener(new MouseAdapter ( ){
public void mousePressed(final MouseEvent e ){
cl.show(cardpanel , "Pizarra" ) ;
}
});

a.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(final MouseEvent e ){
		Button btn = (Button)e.getSource();
		String text = t.getText();
		t.setText(text + "\n" +btn.getLabel());
		}
});

x0.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x1.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x2.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x3.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x4.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x5.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x6.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x7.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});
x8.addMouseListener(new MouseAdapter ( ){

	public void mousePressed(MouseEvent e){
			String text;
			
			if (turno==true){
				text = "X";
				turno= !turno;
			}else {
				text = "O";
				turno= !turno;
			}
			
			System.out.println(turno);
			
			Button btn = (Button)e.getSource();
			
			if(btn.getLabel() == "") {
				btn.setLabel(text);  				
			}
		}
});

controlpanel.add(b1);
controlpanel.add(b2);
controlpanel.add(b3);
controlpanel.add(b4);
setLayout(new BorderLayout());
add(controlpanel,BorderLayout.NORTH);
add(cardpanel,BorderLayout.CENTER);

}
}