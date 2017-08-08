package questao9;

public class Retangulo extends Quadrilatero implements FormaGeometrica{
	    
	public Retangulo(int base, int altura) {
		super(base, altura);
	}

	@Override
	public int areaForma() {
		int resp = getBase()*getAltura();
		
		return resp;
	}
	
	public int calcPerimetro(){
		int resp = (2*getBase())+(2*getAltura());
		return resp;
	}

	public String toString(){
		return "Área de Forma: "+areaForma()+"\nPerímetro: "+calcPerimetro();
	}
}
