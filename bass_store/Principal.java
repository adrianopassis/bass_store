package bass_store;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo a Loja de Contra Baixo");
		System.out.print("Insira seu limite para compras: ");
		double limitComp = scanner.nextDouble();		
		
		Produto contraBaixo1 = new Produto("Fender Jazz Bass 4C Deluxe edition", 1000);
		Produto contraBaixo2 = new Produto("Music man 4C Stingray", 950);
		Produto contraBaixo3 = new Produto("Warwick German Version Corvett 4C", 1200);
		
		
		ArrayList<Produto> listaDeBaixos = new ArrayList<Produto>();
		listaDeBaixos.add(contraBaixo1);
		listaDeBaixos.add(contraBaixo2);
		listaDeBaixos.add(contraBaixo3);
		
		int resp = 1;
		while(resp != 0) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("**Por favor pressione de 1, 2, 3 para comprar um dos baixos abaixo.**");
			
			System.out.println("Aperte 1 para " + contraBaixo1);
			System.out.println("Aperte 2 para " + contraBaixo2);
			System.out.println("Aperte 3 para " + contraBaixo3);
			
			int valorApertado = scanner.nextInt();
			if (valorApertado == 1) {
				System.out.println("Você escolheu: " + contraBaixo1 +
						"Seu saldo é: " + contraBaixo1.saldo(limitComp, valorApertado) );
				limitComp = contraBaixo1.saldo(limitComp, valorApertado);
			}
			if (valorApertado == 2) {
				System.out.println("Você escolheu: " + contraBaixo2 +
						"Seu saldo é: " + contraBaixo2.saldo(limitComp, valorApertado) );
				limitComp = contraBaixo2.saldo(limitComp, valorApertado);
			}
			if (valorApertado == 3) {
				System.out.println("Você escolheu: " + contraBaixo3 +
						"Seu saldo é: " + contraBaixo3.saldo(limitComp, valorApertado) );
				limitComp = contraBaixo3.saldo(limitComp, valorApertado);
			}
			
			System.out.print("Se você quiser continuar comprando aperte 1 ou aperte 0 para sair");
			int repostaBotao = scanner.nextInt();
			resp = repostaBotao;
			
		}
		
		System.out.println("**Muito obrigado por comprar com a gente**");
		
		
		
		
		
	}
	
}
