package questao9;

public class Retangulo extends Quadrilatero implements FormaGeometrica{
	    
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		super(base, altura);
        this.base = base;
        this.altura = altura;
	}

	@Override
	public int areaForma() {
		int resp = this.base*this.altura;		
		return resp;
	}
	
	public int calcPerimetro(){
		Quadrilatero q = new Quadrado();
		
		
		int resp = (2*base)+(2*altura);
		return resp;
	}

	public String toString(){
		return "Área de Forma: "+areaForma()+"\nPerímetro: "+calcPerimetro();
	}
}
