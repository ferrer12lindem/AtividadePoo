package questao8;

public class Gerente extends Funcionario {

	private String area;
	private float salario;
	
	public Gerente(String area, float salario, String nome){
		super(salario, nome);
	}

	public float calculaImposto(){
		return (float) 0.5*salario;
	}
	
	public void imprimeDados(){
		System.out.println("Área: "+this.area);
	}
}
