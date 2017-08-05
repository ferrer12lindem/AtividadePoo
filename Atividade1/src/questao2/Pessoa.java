package questao2;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private int peso;
	private String sexo;

	public Pessoa() {
		this.nome = new String();
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0;
		this.sexo = new String();
	}

	public Pessoa(String nome, int idade, double altura, int peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double calcIMC() {
		double resp = peso / (altura * altura);
		return resp;
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} 
		if(o instanceof Pessoa){
			Pessoa p = (Pessoa) o;
			if(this.altura == p.getAltura() && this.idade == p.getIdade() && this.nome == p.getNome() && this.peso == p.getPeso() && this.sexo == p.getSexo()){
				return true;
			}
			return false;
		}
		return false;
	}

	public String toString() {
		double IMC = calcIMC();

		if (IMC > 30) {
			return "Nome: " + this.nome + "\n" + "IMC: " + (calcIMC() + "\nObesidade");

		} else if (30 >= IMC & IMC > 25) {
			return "Nome: " + this.nome + "\n" + "IMC: " + (calcIMC() + "\nPeso acima do normal");

		} else if (25 >= IMC & IMC > 18.5) {
			return "Nome: " + this.nome + "\n" + "IMC: " + (calcIMC() + "\nPeso normal");

		} else {
			return "Nome: " + this.nome + "\n" + "IMC: " + (calcIMC() + "\nPeso abaixo do normal");
		}
	}
}
