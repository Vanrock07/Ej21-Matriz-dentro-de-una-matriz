/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21.matriz.dentro.de.una.matriz;

import java.util.Scanner;

/**
 *
 * @author Ivan Ramirez
 */
public class Ej21MatrizDentroDeUnaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int [][] M = new int [10] [10];
        int [][] P = new int [3][3]; 
         
        matriz(M);
        matrizB(P, leer);
        compararmatriz(M,P);
        
    }
        public static void matriz(int[][] M) {   //metodo matriz, para llenar la matriz 10x10
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                    M [i][j] = (int)(Math.random() *10) ;  //funcion de llenado aleatorio      
           }  
        }    
           
           for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                    System.out.print( + M[i][j] + " | ");
           }  
                    System.out.println(" ");
        }    
     }
        
        public static void matrizB(int[][] P, Scanner leer) {  //metodo matrizB para llenar la matriz manualmente
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                
                    System.out.println("Escriba los valores de la matriz 3x3");
                     P [i][j] = leer.nextInt();
           }  
        } 
       
             for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                
                    System.out.print(+ P[i][j] + " | ");        
           }  
                    System.out.println(" ");
        }      
} 
        
       public static void compararmatriz(int [][]M, int[][]P) {  //metodo comparar matriz donde se comparan las matrices
           
          
                    int  cont = 0, hor = 0, ver = 0;
      
     
                    for (int i = 0; i < 3; i++) { 
                            for (int j = 0; j < 3; j++) {
                                
                                    if (P[i][j] == M[i+ver][j+hor]) {
                                   
                                     cont ++;   
                                     //System.out.print( + cont);
                                     //System.out.println(+ (i+ver)+", "+(j+hor));
                                        if(cont ==9) {
                                          System.out.println("La matriz B está contenida en A ");
                                              }
                                    }  
                                        else if(hor<7){ 
                                        cont = 0;
                                        hor++;
                                        j = -1;
                                       
                                    }
                                        else if(ver<7){
                                        cont = 0;
                                        hor = 0;
                                        ver++;
                                        j= -1;
                                      }
                                        else {
                                          System.out.println("La matriz no esta contenida en A");
                }
            }
        }
    }
}
        
  

                                                
                                      
                                                
                        
                
            
      


        
                       
               
                
                
     
                 
           
        
     


                    
                        
                        
                            
                        
                        
                    
               
           
              
           
               
           
           
           





