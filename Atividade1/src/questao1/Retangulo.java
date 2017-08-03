package questao1;

public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(){
		this.altura = 0.0;
		this.largura = 0.0;
	}
	
	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double getLargura(){
		return this.largura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	
	
	
	public double periRetangle(double altura, double largura){
		double res = 0.0;
		return res = (altura+largura)*2;
	}
	
	public double areaRetangle(double altura, double largura){
		double res = 0.0;
		return res = altura*largura;
	}
	
	public boolean equals(double alt){
		if(alt == this.getAltura()){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "\nAltura: "+this.altura+"\nLargura: "+this.largura;
	}
	
}

