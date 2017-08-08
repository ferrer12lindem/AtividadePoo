package questao9;

public class Quadrado extends Quadrilatero implements FormaGeometrica{
	
	public Quadrado(int altura, int abaixo, int acima){
	super(altura, abaixo, acima, altura);

	}
	
	

	@Override
	public int areaForma() {
		int resp = getAltura() *getAltura();
		return resp;
	}
	
	public int calcPerimetro(){
		int resp = getAltura()+getAltura()+getAcima()+getAbaixo();
		return resp;
	}
	
	public String toString(){
		return "Área de forma: "+areaForma()+"\nPerímetro: "+calcPerimetro();
	}
}