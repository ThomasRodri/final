package challenge2.model;

import java.time.LocalDate;

public class Apolice {

	private int numeroDaApolice;
	private LocalDate dataDeInicio;
	private LocalDate dataDeTermino;
	private boolean reembolso;
	private int valorDoSeguro;
	
	public Apolice() {
		
	}
	
	public Apolice(int numeroDaApolice, LocalDate dataDeInicio, LocalDate dataDeTermino, boolean reembolso, int valorDoSeguro) {
		this.numeroDaApolice = numeroDaApolice;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
		this.reembolso = reembolso;
		this.valorDoSeguro = valorDoSeguro;
	}

	public int getNumeroDaApolice() {
		return numeroDaApolice;
	}
	public void setNumeroDaApolice(int numeroDaApolice) {
		this.numeroDaApolice = numeroDaApolice;
	}
	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public LocalDate getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataDeTermino(LocalDate dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	public boolean isReembolso() {
		return reembolso;
	}
	public void setReembolso(boolean reembolso) {
		this.reembolso = reembolso;
	}
	public int getValorDoSeguro() {
		return valorDoSeguro;
	}
	public void setValorDoSeguro(int valorDoSeguro) {
		this.valorDoSeguro = valorDoSeguro;
	}
	
}

