/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidenumeros;

import java.util.Scanner;

/**
 *
 * @author suelly
 */
public class PiramideNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Insira um numero (1-9)");
        Scanner sc = new Scanner(System.in);
        Integer input;
        int espacos;
        do{
            input = sc.nextInt();
            if (input < 10 & input > 0){
                break;
            }
            else{
                System.out.println("Numero Inválido! Insira novamente, um numero (1-9)");
            }
        }while(true);
        
        espacos = input-1;
        
        for (Integer i=0;i<input;i++){
            int espacosVolta = espacos;
            while (espacosVolta>0){
                System.out.print(' ');
                espacosVolta--;
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print(i+1);
            for (int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            espacos--;
        }
        
        
        // TODO code application logic here
    }
    
}
