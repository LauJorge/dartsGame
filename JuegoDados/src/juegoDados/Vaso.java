package juegoDados;

import java.util.ArrayList;
import java.util.Random;

public class Vaso {

	private ArrayList<Dado> dados;

	private Random rand;

	public Vaso() {
		this.dados = new ArrayList<Dado>();
		this.rand = new Random();
	}

	public Vaso(ArrayList<Dado> dados) {
		this.dados = dados;
		this.rand = new Random();
	}

	public void addDado(Dado dado) {
		dados.add(dado);
	}

	public ArrayList<Integer> tiraDados() {
		// genera lista
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		// carga lista
		dados.forEach(dado -> 
					resultados.add(rand.nextInt(dado.getCantCaras()) + 1));
		// devuelve lista
		return resultados;
	}
}
