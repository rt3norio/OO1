/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advinum;

import java.util.Scanner;

/**
 *
 * @author TenorioSafadão
 */
public class AdviNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String player1,player2;
        Integer alvo;
        alvo = (int) Math.random()*1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo Adivinha o Numero!");
        System.out.println("Para começar, Insira os nomes: ");
        System.out.print("Jogador 1: ");
        player1 = sc.nextLine();
        System.out.print("Jogador 2: ");
        player2 = sc.nextLine();
        
        if (Math.random() > 0.5){
            
        }
        else{
            
        }
        System.out.println("Jogador sorteado para começar: ");
        
        do{
            Integer palpite;
            System.out.print("Palpite "+player1+": ");
            palpite = sc.nextInt();
            if (palpite == alvo){
                System.out.println("Parabéns! "+player1+" Venceu!");
                break;
            }
            else{
                System.out.println("numero é maior ou menor dependendo de um if");
            }
            
            
        }while(true);
        
    }
    
}
