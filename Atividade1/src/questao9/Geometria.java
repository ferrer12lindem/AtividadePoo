package questao9;

import java.util.List;
import java.util.ArrayList;

public class Geometria {

	private Retangulo retangle;
	private Quadrado quadra;
	private Circulo circle;
	private List<Geometria> list;
	
	public Geometria(Retangulo retangle, Quadrado quadra, Circulo circle){
		this.retangle = retangle;
		this.quadra = quadra;
		this.circle = circle;
		this.list = new ArrayList<Geometria>();
	}
	
}
