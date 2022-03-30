package aplicação;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] Args) {
		System.out.println("Digite 3 numeros para mostrarmos o maior: ");
		
		Scanner num = new Scanner(System.in);
		int n1 = num.nextInt();
		int n2 = num.nextInt();
		int n3 = num.nextInt();
		
		int maior = max(n1,n2,n3);
		mostreResultado(maior);
		
		num.close();
	}
	
	public static int max(int x, int y, int z){
		int aux;
		if(x>y && x>z) {
			aux = x;
		}
		else if(y>z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void mostreResultado(int valor) {
		System.out.println("Maior: " + valor);
	}
}
