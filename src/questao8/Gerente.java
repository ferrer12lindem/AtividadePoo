package questao8;

public class Gerente extends Funcionario {

	private String area;
	private float salario;
	
	public Gerente(String area, float salario, String nome){
		super(nome);
	}
	
	public float calculaImposto(){
		return salario;
	}
	
	public void imprimeDados(){
		System.out.println("");
	}
}
