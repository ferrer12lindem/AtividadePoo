package questao9;

public abstract class Quadrilatero implements FormaGeometrica {

	private int acima;
	private int ladoE;
	private int ladoD;
	private  int abaixo;
	private int altura;
	private int base;
    
	public Quadrilatero(int acima, int ladoE, int ladoD, int abaixo) {
		this.setAcima(acima);
		this.ladoE = ladoE;
		this.ladoD = ladoD;
		this.setAbaixo(abaixo);

	}

	public Quadrilatero(int altura2) {
		this.setAltura(altura2);
	}

	public Quadrilatero(int base2, int altura2) {
		this.setBase(base2);
		this.setAltura(altura2);
	}

	@Override
	public int areaPerimetro() {
		int result = this.ladoE+this.getAcima()+this.ladoD+this.getAbaixo();
		return result;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAbaixo() {
		return abaixo;
	}

	public void setAbaixo(int abaixo) {
		this.abaixo = abaixo;
	}

	public int getAcima() {
		return acima;
	}

	public void setAcima(int acima) {
		this.acima = acima;
	}

}
