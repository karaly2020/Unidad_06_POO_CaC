/*Crear una ventana con las siguientes características:
○ Título= “Ventana con lista desplegable”
○ Ubicación= centrada - Tamaño= “500 píxeles * 500 píxeles”
○ Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
○ Dentro de la ventana se debe colocar una lista desplegable, con los 7 colores del arco iris (es decir, 
desplegando la lista deberá aparecer el texto con los colores: “rojo”, “naranja”, “amarillo”, “verde”, “cian”, 
“azul” y “violeta”). */
package ejercicio_8;
import javax.swing.JFrame;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setTitle("Ventana con lista desplegable");     
        VV.setLocationRelativeTo(null);
        VV.setSize(500,500);
        VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
