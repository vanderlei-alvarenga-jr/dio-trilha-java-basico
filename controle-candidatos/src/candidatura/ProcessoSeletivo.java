package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	private static final String LIGAR_CANDIDATO = "LIGAR PARA O CANDIDATO";
	private static final String LIGAR_CANDIDATO_CONTRA_PROPOSTA = "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
	private static final String AGUARDAR_RESULTADO_DEMAIS_CANDIDATOS = "AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS";
	private static final double salarioBase = 2000.0;
	
	public static void main(String [] args)
	{
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato : candidatos)
		{
			entrarEmContato(candidato);
		}
	}
	
	static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeuContato = false;
		do {
			atendeuContato = atender();
			if(atendeuContato) {
				continuaTentando = false;
				System.out.println("Contato realizado com sucesso.");
			}
			else
				tentativasRealizadas ++;
		}while(continuaTentando && tentativasRealizadas < 3);
		if(atendeuContato)
			System.out.println(String.format("CONSEGUIMOS CONTATO COM O CANDIDATO \"%s\" NA %d tentativa.", candidato, tentativasRealizadas));
		else
			System.out.println(String.format("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO \"%s\".", candidato));
	}
	
	static void imprimirSelecionados()
	{
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o índice: ");
		
		for(int indice = 0; indice < candidatos.length; indice++)
		{
			System.out.println(String.format("O candidato de nº %d é o \"%s\".", indice + 1, candidatos[indice]));
		}
		
		System.out.println("Imprimindo a lista de candidatos de forma abreviada: ");
		for(String candidato : candidatos)
		{
			System.out.println(String.format("O candidato selecionado foi: \"%s\".", candidato	));
		}
	}
	
	static void selecaoCandidatos()
	{
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
		{
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println(String.format("O candidato %s solicitou este valor de salário: %.2f", candidato, salarioPretendido));
			
			if(salarioBase >= salarioPretendido) {
				System.out.println(String.format("O candidato %s foi selecionado para a vaga.", candidato));
				candidatosSelecionados++;
			}
			
			candidatoAtual++;
		}
	}
	
	//Métodos auxiliares
	static boolean atender()
	{
		return new Random().nextInt(3) == 1;
	}
	
	static double valorPretendido()
	{
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double pretensaoSalarial) 
	{
		if(salarioBase > pretensaoSalarial) System.out.println(LIGAR_CANDIDATO);
		else if(salarioBase == pretensaoSalarial) System.out.println(LIGAR_CANDIDATO_CONTRA_PROPOSTA);
		else System.out.println(AGUARDAR_RESULTADO_DEMAIS_CANDIDATOS);
	}
}
