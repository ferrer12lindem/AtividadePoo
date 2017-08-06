package questao8;

import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas;

	public CadastroPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public CadastroPessoas() {
		this.pessoas = pessoas;
	}

	public void cadastraPessoa(Pessoa pess) {
		pessoas.add(pess);
	}

	public String toString() {
		Pessoa c = new Cliente();
		Pessoa f = new Funcionario();
		Pessoa g = new Gerente();
		return "Cliente: " + c.toString() + "\nFuncionário: " + f.toString() + "Gerente: " + g.toString();
	}

	public void imprimeCadastro() {
		System.out.println("Imprimindo... " + toString());
	}
}
