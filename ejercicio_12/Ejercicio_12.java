/*Título: Flores
■ Tamaño: 550 px x 450 px
○ Debe contener:
■ 1 etiqueta Nombre de flor
■ 1 lista desplegable con, al menos, 5 nombres de flores
■ 1 botón de Aceptar, al hacer clic en el botón deben aparecer el nombre de la flor elegida en el título de la ventana
■ 1 botón de Salir, debe cerrar la aplicación. */
package ejercicio_12;
import javax.swing.JFrame;
public class Ejercicio_12 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
//        VV.setTitle("Flores");     
        VV.setLocationRelativeTo(null);
        VV.setSize(550,450);
        //VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
