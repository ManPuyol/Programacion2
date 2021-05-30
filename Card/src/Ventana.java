class Ventana extends Frame{
private Button b1, b2;
private CardLayout cl;
private Panel cardpanel;
Ventana(){
super("Ejemplo de ventana");
b1 = new Button("A");
b2= new Button("B");
//Panel que va a contener tres paneles organizados
//como CardLayout
cardpanel = new Panel();
cl = new CardLayout();
cardpanel.setLayout(cl);
//El primer panel
Panel panelbotones = new Panel();
panelbotones.add(new Button("A"));
panelbotones.add(new Button("B"));
panelbotones.add(new Button("C"));
panelbotones.add(new Button("D"));
//El segundo Panel
Panel panelTexto = new Panel();
panelTexto.add(new TextField(10));
panelTexto.add(new TextField(10));

//Panel de inicio
Panel inicioPanel = new Panel( ) ;
inicioPanel.setBackground (new Color(.85f,.85f ,.85f));
inicioPanel.add(new Label("Ejemplo de CardLayout" )) ;
//A�adimos los tres panelens asignandoles un nombre
cardpanel.add(inicioPanel, "inicial");
cardpanel.add(panelbotones, "Botones");
cardpanel.add(panelTexto, "Texto");
//Panel de control desde donde se selecciona el subpanel a
mostrar
Panel controlpanel = new Panel();
b1 = new Button("Botones");
b2 = new Button("Texto");
//Si se pulsa b1, mostramos el panel de los botones
b1.addMouseListener(new MouseAdapter ( ){
public void mousePressed(MouseEvent e ){
cl.show(cardpanel , "Botones" ) ;
}
});
//Si se pulsa b2, mostramos el panel del texto
b2.addMouseListener(new MouseAdapter ( ){
public void mousePressed(MouseEvent e ){
cl.show(cardpanel , "Texto" ) ;
}
});

controlpanel.add(b1);
controlpanel.add(b2);

setLayout(new BorderLayout());
add(controlpanel,BorderLayout.NORTH);
add(cardpanel,BorderLayout.CENTER);
}

}


class EjemploVentana{

public static void main(String[] args){
Ventana v = new Ventana();
v.setSize(300,300);
v.setVisible(true);
}

}