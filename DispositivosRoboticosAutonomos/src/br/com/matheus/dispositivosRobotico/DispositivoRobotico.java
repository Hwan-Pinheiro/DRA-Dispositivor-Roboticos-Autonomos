package br.com.matheus.dispositivosRobotico;

public class DispositivoRobotico {
	private String nome;
    private double capacidadeLocomocao;
    private double energiaDisponivel;
    private double capacidadeColetaDados; 
    
    public DispositivoRobotico(String nome, double capacidadeLocomocao, double energiaDisponivel,
			double capacidadeColetaDados) {
		super();
		this.nome = nome;
		this.capacidadeLocomocao = capacidadeLocomocao;
		this.energiaDisponivel = energiaDisponivel;
		this.capacidadeColetaDados = capacidadeColetaDados;
	}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getCapacidadeLocomocao() {
        return capacidadeLocomocao;
    }
    public void setCapacidadeLocomocao(double capacidadeLocomocao) {
        this.capacidadeLocomocao = capacidadeLocomocao;
    }
    public double getEnergiaDisponivel() {
        return energiaDisponivel;
    }
    public void setEnergiaDisponivel(double energiaDisponivel) {
        this.energiaDisponivel = energiaDisponivel;
    }
    public double getCapacidadeColetaDados() {
        return capacidadeColetaDados;
    }
    public void setCapacidadeColetaDados(double capacidadeColetaDados) {
        this.capacidadeColetaDados = capacidadeColetaDados;
    }
    
    public void calcularEficiencia() {
        System.out.println("Método de cálculo de eficiência não implementado para " + nome);
    }
}
