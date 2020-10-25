/*Se ingresan 5 números pertenecientes al arreglo A y otros 5 números pertenecientes al arreglo B. 
La computadora muestra un arreglo C, donde cada posición es el resultado de la suma del número en 
la misma posición en el arreglo A con el número en la misma posición en el arreglo B. Ejemplo: 
Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 5 9 4 7 11. Usar la clase JOptionPane tanto para 
cargar datos como para mostrar mensajes y resultados.*/
package ejercicio_1al4;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio_3 {
    public static void main(String[] args) {
        int [] arregloC;
        
        JOptionPane.showMessageDialog(null, "Ingrese los valores del arreglo 'A':");
        int[] arregloA = crearArregloDeNumeros(5);
        JOptionPane.showMessageDialog(null, "Ingrese los valores del arreglo 'B':");
        int [] arregloB = crearArregloDeNumeros(5);
        
        mostrarArreglo(arregloA, "Arreglo [A]:");
        mostrarArreglo(arregloB, "Arreglo [B]:");
        arregloC = sumarArreglo(arregloA, arregloB);
        mostrarArreglo(arregloC, "Arreglo [C]:");
    }
    static void mostrarArreglo (int[]num, String titulo){
        String resultado = " ";
        for (int i= 0; i<num.length; i++){
            resultado = resultado + " - " + num[i];       
        }
        JOptionPane.showMessageDialog(null, titulo + resultado);
    }
    
    static int[] sumarArreglo (int[]arregloA,int[]arregloB ){
        int[] arregloSalida = new int[arregloA.length];
        
        for (int i= 0; i<arregloA.length; i++){
            arregloSalida [i]  = arregloA [i] + arregloB [i];
        }
        return arregloSalida;
    }
 
    static int[] crearArregloDeNumeros(int tamano){
        int[] nuevoArreglo = new int[tamano];
        
        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = (Integer.parseInt(JOptionPane.showInputDialog(null, "Valor " + (i+1) + " de " + 
                    nuevoArreglo.length + ": ")));
        }
        return nuevoArreglo;
    }
}
    
    

