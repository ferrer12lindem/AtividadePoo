package questao9;

public class Circulo implements FormaGeometrica{

	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	public int areaPerimetro(){
		int resp = 0;
		int area = 0;
		resp = raio/4;
		area += resp;
		return raio;
	}
	
	public int areaForma(){
		return 0;
	}
	
	public String toString(){
		return "";
	}
}
