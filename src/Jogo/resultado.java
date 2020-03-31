package Jogo;

public class resultado {
	private participante participante;
	private double metrica;
	
	public resultado(participante participante, double metrica) {
		this.participante = participante;
		this.metrica = metrica;
	}

	public participante getParticipante() {
		return participante;
	}

	public double getMetrica() {
		return metrica;
	}
	
}
