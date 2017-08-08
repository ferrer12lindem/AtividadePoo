package questao9;

public class Circulo implements FormaGeometrica{

	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	public int areaPerimetro(){
		int resp = (int) ((2*3.1415926)*raio);
		return resp;
	}
	
	public int areaForma(){
		return (int) (3.14*(raio*raio));
	}
	
	public String toString(){
		return "Perímetro: "+areaPerimetro()+"\nÁrea de Forma: "+areaForma();
	}
}
