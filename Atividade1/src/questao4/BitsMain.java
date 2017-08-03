package questao4;

import java.util.Scanner;

public class BitsMain {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamArray = Integer.parseInt(leitor.nextLine());

		for (int k = 0; k < tamArray; k++) {

			System.out.print("Digite o bit: ");
			boolean bites = leitor.nextLine() != null;
			Bit bit = new Bit(tamArray);
			System.out.println(bit.opeAND(bites));
            
			System.out.print("Digite o bit: ");
			bit.opeOR(bites);
			
			System.out.print("Digite o bit: ");
			bit.opeNOT(bites);

		leitor.close();
		}
	}
}
