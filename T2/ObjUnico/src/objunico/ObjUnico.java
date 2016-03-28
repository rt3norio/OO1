/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objunico;

/**
 *
 * @author suelly
 */
public class ObjUnico {
        private static ObjUnico instanciaUnica = new ObjUnico();
        private ObjUnico(){}
        public static ObjUnico pegaInstancia(){return instanciaUnica;}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Teste {
   public static void main(String[] args) {
      ObjUnico u = ObjUnico.pegaInstancia();
      ObjUnico v = ObjUnico.pegaInstancia();
      ObjUnico x = ObjUnico.pegaInstancia();
      System.out.println((u == v) && (x == v)); // Deve retornar true
   }
}
