package questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitsMain {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamArray = Integer.parseInt(leitor.nextLine());

		List<Bit> bit = new ArrayList<Bit>();
		Bit b = new Bit(tamArray);

		try {
			Bit bb = new Bit(tamArray);
			System.out.println("\nOperação AND...\n");
			for (int k = 0; k < tamArray; k++) {
				System.out.println("Digite o primeiro bit: ");
				b.setBits1(leitor.nextBoolean());
				
				System.out.println("Digite o segundo bit: ");
				b.setBits2(leitor.nextBoolean());
				bit.add(b);
			System.out.println(bb.opeAND(b));
			}
			

		} catch (TamDeBitException e) {
			System.out.print(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("\nOperação OR...\n");
		
		try {
			Bit b2 = b.opeOR(b);
			for (int k = 0; k < tamArray; k++) {
				System.out.println("Digite o primeiro bit: ");
				b.setBits1(leitor.nextBoolean());
				
				System.out.println("Digite o segundo bit: ");
				b.setBits2(leitor.nextBoolean());
			System.out.println(b2);	
			}
			
		} catch (TamDeBitNaoException e) {
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
		

		System.out.println("\nOperação NOT...");
		try {
			Bit b3 = b.opeNOT(b);
			for (int k = 0; k < tamArray; k++) {
				System.out.println("Digite o bit: ");
				b.setBits1(leitor.nextBoolean());
				bit.add(b);
			System.out.println(b3);
			}
			
		} catch (TamDeBitSimException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("\n\nComparando do equals: " + b.equals(bit) + "\n");

		leitor.close();
	}
}
