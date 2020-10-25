/*7. Crear una ventana con las siguientes características:
○ Título= “Ventana con botones”
○ Ubicación= centrada - Tamaño= “600 píxeles * 400 píxeles”
○ Al hacer clic en el botón de cerrar ventana, se debe cerrar la aplicación.
○ Dentro de la ventana se debe colocar 3 botones con los textos: “Azul”, “Rojo” y “Amarillo”. */
package ejercicio_7;
import javax.swing.JFrame;
public class Ejercicio_7 {
    public static void main(String[] args) {
        
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setTitle("Ventana con botones");     
        VV.setLocationRelativeTo(null);
        VV.setSize(600,400);
        VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
