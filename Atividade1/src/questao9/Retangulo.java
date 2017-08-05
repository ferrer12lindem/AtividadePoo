package questao9;

public class Retangulo extends Quadrilatero {

	private int lado;
	
	public Retangulo(int base, int altura) {
		super(base, altura);
	}

	@Override
	public int areaForma() {
		int resp = 0;
		int perimetro = 0;
		perimetro = (lado*4);
		resp = perimetro /4;
		resp = (int) Math.pow((perimetro/4), (perimetro/4));
		
		return resp;
	}

}
