package br.com.hortifruti;

class Cesta {
	static Integer nprodutos = 0;
	Produtos[] vProdutos = new Produtos[12];
	
	public Boolean adicionarProduto(Produtos item){
		if (nprodutos < 12){
			vProdutos[nprodutos++] = item;
			return true;
		}
		else{
			return false;
		}
	}
	public Double CalcularTotal(){
		Double total = 0.0;
		for (Produtos prod:vProdutos){
			total += prod.getPreco() * prod.getQuantidade();
		}
		return total;	
	}
	
	public void ListarCesta(){
		Double total = 0.0;
		for (int i = 0; i < vProdutos.length; i++) {
			Produtos prod = vProdutos[i];
			if (prod == null) {
				System.out.println("Total: R$"+total);
				return;
			}
			System.out.printf("\n\n\n\n\n");
			System.out.printf("###Cesta de Compras###\n");
			System.out.print(prod.getNome()+": ");
			System.out.print(prod.getQuantidade()+"un. * R$");
			System.out.println(prod.getPreco()+" = R$"+prod.getPreco()*prod.getQuantidade());
			total += prod.getPreco()*prod.getQuantidade();
		}
		System.out.println("\n        Total: R$"+total);
		
	}
}
