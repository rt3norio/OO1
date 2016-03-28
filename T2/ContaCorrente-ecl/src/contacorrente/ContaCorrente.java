package contacorrente;

/*
 Uma Conta tem um número, um saldo e um cliente principal e,
opcionalmente, um segundo cliente secundário (conta conjunta)

As classes ContaNormal e ContaEspecial, são derivadas de Conta.
 Na conta normal, o saldo nunca pode ser menor que zero. Na conta
 especial, o saldo pode ser negativo, contanto que dentro de um 
  limite de crédito especificado. Ambas devem ter construtores, 
para indicar o número da conta, o cliente principal e, para o
  caso de conta especial, indicar também o limite. 
  
  Um Cliente 
  tem um cpf e um nome, e a classse deve possuir um construto
  r que define os valores iniciais desses dois atributos de instância.
  
   Além disso, o atributo cpf teve ter acesso externo de leitura e o 
   nome de escrita e leitura. A classe conta deve implementar um método
    depositar, que acresce ao saldo da conta o valor indicado pelo parâmetro.
    
    A classe conta deve definir um método abstrato sacar, a ser implementado
    na duas subclasses, de acordo com as especificidades de cada caso. Os 
    atributos número da conta, saldo e o cliente principal são de somente
    leitura por acesso externo. 
    
    Os atributos cliente secundário e limite
   (para o caso de conta especial) têm acesso externo de leitura e escrita.
   As classes devem ser encapsuladas.

 * 
 * 
 */

class Cliente{
	public Cliente(Integer cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	Integer cpf;
	String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}	
}
class Conta{
	protected Integer numero;
	protected Double saldo = 0.0;
	protected Cliente cliPrincipal;
	protected Cliente cliSecundario;
	
	public void setClienteSecundario(Cliente cliSecundario) {
		this.cliSecundario = cliSecundario;
	}	
	public void depositar(Integer valor){
		if (valor > 0){
			this.saldo += valor.doubleValue();
		}
		return;
	}	
}
class ContaNormal extends Conta{
	public ContaNormal(Integer numero, Cliente principal) {
		super();
		this.numero = numero;
		this.cliPrincipal = principal;
	}
	public Boolean sacar(Integer valor){
		if (valor > 0 && this.saldo > valor.doubleValue()){
			this.saldo -= valor;
			return true;
		}
		else{
			return false;
		}
	}	
}
class ContaEspecial extends Conta{
	Integer limite;
	public ContaEspecial(Integer numero, Cliente principal, Integer limite) {
		super();
		this.numero = numero;
		this.cliPrincipal = principal;
		this.limite = limite;
	}
	public Boolean sacar(Integer valor){
		if (valor > 0 && (this.saldo + this.limite.doubleValue() >= valor.doubleValue())){
			this.saldo -= valor.doubleValue();
			return true;
		}
		else{
			return false;
		}
	}
}