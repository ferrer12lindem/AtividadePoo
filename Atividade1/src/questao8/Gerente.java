package questao8;

public class Gerente extends Funcionario {

	private String area;
	private float salario;
	private String nome;
	
	public Gerente(String area, float salario, String nome){
		super(salario, nome);
		this.area = area;
		this.salario = salario;
		this.nome = nome;
	}
	
	public Gerente(){
		
	}

	public float calculaImposto(){
		return (float) 0.5*salario;
	}
	
	public void imprimeDados(){
		System.out.println("Gerente:\n\nSalário: "+this.salario+"\nÁrea: "+this.area+"\nImposto de renda: "+calculaImposto()+"\n");
	}
	
	public String toString(){
		return "Salário: "+this.salario+" Imposto de renda: "+calculaImposto();
	}
}
