package questao3;
import java.util.List;
import java.util.ArrayList;

public class Poligono {
	
	List<Ponto> pontos;
	private int x;
	private int y;
	
	public Poligono(){
		this.pontos = new ArrayList<Ponto>();
	}
	
	public Poligono(List<Ponto> pontos){
		this.pontos = pontos;
	}
	
	public void adicionaPonto(Ponto p){
		pontos.add(p);
	}
	
	public void removePonto(String nome){
		pontos.remove(nome);
	}
	
	public List<Ponto> getPonto(){
		return this.pontos;
	}
	
	public int calcPoligono(int x, int y){
		int area = 0;
		for(int k=0; k<pontos.size(); k++){
//			area += x*y[k+1]-x[k+1]*y;
		}
		area /= 2;
		return area;
	}
	
	public String toString(){
		return "Resultado dos cálculos: "+calcPoligono(x,y);
	}

}
