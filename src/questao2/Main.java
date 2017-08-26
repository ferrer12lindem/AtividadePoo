package questao2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		int idade = 22;
		System.out.print("Digite a altura: ");
		double altura = Double.parseDouble(leitor.nextLine());
		System.out.print("Digite seu peso: ");
		int peso = Integer.parseInt(leitor.nextLine());
		String sexo = "Masculino";
		Pessoa p = new Pessoa(nome, idade, altura, peso , sexo);
		
		System.out.println("Vendo se tem equidade... "+p.equals(nome));
		System.out.printf("Informações:\n"+p.toString());
		leitor.close();
	}
}
