package br.com.FuncExc;

public class Funcionario {
	private Integer matricula;
	private String nome;
	private Double salario;
	
	public Funcionario (String nome,Double salario){
		if (nome.length()>40){
			throw new IllegalArgumentException();
		}
		else{
			this.nome = nome;
		}
		if (salario < 350.0){
			throw new ViolacaoCltException();
		}
		else{
			this.salario = salario;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		if (salario > this.salario*1.1){
			throw new AumentoAbsurdoException();
		}
		else{
			this.salario = salario;	
		}
	}
	public Integer getMatricula() {
		return matricula;
	}
	
}
