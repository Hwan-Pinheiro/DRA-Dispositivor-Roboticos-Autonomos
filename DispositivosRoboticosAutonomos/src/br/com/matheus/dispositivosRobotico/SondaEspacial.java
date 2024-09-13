package br.com.matheus.dispositivosRobotico;

public class SondaEspacial extends DispositivoRobotico{
	 private double velocidadeTransmissao;
	    private double autonomiaVoo;

	    public SondaEspacial(String nome, double capacidadeLocomocao, double energiaDisponivel, double capacidadeColetaDados, double velocidadeTransmissao, double autonomiaVoo) {
	        super(nome, capacidadeLocomocao, energiaDisponivel, capacidadeColetaDados);
	        this.velocidadeTransmissao = velocidadeTransmissao;
	        this.autonomiaVoo = autonomiaVoo;
	    }
	    public double getVelocidadeTransmissao() {
	        return velocidadeTransmissao;
	    }
	    public void setVelocidadeTransmissao(double velocidadeTransmissao) {
	        this.velocidadeTransmissao = velocidadeTransmissao;
	    }
	    public double getAutonomiaVoo() {
	        return autonomiaVoo;
	    }
	    public void setAutonomiaVoo(double autonomiaVoo) {
	        this.autonomiaVoo = autonomiaVoo;
	    }
	    public void transmitirDados() {
	        System.out.println("Transmitindo dados coletados pela sonda espacial: " + getNome());
	    }
	    public void explorarPlaneta() {
	        System.out.println("Explorando o planeta com a sonda espacial: " + getNome());
	    }
	    
	    @Override
	    public void calcularEficiencia() {
	        System.out.println("Calculando eficiência para a sonda espacial: " + getNome());
	        double eficiencia = getAutonomiaVoo() / getVelocidadeTransmissao();
	        System.out.println("Eficiência calculada: " + eficiencia);
	    }
}
