package GUI;

        import javax.swing.*;
        import java.awt.*;


public class Window extends JFrame {
    public Window(){
        setSize(400,500);//Tamaño de la ventana

        setTitle("Probando");//Titulo de la ventana
        setLocationRelativeTo(null);//Establcemos la posicion inicial de la ventana en el centro
        //setLocation(100,100);//Establecemos la posicion
        //setBounds(100,100,100,100);//Posicon y tamaño
        //setResizable(false);//Si se puede cambiar de tamaño
        //setMinimumSize(new Dimension(200,200));//Tamaño minimo
        getContentPane().setBackground(Color.pink);//Color
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Termina el proceso a la hora que se cierra


        JPanel panel= new JPanel();

        getContentPane().add(panel);//Agregamos el panel a la ventana
        //panel.setBackground(Color.blue);//Desactiva el diseño
        panel.setLayout(null);
        JLabel etiquette = new JLabel("Hello");
        etiquette.setForeground(Color.white);//Color de la etiqueta
        etiquette.setHorizontalAlignment(SwingConstants.CENTER);
        etiquette.setBounds(10,10,60,40);//Posicion
        etiquette.setOpaque(true);//Permite pintar el fondo de la etiqueta
        etiquette.setBackground(Color.black);
        etiquette.setFont(new Font("chiller", 3, 20));//Fuente tipo, estilo, tamaño
        panel.add(etiquette);


}}


