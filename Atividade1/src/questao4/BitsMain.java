package questao4;
import java.util.Scanner;

public class BitsMain {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int tamArray = Integer.parseInt(leitor.nextLine());

			Bit bit = new Bit(tamArray);
			Bit b = new Bit(tamArray);	
			
			try {
				Bit bb = new Bit(tamArray);
				System.out.println("\nOperação AND...");
				for(int k=0; k<=tamArray; k++){
				    System.out.println("Imprimindo..."+bb.opeAND(bit));
				}
			} catch (TamDeBitException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("\nOperação OR...");
			try {
				Bit b2 = b.opeOR(bit); 
				for(int k=0; k<=tamArray; k++){
				    System.out.println("Imprimindo..."+b2);
				}
			} catch (TamDeBitNaoException e) {
				System.out.print(e.getMessage());
				e.printStackTrace();
			}

			System.out.println("\nOperação NOT...");
			try {
				Bit b3 = b.opeNOT(bit);
				for(int k=0; k<=tamArray; k++){
				    System.out.println("Imprimindo..."+b3);
				}
			} catch (TamDeBitSimException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
					
			System.out.println("\nComparando com equals: "+b.equals(bit)+"\n");
			
//			System.out.println("toString: "+b.toString());
		leitor.close();
		}
}
