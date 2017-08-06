package questao8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCadastro {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		List<CadastroPessoas> list = new ArrayList<CadastroPessoas>();

		// Cliente
		System.out.print("Digite o nome do cliente 1: ");
		String cli1 = leitor.nextLine();
		Pessoa cliente1 = new Cliente(cli1, 105);
		System.out.print("Digite o nome do cliente 2: ");
		String cli2 = leitor.nextLine();
		Pessoa cliente2 = new Cliente(cli2, 2500);
		System.out.print("Digite o nome do cliente 3: ");
		String cli3 = leitor.nextLine();
		Pessoa cliente3 = new Cliente(cli3, 1996);

		// Funcionário
		System.out.print("Digite o nome do funcionário 1: ");
		String nome1 = leitor.nextLine();
		Pessoa funcionario1 = new Funcionario((float) 12.000, nome1);
		System.out.print("Digite o nome do funcionário 2: ");
		String nome2 = leitor.nextLine();
		Pessoa funcionario2 = new Funcionario((float) 34.000, nome2);
		System.out.print("Digite o nome do funcionário 3: ");
		String nome3 = leitor.nextLine();
		Pessoa funcionario3 = new Funcionario((float) 25.000, nome3);

		// Gerente
		System.out.print("Digite o nome do gerente 1: ");
		String ger1 = leitor.nextLine();
		Funcionario gerente1 = new Gerente("Área de finanças", 4500, ger1);
		System.out.print("Digite o nome do gerente 2: ");
		String ger2 = leitor.nextLine();
		Funcionario gerente2 = new Gerente("RH", 3800, ger2);
		System.out.print("Digite o nome do gerente 3: ");
		String ger3 = leitor.nextLine();
		Funcionario gerente3 = new Gerente("Setor de serviços", 2900, ger3);
		for(CadastroPessoas c : list){

			c.cadastraPessoa(cliente1);
			c.cadastraPessoa(cliente2);
			c.cadastraPessoa(cliente3);
			c.cadastraPessoa(funcionario1);
			c.cadastraPessoa(funcionario2);
			c.cadastraPessoa(funcionario3);
			c.cadastraPessoa(gerente1);
			c.cadastraPessoa(gerente2);
			c.cadastraPessoa(gerente3);

		list.add(c);
		}
		
		cliente1.imprimeDados();
		cliente2.imprimeDados();
		cliente3.imprimeDados();
		funcionario1.imprimeDados();
		funcionario2.imprimeDados();
		funcionario3.imprimeDados();
		gerente1.imprimeDados();
		gerente2.imprimeDados();
		gerente3.imprimeDados();

		
	leitor.close();
	}
}
