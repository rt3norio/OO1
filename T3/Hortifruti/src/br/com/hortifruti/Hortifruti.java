package br.com.hortifruti;

import java.util.Scanner;

public class Hortifruti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cesta cesta = new Cesta();
		while (true){
			Menu menu = new Menu();
			menu.exibeMenuPrincipal();
			switch(scan.nextInt()){
				case 1:
					int qt;
					menu.exibeMenuOpcao1_1();
					qt = scan.nextInt();
					menu.exibeMenuOpcao1_2();
					switch(scan.nextInt()){
						case 1:
							cesta.adicionarProduto(new Banana(qt));
							break;
						case 2:
							cesta.adicionarProduto(new Limao(qt));
							break;
						case 3:
							cesta.adicionarProduto(new Maca(qt));
							break;
						case 4:
							cesta.adicionarProduto(new Mamao(qt));
							break;
						case 5:
							cesta.adicionarProduto(new Morango(qt));
							break;
						case 6: 
							cesta.adicionarProduto(new Pera(qt));
							break;
						case 7:
							cesta.adicionarProduto(new Uva(qt));
							break;
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
					return;
				default:
					continue;
			}
		}

	}

}
