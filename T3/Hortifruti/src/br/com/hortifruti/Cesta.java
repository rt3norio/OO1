package br.com.hortifruti;

class Cesta {
	Integer nprodutos = 0;
	Produtos[] vProdutos = new Produtos[12];
	
	public Boolean adicionarProduto(Produtos item){
		if (nprodutos < 13){
			vProdutos[nprodutos] = item;
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
		for (Produtos prod:vProdutos){
			System.out.print(prod.getNome()+" :");
			System.out.print(prod.getQuantidade()+"un. * R$");
			System.out.print(prod.getPreco()+" = R$"+prod.getPreco()*prod.getQuantidade());
		}
	}
}
