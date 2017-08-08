package questao9;

public abstract class Quadrilatero implements FormaGeometrica {

	protected int acima;
	protected int ladoE;
	protected int ladoD;
	protected int abaixo;
	protected int altura;
	protected int base;
    
	public Quadrilatero(int acima, int ladoE, int ladoD, int abaixo) {
		this.setAcima(acima);
		this.ladoE = ladoE;
		this.ladoD = ladoD;
		this.acima = acima;
		this.abaixo = abaixo;

	}
	
	public Quadrilatero(){
		
	}

	public Quadrilatero(int altura2) {
		this.altura = altura2;
	}

	public Quadrilatero(int base2, int altura2) {
		this.base = base2;
		this.altura = altura2;
	}

	@Override
	public int areaPerimetro() {
		int result = this.ladoE+this.acima+this.ladoD+this.abaixo;
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
