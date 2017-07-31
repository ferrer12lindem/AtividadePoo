package questao8;
import java.util.Scanner;
public class TestaCadastro {

	public static void main(String[] args) {
	 
	    Scanner leitor = new Scanner(System.in); 	
		
		CadastroPessoas c = new CadastroPessoas();
		System.out.print("Digite o nome do funcionário: ");
		String nome = leitor.nextLine();
		Pessoa pess1 = new Funcionario(nome);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome2 = leitor.nextLine();
		Pessoa pess2 = new Funcionario(nome2);
		System.out.print("Digite o nome do funcionário: ");
		String nome3 = leitor.nextLine();
		Pessoa pess3 = new Funcionario(nome3);
		
		Pessoa pess4 = new Cliente("José", 105);
		Pessoa pess5 = new Cliente("Mauro", 2500);
		Pessoa pess6 = new Cliente("Emanoel", 1996);
		
		Pessoa pess7 = new Gerente("Área de finanças" ,4500, "José");
		Pessoa pess8 = new Gerente("RH", 3800, "Carlos");
		Pessoa pess9 = new Gerente("Setor de serviços", 2900, "João");
		
		c.cadastraPessoa(pess1);
		c.cadastraPessoa(pess2);
		c.cadastraPessoa(pess3);	
		c.cadastraPessoa(pess4);	
		c.cadastraPessoa(pess5);	
		c.cadastraPessoa(pess6);	
		c.cadastraPessoa(pess7);
		c.imprimeCadastro();
				
		leitor.close();
	}
}
