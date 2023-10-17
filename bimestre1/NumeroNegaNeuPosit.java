import java.util.Scanner;
public class NumeroNegaNeuPosit {
	public static void main (String[]args ) {
		Scanner in = new Scanner (System.in);
		double n;
		System.out.println("informe um número aleatório");
		n = in.nextDouble();
		if ( n > 0) {
			System.out.println("Este número é positivo");
		}
		else if (n==0) {
			System.out.println("Este número é neutro");
		}
		else {
			System.out.println(" Este número é negativo");
		}
		
	}

}
