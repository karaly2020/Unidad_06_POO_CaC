/*Confeccionar una ventana con:
○ Título: Alumnos
■ Tamaño: 600 px x 400 px
○ Debe contener:
■ 1 etiqueta Nombre y su campo de texto
■ 1 etiqueta Apellido y su campo de texto
■ 1 botón de Aceptar, al hacer clic en el botón deben aparecer el nombre y el apellido en el título de la ventana
■ 1 botón de Salir, debe cerrar la aplicación */
package ejercicio_11;
import javax.swing.JFrame;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setTitle("Alumnos");     
        VV.setLocationRelativeTo(null);
        VV.setSize(600,400);
        //VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
