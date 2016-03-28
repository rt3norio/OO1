/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetounico;

/**
 *
 * @author Yuri, Rodrigo e Mauricio
 */
public class Unica {

	private static Unica instanciaUnica = new Unica ();

	private Unica() {}
        
	public static Unica pegaInstancia() {return instanciaUnica;	}
}

class Teste {
   public static void main(String[] args) {
      Unica u = Unica.pegaInstancia();
      Unica v = Unica.pegaInstancia();
      Unica x = Unica.pegaInstancia();
      System.out.println((u == v) && (x == v)); // Deve retornar true
   }
}
