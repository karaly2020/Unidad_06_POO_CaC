/*Crear una ventana con las siguientes características:
○ Título= “Ventana de prueba”
○ Ubicación= centrada
○ tamaño= “300 píxeles * 400 píxeles” */
package ejercicio_5;
import java.awt.Frame;
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
class miMarco extends JFrame{
    public miMarco(){   
        setSize (300,400); // tamanio del marco
        setTitle ("Ventana de Prueba");
    }   
}