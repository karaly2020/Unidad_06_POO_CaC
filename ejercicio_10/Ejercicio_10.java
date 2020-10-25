/*Crear una ventana con las siguientes características:
○ Título= “Ventana con botones de selección única”
○ Ubicación= centrada - Tamaño= “400 píxeles * 400 píxeles” 
○ Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
○ Dentro de la ventana se debe colocar un grupo de botones de selección única con los posibles estados
civiles (ejemplo: Soltero, Casado, Viudo, Divorciado, Otro).*/
package ejercicio_10;
import javax.swing.JFrame;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setTitle("“Ventana con botones de selección única”");     
        VV.setLocationRelativeTo(null);
        VV.setSize(400,400);
        VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
