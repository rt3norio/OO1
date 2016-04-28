import java.util.ArrayList;

public class Departamento {
	int cod;
	String nome;
	Funcionario chefe;
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Departamento(int cod, String nome, Funcionario chefe) {
		this.cod = cod;
		this.nome = nome;
		this.chefe = chefe;
		chefe.setDepartamentoChefia(this);
	}

	public int getCodDepto() {
		return this.cod;
	}

	public String getNome() {
		return this.nome;
	}

	public Funcionario getChefe() {
		return this.chefe;
	}


	public void alocarFunc(Funcionario func) {
		funcionarios.add(func);
		func.setDepartamentoAlocado(this);
		
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios.toArray(new Funcionario[funcionarios.size()]);
	}

}
