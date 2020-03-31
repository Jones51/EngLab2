package Jogo;

public class criarJogo {
	private jogo jogo;

    public criarJogo() { }

    public criarJogo para(String descricao,int rodadas) {
        this.jogo = new jogo(descricao, rodadas);
        return this;
    }

    public criarJogo resultado(participante participante, double metrica) {
        jogo.anota(new resultado(participante, metrica));
        return this;
    }

    public jogo constroi() { 
        return jogo;
    }
}
