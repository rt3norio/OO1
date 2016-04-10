package br.com.hortifruti;

abstract class Produtos {

	private Integer quantidade;
	protected String nome;

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	abstract double getPreco();
	
	public String getNome(){
		return nome;
	}
}


class Banana extends Produtos {
	final Double preco = 1.50;
	public Banana(Integer qtd){
		this.nome = "Banana";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Maca extends Produtos {
	final Double preco = 2.00;
	public Maca(Integer qtd){
		this.nome = "Maçã";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Pera extends Produtos {
	final Double preco = 1.50;
	public Pera(Integer qtd){
		this.nome = "Pêra";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Uva extends Produtos {
	final Double preco = 3.00;
	public Uva(Integer qtd){
		this.nome = "Uva";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Morango extends Produtos {
	final Double preco = 0.33;
	public Morango(Integer qtd){
		this.nome = "Morango";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Limao extends Produtos {
	final Double preco = 0.25;
	public Limao(Integer qtd){
		this.nome = "Limão";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}

class Mamao extends Produtos {
	final Double preco = 3.50;
	public Mamao(Integer qtd){
		this.nome = "Mamão";
		this.setQuantidade(qtd);
	}
	@Override
	double getPreco() {
		return preco;
	}
}