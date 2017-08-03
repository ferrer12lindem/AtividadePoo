package questao8;

public class Funcionario extends Pessoa{
	
	float salario;
	private String nome;
	
	public Funcionario(float salario, String nome){
		this.nome = nome;
		this.salario = salario;
	}
	
	public float calculaImposto(){
		return (float) (0.3*salario);
	}
	
	public void imprimeDados(){
		System.out.println("");
	}
}
