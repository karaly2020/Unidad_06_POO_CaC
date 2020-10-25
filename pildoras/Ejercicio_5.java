/*Crear una ventana con las siguientes características:
○ Título= “Ventana de prueba”
○ Ubicación= centrada
○ tamaño= “300 píxeles * 400 píxeles” */
package pildoras;
import pildoras.miMarco;
import pildoras.*;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Ejercicio_5 {
    public static void main(String[] args) {
       miMarco marco1 = new miMarco ();
       marco1.setVisible(true); //Hacer visible el marco
       marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cuando se cierre la ventana el programa tiene que cerrar
       marco1.setLocationRelativeTo(null);
    }
}
class miMarco1 extends JFrame{
    public miMarco1(){
        
//        Toolkit miPantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por el q estas ejecutando la pantalla
//        Dimension tamanioPantalla = miPantalla.getScreenSize(); // obtengo el tamanio de la pantalla 
//        Dimension tamanioMarco = getSize(); // tamanio de la aplicacion
//        int alturaPantalla = tamanioPantalla.height; // obtengo el valor del alto de mi pantalla
//        int anchoPantalla = tamanioPantalla.width;// obtengo el valor del ancho de mi pantalla
        //setSize(anchoPantalla/2, alturaPantalla/2 );
        //setLocationRelativeTo(null);
        //setLocation (anchoPantalla/4, alturaPantalla/4);
        //setLocation ((tamanioPantalla.width - tamanioMarco.width) / 2,(tamanioPantalla.height - tamanioMarco.height / 2));
        //setBounds (anchoPantalla/3, alturaPantalla/4, 300,400); // ubicacion x=400 y=300 y tamanio 250 x 250 por ejm
        
        setSize (300,400); // tamanio del marco
        //setLocation (300,400); //establece la localizacion del marco 0,0 es la esquina superior izr del marco
        //setBounds (300,400, 250,250); // ubicacion x=400 y=300 y tamanio 250 x 250 por ejm
        //setResizable (false); //perimite o no la redimension del marco
        //setExtendedState(Frame.MAXIMIZED_BOTH); //marco se ejecuta a pantalla completa
        setTitle ("Ventana de Prueba");
        //Image miIcono = miPantalla.getImage("icono.gif"); // se designa el nombre del icono (gif, jpg, png)
        //por defecto se coloca ese nombre con la ubicacion en la raiz del proyecto
        //setIconImage(miIcono); //se establece el icono
        
    }
            
}