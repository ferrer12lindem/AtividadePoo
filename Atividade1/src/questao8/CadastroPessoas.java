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
	
	public List<Pessoa> cadastraPessoa(Pessoa pess){
		pessoas.add(pess);
		return this.pessoas;
	}
	
	public void imprimeCadastro(List<CadastroPessoas> list){
		for(Pessoa p: this.pessoas){
		    System.out.println("Imprimindo... "+p);
		}
	}
}
