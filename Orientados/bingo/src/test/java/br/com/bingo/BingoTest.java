package br.com.bingo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BingoTest {
	@Test
	public void testAdicionarParticipantes() {
		Bingo bingo = new Bingo();
		boolean ret = bingo.adicionarParticipante(2, "Ana");
		assertTrue(ret);
		ret = bingo.adicionarParticipante(2, "Fernando");
		assertFalse( ret ); // numero ja tomado
		
		// Testa posicoes invalidas. Válido 0..59
		ret = bingo.adicionarParticipante(0, "Augusto");
		assertTrue( ret );
		ret = bingo.adicionarParticipante(-5, "Francisco");
		assertFalse( ret );
		ret = bingo.adicionarParticipante(60, "Pedro");
		assertFalse( ret );
		ret = bingo.adicionarParticipante(59, "Ivo");
		assertTrue( ret );
	}

	@Test
	public void testGetDisponiveis() {
		Bingo bingo = new Bingo();
		bingo.adicionarParticipante(5, "Ana");
		bingo.adicionarParticipante(12, "Fernando");
		bingo.adicionarParticipante(13, "Augusto");
		bingo.adicionarParticipante(24, "Francisco");
		bingo.adicionarParticipante(25, "Pedro");
		bingo.adicionarParticipante(36, "Ivo");
		bingo.adicionarParticipante(37, "Ricardo");
		int[] disponiveis = bingo.getDisponiveis();
		assertEquals(53, disponiveis.length );
		boolean ret = Arrays.equals(new int[] {0,1,2,3,4,6,7,8,9,10,11,14,15,16,17,18,19,20,
				21,22,23,26,27,28,29,30,31,32,33,34,35,38,39,40,41,42,43,44,
				45,46,47,48,49,50,51,52,53,54,55,56,57,58,59}, disponiveis);
		assertTrue( ret );
	}

	@Test
	public void testSortear() {
		Bingo bingo = new Bingo();
		bingo.adicionarParticipante(0, "Ana");
		int posicaoSorteado = bingo.sortear();
		assertEquals(0, posicaoSorteado);

		bingo.adicionarParticipante(12, "Fernando");
		bingo.adicionarParticipante(13, "Augusto");
		bingo.adicionarParticipante(24, "Francisco");
		bingo.adicionarParticipante(25, "Pedro");
		bingo.adicionarParticipante(36, "Ivo");
		bingo.adicionarParticipante(37, "Ricardo");
		bingo.adicionarParticipante(59, "Tereza");
		posicaoSorteado = bingo.sortear();
		assertTrue(String.format("%d nao eh um sorteado valido",posicaoSorteado), 
				posicaoSorteado==0 || posicaoSorteado==12 || posicaoSorteado==13 ||
				posicaoSorteado==24 || posicaoSorteado==25 || posicaoSorteado==36 ||
				posicaoSorteado==37 || posicaoSorteado==59);
	}
}