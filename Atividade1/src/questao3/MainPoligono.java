package questao3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class MainPoligono {

	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de lados: ");
		int n = Integer.parseInt(leitor.nextLine());
		List<Ponto> pontos = new ArrayList<Ponto>(n);
		Poligono poligono = new Poligono(pontos);
		int poli = 0;
		for(int k=0; k<n; k++){
			System.out.print("Digite o tamanho: " );
	        poli = Integer.parseInt(leitor.nextLine());
		}
		System.out.println(poligono.toString(poli));
	leitor.close();
	}
}
