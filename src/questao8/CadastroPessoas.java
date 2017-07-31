package questao8;
import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas;
	
	public CadastroPessoas(List<Pessoa> pessoas){
		this.pessoas = pessoas;
	}
	
	public CadastroPessoas(){
		this.pessoas = pessoas;
	}
	
	public void cadastraPessoa(Pessoa pess){
		pessoas.add(pess);
	}
	
	public void imprimeCadastro(){
		for(Pessoa p: this.pessoas){
		    System.out.println("Imprimindo... "+p);
		}
	}
}
