package questao4;

import java.util.Scanner;

public class BitsMain {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamArray = Integer.parseInt(leitor.nextLine());

			Bit bit = new Bit(43);
			Bit b = new Bit(tamArray);	
			
			try {
				System.out.println("Operação AND...");
				System.out.println(b.opeAND(bit));
			} catch (TamDeBitException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("Operação OR...");
			try {
				Bit b2 = new Bit(tamArray); 
				System.out.println(b2.opeOR(bit));
			} catch (TamDeBitException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}

			System.out.println("Operação NOT...");
			Bit b3 = new Bit(tamArray) ;
			try {
				System.out.println(b3.opeNOT(bit));
			} catch (TamDeBitException e) {
				e.getMessage();
				e.printStackTrace();
			}
					
			System.out.println("Comparando com equals: "+b.equals(bit)+"\n");
			
			System.out.println("toString: "+b.toString());
		leitor.close();
		}
}
