package questao9;
import java.math.*;

public class Quadrado extends Quadrilatero{
 
	private int lado;
	
	public Quadrado(int altura){
	super(altura);
	
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
	
	public String toString(){
		return "Área de forma: "+areaForma();
	}
}