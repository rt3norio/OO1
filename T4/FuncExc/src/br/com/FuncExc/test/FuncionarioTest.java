import org.junit.Assert;
import org.junit.Test;

public class FuncionarioTest {
	
	@Test
	public void criaFuncionarioValido() {
		
		Funcionario ana = new Funcionario("Ana",989);

		Assert.assertEquals(ana.getSalario(), 989);
		Assert.assertEquals(ana.getNome(), "Ana");
		//fazer testes de exceções
	}
}
