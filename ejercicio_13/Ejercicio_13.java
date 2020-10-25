/*Confeccionar una ventana con:
○ Título: Pasajero
■ Tamaño: 700 px x 500 px
○ Debe contener:
■ 1 etiqueta Nombre y su campo de texto
■ 1 etiqueta Apellido y su campo de texto
■ 1 grupo de botones alternativos con los posibles estados civiles
■ 1 lista desplegable con la lista de países a los que puede viajar
■ 1 cuadros de selección múltiple con los idiomas que habla el pasajero.
■ 1 botón de Aceptar, al hacer clic en el botón en un cuadro desplegable deben aparecer el nombre y el apellido, 
el país de destino, el estado civil y los idiomas que habla el pasajero
■ 1 botón de Salir, debe cerrar la aplicación*/
package ejercicio_13;
import javax.swing.JFrame;
public class Ejercicio_13 {
    public static void main(String[] args) {
        Ventana VV = new  Ventana ();
        VV.setVisible(true);
        VV.setLocationRelativeTo(null);
        VV.setSize(700,500);
        //VV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
