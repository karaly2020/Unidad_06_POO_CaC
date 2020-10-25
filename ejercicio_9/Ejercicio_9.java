/*Crear una ventana con las siguientes características:
○ Título= “Ventana con casillas de selección múltiple”
○ Ubicación= centrada - Tamaño= “650 píxeles * 550 píxeles”
○ Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
○ Dentro de la ventana se debe colocar un conjunto casillas de selección múltiple con 5 lenguajes de 
programación (ejemplo: Java, PHP, Python, C, C++). */
package ejercicio_9;
import javax.swing.JFrame;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setTitle("Ventana con casillas de selección múltiple");     
        VV.setLocationRelativeTo(null);
        VV.setSize(650,550);
        VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
