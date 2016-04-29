package br.com.FuncExc;

import org.junit.Assert;
import org.junit.Test;

public class FuncExcTest {
    @Test
	public void criaFuncionarioValido() {
		
            Funcionario ana;
            ana = new Funcionario("Ana",989.1);
            Assert.assertEquals(989.1, ana.getSalario(), 0.001);
            Assert.assertEquals("Ana", ana.getNome());
        }
        
    @Test
        (expected = IllegalArgumentException.class)
        public void nomeErrado(){
            Funcionario joao;
            joao = new Funcionario("Aqui Tem Mais de Quarenta caracteres você sabia disso?",1451.32);
        }
        
    @Test
        (expected = ViolacaoCltException.class)
        public void violacaoCLT(){
            Funcionario joao;
            joao = new Funcionario("Joao",151.32);
        }
        
    @Test
        (expected = AumentoAbsurdoException.class)
        public void aumentoAbsurdo(){
            Funcionario joao;
            joao = new Funcionario("Joao",1051.32);
            joao.setSalario(6000.00);
        }
}
