/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imperialmetrico;
import java.util.Scanner;

class Medida {
    Double pe;
  	Double jarda;
  	Double milha;
  	Double polegada;
  
  void Converte(double cm) {
  	this.pe = cm * 5.0799; // 2 * 2.53995
    this.jarda = cm * 91.4382; //3 * 12 * 2.53995
    this.milha = cm * 160931.232; // 1760 * 3 * 12 * 2.53995
    this.polegada = cm * 2.53995;
  };
};

public class Imperial {
  public static void main(String[] args)  {
    Medida cm = new Medida();
    Double valor;
    System.out.println("Informe a medida em cm: ");
    Scanner sc = new Scanner(System.in);
    valor = Double.parseDouble( sc.next() );
    cm.Converte(valor);
    System.out.println("Valor de "+sc+"cm em jarda(s): "+cm.jarda);
    System.out.println("Valor de "+sc+"cm em pe(s): "+cm.pe);
    System.out.println("Valor de "+sc+"cm em milha(s): "+cm.milha);
    System.out.println("Valor de "+sc+"cm em polegada(s): "+cm.polegada);
  }
}
