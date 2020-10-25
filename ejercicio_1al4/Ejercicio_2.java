/*El usuario ingresa 12 valores, de a uno por vez, pertenecientes a sus sueldos mensuales durante un año. 
La computadora muestra su sueldo anual. Si durante la carga de los sueldos mensuales se detecta un valor negativo, 
esto indica que aún no se ha cobrado el mes en curso, por lo tanto, deben dejar de ingresar datos y la computadora 
debe mostrar la sumatoria de sueldos que se llevan cobrados. Usar la clase JOptionPane tanto para cargar datos como 
para mostrar mensajes y resultados.*/
package ejercicio_1al4;
import javax.swing.JOptionPane;
public class Ejercicio_2 {
    public static void main(String[] args) {
        int contador = 0;
        double total=0;
        double sueldo =0;
        
        do { 
            String pedirSueldos = JOptionPane.showInputDialog("Ingrese el monto del salario N° " +(contador+1));
            sueldo = Double.parseDouble(pedirSueldos);
            contador++;
                
            if (sueldo > 0){
            total += sueldo;
            }else
                JOptionPane.showMessageDialog(null, "El monto ingresado no es correcto");
        }while (sueldo > 0 && contador < 12);
            JOptionPane.showMessageDialog(null, "La suma de los salarios a la fecha es : " + total);
    }
 }

    

