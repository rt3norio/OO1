package br.com.hortifruti;

import java.util.Scanner;

public class Hortifruti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cesta cesta = new Cesta();
		while (true){
			Menu menu = new Menu();
			menu.exibeMenuPrincipal();
			Boolean check_add_produto = false;
			switch(scan.nextInt()){
				case 1:
					int qt;
					menu.exibeMenuOpcao1_1();
					qt = scan.nextInt();
					menu.exibeMenuOpcao1_2();
					switch(scan.nextInt()){
						case 1:
							check_add_produto = cesta.adicionarProduto(new Banana(qt));
							break;
						case 2:
							check_add_produto = cesta.adicionarProduto(new Limao(qt));
							break;
						case 3:
							check_add_produto = cesta.adicionarProduto(new Maca(qt));
							break;
						case 4:
							check_add_produto = cesta.adicionarProduto(new Mamao(qt));
							break;
						case 5:
							check_add_produto = cesta.adicionarProduto(new Morango(qt));
							break;
						case 6: 
							check_add_produto = cesta.adicionarProduto(new Pera(qt));
							break;
						case 7:
							check_add_produto = cesta.adicionarProduto(new Uva(qt));
							break;
					}
					if(check_add_produto){
						System.out.println("\n\nProduto Adicionado com Sucesso!");
						scan.nextLine();
						scan.nextLine();
					}
					else{
						System.out.println("\n\nFALHA AO ADICIONAR PRODUTO!");
						scan.nextLine();
						scan.nextLine();
					}
					break;
				case 2:
					cesta.ListarCesta();
					scan.nextLine();
					scan.nextLine();
					break;
				case 3:
					cesta = new Cesta();
					break;
				case 0:
					scan.close();
					return;
				default:
					continue;
			}
		}

	}

}
