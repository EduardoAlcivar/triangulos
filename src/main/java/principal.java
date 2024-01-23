
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author GATEWAY
 */
public class principal {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz MxM
        System.out.println("Ingrese el tamaño de la matriz cuadrada MxM: ");
        int M = scanner.nextInt();

        // Crear una instancia de la clase Triangulos
        triangulos triangulos = new triangulos(M);

        // Insertar datos en la matriz utilizando el método insertaMatriz
        triangulos.insertaMatriz();

        // Imprimir la matriz ingresada
        triangulos.imprimirMatriz();

        // Imprimir el triángulo a)
        triangulos.imprimirTrianguloA();

        // Imprimir una línea en blanco para separar los triángulos
        System.out.println();

        // Imprimir el triángulo b)
        triangulos.imprimirTrianguloB();
    }
}
