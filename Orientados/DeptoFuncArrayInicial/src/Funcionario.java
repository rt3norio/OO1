public class Funcionario {
	private String nome;
	private int matr;
	private Departamento deptoPertence;
	private Departamento deptoChefia;
	public Funcionario(int matr, String nome, Departamento depto) {
		this.nome = nome;
		this.matr = matr;
		this.deptoPertence = depto;
	}
	
	
	public int getMatricula() {
		return matr;
	}
	public String getNome() {
		return nome;
	}
	public Departamento getDepartamentoAlocado() {
		return this.deptoPertence;
	}
	public Departamento getDepartamentoChefia() {
		return this.deptoChefia;
	}
	public void setDepartamentoChefia(Departamento chefia){
		setDepartamentoAlocado(chefia);
		this.deptoChefia = chefia;
		chefia.alocarFunc(this);
	}
	void setDepartamentoAlocado(Departamento depto){
		this.deptoPertence = depto;
		
	}
	
}


/*
Funcionario ana = new Funcionario(123,"Ana",null);

Assert.assertEquals(ana.getMatricula(), 123);
Assert.assertEquals(ana.getNome(), "Ana");
Assert.assertNull(ana.getDepartamentoAlocado());
Assert.assertNull(ana.getDepartamentoChefia());*/