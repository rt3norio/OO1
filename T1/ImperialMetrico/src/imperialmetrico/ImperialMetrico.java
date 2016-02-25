/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imperialmetrico;
import java.util.Scanner;

/**
 *
 * @author suelly
 */
public class ImperialMetrico {

    
    static double polegadaPe(double polegada){
        return polegada/12;
    }
    
    static double peJarda(double pes){
        return pes/3;
    }
s
    static double jardaMilha(double jarda){
        return jarda/1760;
    }
    
    static double centimetroPolegada(double cent){
        //2.53995 = 1 pol
        return cent/2.53995;
                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insira o numero à converter");
        Scanner sc = new Scanner(System.in);
        double centimetros = Double.parseDouble(sc.next());
        double polegada = centimetroPolegada(centimetros);
        double pes = polegadaPe(polegada);
        double jardas = peJarda(pes);
        double milhas = jardaMilha(jardas);
        System.out.print("seu numero em Centimetros é: ");
        System.out.println(centimetros);
        System.out.print("seu numero em Polegadas é: ");
        System.out.println(polegada);
        System.out.println("seu numero em Pés é: ");
        System.out.println(pes);
        System.out.println("seu numero em Jardas é: ");
        System.out.println(jardas);
        System.out.println("seu numero em Milhas é: ");
        System.out.println(milhas);
        
            
        
        
        
        
    }
    
    
    
}
