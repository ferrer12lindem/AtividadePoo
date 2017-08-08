package questao9;
import java.util.ArrayList;

public class MainTeste {
	
    public static void main(String[]args ){
	
	ArrayList<FormaGeometrica> vetor = new ArrayList<FormaGeometrica>();
	    // Retângulos
	FormaGeometrica reta1 = new Retangulo(3, 5);
	FormaGeometrica reta2 = new Retangulo(4, 8);
	    
	    // Quadrados
	FormaGeometrica quadra1 = new Quadrado(5, 34, 7, 9);
	FormaGeometrica quadra2 = new Quadrado(8, 10, 9, 8);
	
	    // Círculos
	FormaGeometrica circle1 = new Circulo(12);
	FormaGeometrica circle2 = new Circulo(15); 

    vetor.add(reta1);
    vetor.add(reta2);
    vetor.add(quadra1);
    vetor.add(quadra2);
    vetor.add(circle1);
    vetor.add(circle2);
    
 
    	System.out.println("Infomrações de Retângulo:\nRetângulo 1:\nÁrea de Forma: "+reta1.areaForma()+"\nPerímetro: "+reta1.areaPerimetro()+"\nRetângulo 2:\nÁrea de Forma: "+reta2.areaForma()+"\nPerímetro: "+reta2.areaPerimetro());
    	System.out.println("\nInformações de Quadrado:\nQuadrado 1:\nÁrea de Forma: "+quadra1.areaForma()+"\nPerímetro: "+reta1.areaPerimetro()+"\nQuadrado 2:\nÁrea de Forma: "+quadra2.areaForma()+"\nPerímetro: "+reta2.areaPerimetro());
    	System.out.println("\nInformações de círculo:\nCírculo 1:\nÁrea de Forma: "+circle1.areaForma()+"\nPerímetro: "+circle1.areaPerimetro()+"\nCírculo 2:\nÁrea Forma: "+circle2.areaForma()+"\nPerímetro: "+circle2.areaPerimetro());
    }
}

