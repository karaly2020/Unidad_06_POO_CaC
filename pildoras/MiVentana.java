package pildoras;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class MiVentana {
    public static void main(String[] args) {
       miMarco marco1 = new miMarco ();
       marco1.setVisible(true); //Hacer visible el marco
       marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cuando se cierre la ventana el programa tiene que cerrar
       //marco1.setTitle("Ventana de Prueba");
    }
}
class miMarco extends JFrame{
    public miMarco(){
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por el q estas ejecutando la pantalla
        Dimension tamanioPantalla = miPantalla.getScreenSize(); // obtengo el tamanio de la pantalla 
        int alturaPantalla = tamanioPantalla.height; // obtengo el valor del alto de mi pantalla
        int anchoPantalla = tamanioPantalla.width;// obtengo el valor del ancho de mi pantalla
        setSize(anchoPantalla/2, alturaPantalla/2 );
        setLocation (anchoPantalla/4, alturaPantalla/4);
        
        //setSize (400,300); // tamanio del marco
        //setLocation (400,300); //establece la localizacion del marco 0,0 es la esquina superior izq del marco
        //setBounds (400, 300, 250,250); // ubicacion x=400 y=300 y tamanio 250 x 250 por ejm
        //setResizable (false); //perimite o no la redimension del marco
        //setExtendedState(Frame.MAXIMIZED_BOTH); //marco se ejecuta a pantalla completa
        setTitle ("Ventana de Prueba");
        //Image miIcono = miPantalla.getImage("icono.gif"); // se designa el nombre del icono (gif, jpg, png)
        //por defecto se coloca ese nombre con la ubicacion en la raiz del proyecto
        //setIconImage(miIcono); //se establece el icono
        
    }
            
}