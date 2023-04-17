package desafio_dio_poo.entities;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate dataMentoria;
	
	public Mentoria() {
	}
	
	public Mentoria(LocalDate dataMentoria) {
		super();
		this.dataMentoria = dataMentoria;
	}

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria [dataMentoria=" + dataMentoria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}
	
	

		

}
