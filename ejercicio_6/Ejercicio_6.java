/*Crear una ventana con las siguientes características:
○ Título= “Ventana con etiquetas”
○ Ubicación= centrada - Tamaño= “400 píxeles * 400 píxeles”
○ Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
○ Dentro de la ventana se debe colocar la etiqueta: “Nombre:”
○ A continuación de la etiqueta se debe colocar un campo de texto para ser completado.*/
package ejercicio_6;
import javax.swing.JFrame;
import listaDesplegable.Pantalla;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Ventana VV = new Ventana ();
        VV.setVisible(true);
        VV.setTitle("Ventana con etiquetas");     
        VV.setLocationRelativeTo(null);
        VV.setSize(400,400);
        VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
