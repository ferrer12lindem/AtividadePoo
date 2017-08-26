package questao1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a altura: ");
		double altura = Double.parseDouble(leitor.nextLine());
		System.out.print("Digite a largura: ");
		double largura = Double.parseDouble(leitor.nextLine());
		Retangulo reta = new Retangulo(altura, largura);
		double periReta = reta.periRetangle(altura, largura);
		double areaReta = reta.areaRetangle(altura, largura);
		System.out.printf("Perímetro de retangle: %.2f\n" ,periReta);
		System.out.printf("Área de retangle: %.2f\n",areaReta);
		
		boolean var = reta.equals(altura);
		System.out.println("Vendo se é igual... "+var);
		
		System.out.println("Informações: "+reta.toString());
		leitor.close();
	}
}
