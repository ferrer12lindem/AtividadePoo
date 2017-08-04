package questao3;
import java.util.List;
import java.util.ArrayList;

public class MainPoligono {

	public static void main(String[] args){
		
		List<Ponto> pontos = new ArrayList<Ponto>();
		Poligono poligono = new Poligono(pontos);
		Ponto ponto = new Ponto(3, 6);
		Ponto ponto1 = new Ponto(2, 8);
		Ponto ponto2 = new Ponto(12, 67);
		
		pontos.add(ponto);
		pontos.add(ponto1);
		pontos.add(ponto2);
		System.out.println(poligono.toString());
	}
}
