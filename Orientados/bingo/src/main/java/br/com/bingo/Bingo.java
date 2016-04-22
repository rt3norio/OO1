package br.com.bingo;

import java.util.Random;
import java.util.TreeSet;

public class Bingo extends BingoAbstrato{
	static int posicao;
	TreeSet<Integer> disponiveis = new TreeSet<Integer>();
	TreeSet<Participante> participantes = new TreeSet<Participante>();
	
	
	public Bingo(){
		for (int i=0;i<60;i++){
			this.disponiveis.add(i);
		}
	}
	
	public static int[] toPrimitive(Integer[] IntegerArray) {

		int[] result = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			result[i] = IntegerArray[i].intValue();
		}
		return result;
	}
	
	@Override
	public boolean adicionarParticipante(int pos, String nome) {
		if (disponiveis.contains(pos)){
			participantes.add(new Participante(pos, nome));
			disponiveis.remove(pos);
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int[] getDisponiveis() {
		return toPrimitive(disponiveis.toArray(new Integer[disponiveis.size()]));
	}

	@Override
	public int sortear() {
		Participante[] part = participantes.toArray(new Participante[participantes.size()]);
		while(true){
			int rand = new Random().nextInt(60); 
			for(Participante parti:part){
				if (parti.getPos() == rand){
					return rand;
				}
			}
		}
	}
}