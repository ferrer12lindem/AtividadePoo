package questao9;

public abstract class Quadrilatero implements FormaGeometrica {

	private int acima;
	private int ladoE;
	private int ladoD;
	private int abaixo;
	private int altura;
	private int base;
    
	public Quadrilatero(int acima, int ladoE, int ladoD, int abaixo) {
		this.acima = acima;
		this.ladoE = ladoE;
		this.ladoD = ladoD;
		this.abaixo = abaixo;

	}

	public Quadrilatero(int base, int altura){
	    this.base = base;
	    this.altura = altura;
    }
	
	public Quadrilatero(int altura){
		this.altura = altura;
	}
	
	

	@Override
	public int areaPerimetro() {
		int result = this.ladoE+this.acima+this.ladoD+this.abaixo;
		return result;
	}

	@Override
	public int areaForma() {
		// TODO Auto-generated method stub
		return 0;
	}

}
