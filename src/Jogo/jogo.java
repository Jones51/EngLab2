package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jogo {
	private String descricao;
	private List<resultado> resultados;
	private int rodadas;
	
	public jogo(String descricao, int rodadas) {
		this.descricao = descricao;
		this.resultados = new ArrayList<resultado>();
		this.rodadas = rodadas;
	}
	
	public void anota(resultado resultado) {
		if(resultados.isEmpty() || 
                !resultados.get(ultimoResultadoVisto()).getParticipante().equals(resultado.getParticipante())) {
            resultados.add(resultado);
        }
	}
	
	public int quantidadeRodadas() {
		return this.rodadas;
	}

	private int ultimoResultadoVisto() {
		return resultados.size()-1;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<resultado> getResultados() {
		return Collections.unmodifiableList(resultados);
	}

}
