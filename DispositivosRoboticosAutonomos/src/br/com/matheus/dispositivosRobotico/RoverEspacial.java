package br.com.matheus.dispositivosRobotico;

public class RoverEspacial extends DispositivoRobotico{
	private double resistenciaTemperatura;
    private double capacidadeAmostras;

    public RoverEspacial(String nome, double capacidadeLocomocao, double energiaDisponivel, double capacidadeColetaDados, double resistenciaTemperatura, double capacidadeAmostras) {
        super(nome, capacidadeLocomocao, energiaDisponivel, capacidadeColetaDados);
        this.resistenciaTemperatura = resistenciaTemperatura;
        this.capacidadeAmostras = capacidadeAmostras;
    }
    public double getResistenciaTemperatura() {
        return resistenciaTemperatura;
    }
    public void setResistenciaTemperatura(double resistenciaTemperatura) {
        this.resistenciaTemperatura = resistenciaTemperatura;
    }
    public double getCapacidadeAmostras() {
        return capacidadeAmostras;
    }
    public void setCapacidadeAmostras(double capacidadeAmostras) {
        this.capacidadeAmostras = capacidadeAmostras;
    }
    public void analisarAmostras() {
        System.out.println("Analisando amostras coletadas pelo rover espacial: " + getNome());
    }
    public void enfrentarTemperaturasExtremas() {
        System.out.println("Enfrentando temperaturas extremas com o rover espacial: " + getNome());
    }
    
	    @Override
	    public void calcularEficiencia() {
	        System.out.println("Calculando eficiência para o rover espacial: " + getNome());
	        double eficiencia = getEnergiaDisponivel() / getCapacidadeColetaDados();
	        System.out.println("Eficiência calculada: " + eficiencia);
 }
} 
