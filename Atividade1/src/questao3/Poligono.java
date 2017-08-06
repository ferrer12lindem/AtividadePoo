package questao3;
import java.util.List;
import java.util.ArrayList;

public class Poligono {
	
	List<Ponto> pontos;
	private int x;
	private int y;
	private int poli ;
	
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
	
	public int calcPoligono(List<Ponto> pontos){
		int area = 1;
		for(int k=0; k<pontos.size(); k++){
			area += k;
		}
	return area;
	}
	
	public String toString(int poli){
		String msg = null;
		for(Ponto p: pontos){
		    msg ="Resultado dos cálculos: "+p.toString(); // questao3.Poligono@6bc7c054
		}
	return msg;
	}

}
