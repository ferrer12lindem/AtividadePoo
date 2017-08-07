package questao3;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainPoligono {

	public static void main(String[] args){
		
		
	    Scanner leitor = new Scanner(System.in);
		int quantPontos = Integer.parseInt(JOptionPane.showInputDialog("Quantos pontos: "));
        
		Poligono poligono = new Poligono();
        
		for(int k=0; k<quantPontos; k++){
			Ponto p = new Ponto();
		    System.out.println("Digite o ponto X: ");
		    p.setX(Integer.parseInt(leitor.nextLine()));
		    
		    System.out.println("Digite o ponto y: ");
		    p.setY(Integer.parseInt(leitor.nextLine()));
		 
		    poligono.adicionaPonto(p);
		}
		System.out.println("Cálculo do polígono: "+poligono.calcPoligono());
		System.out.println("Imprimindo..."+poligono.toString());
		
	}
}

