package questao9;
import java.util.ArrayList;

public class MainTeste {
	
    ArrayList<Quadrilatero> vetor = new ArrayList<Quadrilatero>();
    for(int k: vetor){
	    // Retângulos
	Quadrilatero reta1 = new Retangulo(3, 5);
	Quadrilatero reta2 = new Retangulo(4, 8);
	    // Quadrados
	Quadrilatero quadra1 = new Quadrado(5);
	Quadrilatero quadra2 = new Quadrado(8);
	    // Círculos
	FormaGeometrica circle1 = new Circulo(12);
	FormaGeometrica circle2 = new Circulo(15); 

    }
    vetor.add(reta1);
}