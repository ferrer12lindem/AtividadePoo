package questao8;

public class Funcionario extends Pessoa{
	
	float salario;
	private String nome;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public float calculaImposto(){
		return 0;
	}
	
	public void imprimeDados(){
		System.out.println("");
	}
	

}
