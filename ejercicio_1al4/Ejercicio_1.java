/*Desarrollar un programa que pida una cantidad de artículos comprados y el precio unitario de ese artículo. 
Por cada carga debe preguntar si se desea seguir ingresando. Ejemplo: “¿Desea ingresar otro artículo? [S/N]”. 
La carga de datos finaliza cuando se detecta una “n” o “N”. La computadora debe mostrar el monto de la factura. 
Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados. */
package ejercicio_1al4;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int resp,cant;
        double total,precio;
        
        do {  
        String cantidad = JOptionPane.showInputDialog("Ingrese cantidad de articulos");
        cant = Integer.parseInt(cantidad);
        String precioUnitario = JOptionPane.showInputDialog("Ingrese el precio por unidad");
        precio = Double.parseDouble(precioUnitario);

         total = cant * precio;

         resp = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar Si=1 / No= 2"));

        } while (resp == 1);
        JOptionPane.showMessageDialog(null, "Cantidad de Articulos " +  cant  + " Precio Unidad " +  precio  
                + " La suma es " + total);
    }
}
    

