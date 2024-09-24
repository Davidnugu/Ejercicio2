/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.david.ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
      //arreglo unidimensional
        int[] valores = new int[20];
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        
        for (int i = 0 ; i < valores.length ; i++){
            valores [i] = random.nextInt(250)+1; //random
        }
        for (int valor : valores){
        System.out.println("Valores del arreglo: "+ valor);
        }
        System.out.println("Ingrese valor para buscar: ");
        int valorBuscado = scanner.nextInt();
        boolean encontrado = false;
        
        for (int valor : valores){
            if(valor == valorBuscado){
            encontrado = true;
            break;
            }
        } 
        System.out.println("Valor encontrado");
       
        //otro punto
        System.out.println("Ingrese valor para buscar y mostrar: ");
        valorBuscado = scanner.nextInt();
        int posicion = -1;
        for (int i = 0; i < valores.length; i++){
            if(valores[i] == valorBuscado){
                posicion = i;
                break;
            }
        }
        System.out.println("Valor encontrado: " + valorBuscado);

        //buscar el valor mayor.
        int mayor = valores[0];
        for (int valor : valores){
            if(valor > mayor){
                mayor = valor;
            }
        }
        System.out.println("El valor mayor es: " + mayor);
        
        //Buscar la posicion del elemento menor.
        
        int menor = valores[0];
        int posicionMenor = 0;
        for(int i = 1 ; i < valores.length; i++){
            if (valores[i] < menor){
                menor = valores[i];
                posicionMenor = i;
            }
        }
        System.out.println("La posicion del valor menor es: " + posicionMenor);
        
//inicia otro proceso
        System.out.println("Ingrese una posicion a modificar entre 0-19");
        int modificar = scanner.nextInt();
        if(modificar >= 0 && modificar < valores.length){
            System.out.println("Ingrese un nuevo valor: ");
            valores[modificar] = scanner.nextInt();
        }else{
            System.out.println("Posicion no disponible");
        }
        
        // mostrar valores modificados.
        for(int valor : valores){
            System.out.println("Valores modificados " + valor);
        }

    }//main
}//Class
