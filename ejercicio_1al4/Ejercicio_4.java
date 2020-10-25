/* Hacer un menú muy sencillo. El menú se mostrará por pantalla y tendrá las siguientes opciones:
○ 1. Saludar
○ 2. Despedirse
○ 3. Salir
• Si el usuario introduce un 1, el programa le pedirá el nombre lo saludará: Hola Pepito
• Si el usuario introduce un 2, el programa se despedirá: Adiós
• Si el usuario introduce un 3, el programa terminará.
• Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados.*/
package ejercicio_1al4;
import static ejercicio_1al4.Ejercicio_3.mostrarArreglo;
import javax.swing.JOptionPane;
public class Ejercicio_4 {
    public static void main(String[] args) {
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 - 3"));
        
        switch(opcion) {
           
                case 1: 
                        String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
			JOptionPane.showMessageDialog(null, "Hola " +nombre);
			break;
                    
                case 2: 
                        
			JOptionPane.showMessageDialog(null, "Adios!!");
			break;
                    
                case 3: 
                        default: 
			break;		
        }
    }
}
