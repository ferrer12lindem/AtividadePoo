package questao3;
import java.util.List;
import java.util.ArrayList;

public class Poligono {
	
	List<Ponto> pontos;
	
	public Poligono(List<Ponto> pontos){
		this.pontos = pontos;
	}
	
	public Poligono(){
		this.pontos = new ArrayList<Ponto>();
	}
	
	public List<Ponto> getPontos(){
		return this.pontos;
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
	
	public int calcPoligono(){
		int[] cordenadasX = new int[pontos.size()];
		int[] cordenadasY = new int[pontos.size()];
		int temp = 0;
		for(Ponto p: pontos){
			cordenadasX[temp] = p.getX();
			cordenadasY[temp] = p.getY();
			temp++;
		}
		int area = 0;
		for(int k = 0; k < pontos.size() -1; k++){
			area+= cordenadasX[k]*cordenadasY[k+1] - cordenadasX[k+1] * cordenadasY[k];
		}
		
		return area/2;
		}
	
	public String toString(){
		String msg = "";
		Ponto o = new Ponto();
		for(Ponto p: pontos){
		    msg ="Vendo comparações: "+p.equals(pontos); // questao3.Poligono@6bc7c054
		}
	return msg;
	}

}
