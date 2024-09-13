package br.com.matheus.main;

import br.com.matheus.dispositivosRobotico.RoverEspacial;
import br.com.matheus.dispositivosRobotico.SondaEspacial;

public class Main {

	public static void main(String[] args) {
		    RoverEspacial rover = new RoverEspacial("Rover Mars 2024", 50, 1000, 500, -50, 200);
		 
	        SondaEspacial sonda = new SondaEspacial("Sonda Voyager 1", 10000, 5000, 2000, 1000, 500);

	        System.out.println("Rover Espacial: " + rover.getNome() + ", Capacidade de Amostras: " + rover.getCapacidadeAmostras() 
	        + " kg, Resistência à Temperatura: " + rover.getResistenciaTemperatura() + "°C");
	        rover.calcularEficiencia();
	        rover.analisarAmostras();
	        rover.enfrentarTemperaturasExtremas();

	        System.out.println("Sonda Espacial: " + sonda.getNome() + ", Velocidade de Transmissão: " + sonda.getVelocidadeTransmissao() 
	        + " Mbps, Autonomia de Voo: " + sonda.getAutonomiaVoo() + " horas");
	        sonda.calcularEficiencia();
	        sonda.transmitirDados();
	        sonda.explorarPlaneta();
	    } 
	}
