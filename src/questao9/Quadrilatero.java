package questao9;

public abstract class Quadrilatero implements FormaGeometrica {

	private int acima;
	private int ladoE;
	private int ladoD;
	private int abaixo;
    private int tamLado;
	
	public Quadrilatero(int acima, int ladoE, int ladoD, int abaixo) {
		this.acima = acima;
		this.ladoE = ladoE;
		this.ladoD = ladoD;
		this.abaixo = abaixo;
	}

	public Quadrilatero(int abaixo, int acima){
	    this.abaixo = abaixo;
	    this.acima = acima;
    }
	public Quadrilatero(int tamLado){
		this.tamLado = tamLado;
	}
	
	

	@Override
	public int areaPerimetro() {
		int result = ladoE * 4;
		return result;
	}

	@Override
	public int areaForma() {
		// TODO Auto-generated method stub
		return 0;
	}

}
