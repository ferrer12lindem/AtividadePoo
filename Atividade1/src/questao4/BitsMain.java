package questao4;

import java.util.Scanner;

public class BitsMain {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamArray = Integer.parseInt(leitor.nextLine());

			Bit bit = new Bit(43);
			Bit b = new Bit(tamArray);
			System.out.println("toString: "+b.toString());	
			
			try {
				System.out.println(b.opeAND(new Bit(7)));
			} catch (TamDeBitException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("Operação OR...");
			try {
				b.opeOR(bit);
			} catch (TamDeBitException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}

			System.out.println("Operação NOT...");
			try {
				b.opeNOT(bit);
			} catch (TamDeBitException e) {
				e.getMessage();
				e.printStackTrace();
			}
					
			System.out.print("Comparando com equals: "+b.equals(bit));
		leitor.close();
		}
}
