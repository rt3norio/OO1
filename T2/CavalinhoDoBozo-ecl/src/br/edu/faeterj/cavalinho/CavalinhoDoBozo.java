package br.edu.faeterj.cavalinho;

public class CavalinhoDoBozo {
	
	public static void main(String args[]){
			while (true){
				Corrida();
				try {
				    //thread to sleep for the specified number of milliseconds
				    Thread.sleep(500);
				} catch ( java.lang.InterruptedException ie) {
				    System.out.println(ie);
				}
			}
	}
	
	static void Corrida(){

		 Cavalo [] c = new Cavalo[3];
		 c[0] = new Cavalo("BRANQUINHO");
		 c[1] = new Cavalo("MALHADINHO");
		 c[2] = new Cavalo("PRETINHO");

	 
		 while (true){
			 System.out.println("                                                                              \\/FIM!");
			 for (Cavalo atual:c){
				 atual.Correr(true);
				 if (atual.distanciaAtual >= 60.0){
					 System.out.println("\n\n\n\n\n\n\n\n\n");
					 System.out.println("                                                                              \\/FIM!");
					 for (Cavalo atualFim:c){
						 atualFim.Correr(false);
					 }
					 System.out.print("\n\t\t\t"+atual.nome+" Ganhou!");
					 return;
				 }
			 }
			 
			 try {
				    //thread to sleep for the specified number of milliseconds
				    Thread.sleep(50);
				} catch ( java.lang.InterruptedException ie) {
				    System.out.println(ie);
				}
			 System.out.println("\n\n\n\n\n\n\n\n\n");

		 }
	}
}

class Cavalo{
	String nome;
	String[] nomesPossiveis = {"BRANQUINHO","MALHADINHO","PRETINHO"};
	String icone;
	Double distanciaAtual;


	public Cavalo(String nome) { //fazer obedecer os nomes possiveis!!!!! ! ! ! !! ! ! ! ! !
		super();
		for (String nomeCandidato:nomesPossiveis){
			if (nome.equals(nomeCandidato)){
				this.nome = nome;
				this.icone = this.nome.substring(0, 1)+">";
			}
			
		}
		this.distanciaAtual = 0.0;
	}

	/*  2) a correr, que sorteia um número real entre 0 e 1, acumula esse valor a
	 *  sua distância percorrida (número real) e chama a função privada mostrar do objeto,
	 *  e retorna a distância atual já percorrida pelo cavalo; */
	public void Correr(Boolean fluxo){
		if (fluxo){
		this.distanciaAtual += Math.random();
		}
		this.Mostrar();
		
	}
	/*3) o método privado mostrar, que exibe no console um linha com o nome do cavalo e,
	 *  ao lado, o caractere avatar dele, distante n caracteres da posição do dois pontos,
	 *   sendo n a parte inteira da distância percorrida. Considerando a distância zero,
	 *    a situação inicial da tela será a seguinte:
	 *    BRANQUINHO: B>
	 *    MALHADINHO: M>
	 *    PRETINHO: P>
	 */
	 public static String repetir(int count, String com) {
		    return new String(new char[count]).replace("\0", com);
		}
	 
	private void Mostrar(){
		
		System.out.print(this.nome+'\t'+':');
		System.out.println(repetir(this.distanciaAtual.intValue(), " ")+this.icone);
		
		
	}
	
	
	
}
