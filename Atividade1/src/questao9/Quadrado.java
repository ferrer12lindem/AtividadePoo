package questao9;

public class Quadrado extends Quadrilatero implements FormaGeometrica{
	
	private int altura;
	private int abaixo;
	private int acima;
	private int ladoD;
	
	public Quadrado(int altura, int abaixo, int acima, int ladoD){
	super(altura, abaixo, acima, ladoD);
        this.altura = altura;
        this.abaixo = abaixo;
        this.acima = acima;
        this.ladoD = ladoD;
	}
	
	

	public Quadrado() {
	}



	@Override
	public int areaForma() {
		int resp = altura *altura;
		return resp;
	}
	
	public int calcPerimetro(){
		Quadrilatero q = new Quadrado(altura, abaixo, acima, ladoD);
		int resp = q.areaPerimetro();
		return resp;
	}
	
	public String toString(){
		return "Área de forma: "+areaForma()+"\nPerímetro: "+calcPerimetro();
	}
}