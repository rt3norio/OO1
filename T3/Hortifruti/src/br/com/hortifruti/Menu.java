package br.com.hortifruti;

class Menu {

	/*
	 * 1. colocar produto na cesta (usuário deve indicar o tipo e a quantidade);

2. mostrar o conteúdo da cesta e, ao final, o valor total da cesta;
 e 3. limpar a cesta. Considere o modelo mostrado abaixo:
	 */
	public void exibeMenuPrincipal(){
		System.out.printf("\n\n\n\n\n");
		System.out.println("Menu Principal");
		System.out.println("==============");
		System.out.println("1 para adicionar produto na cesta");
		System.out.println("2 para mostrar o conteudo da cesta e o valor");
		System.out.println("3 para limpar a cesta");
		System.out.println("4 para encerrar");
	}
	public void exibeMenuOpcao1_1(){
		System.out.printf("\n\n\n\n\n");
		System.out.println("Insira a Quantidade a Comprar: ");
	}
	
	public void exibeMenuOpcao1_2(){
		System.out.printf("\n\n\n\n\n");
		System.out.println("Menu Adicionar Produto:");
		System.out.println("Escolha o tipo do produto: ");
		System.out.println("1: Banana");
		System.out.println("2: Limão");
		System.out.println("3: Maçã");
		System.out.println("4: Mamão");
		System.out.println("5: Morango");
		System.out.println("6: Pera");
		System.out.println("7: Uva");
	}
}
