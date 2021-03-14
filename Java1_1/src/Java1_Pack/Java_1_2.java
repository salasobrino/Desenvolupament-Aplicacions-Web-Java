package Java1_Pack;

import java.util.Scanner;

public class Java_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean terminar=false;
		
		//prueba calculadora
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tecleja dos números: \n");
		
		while(terminar == false) {
			
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sum(x,y);	
		rest(x,y);
		div(x,y);
		mult(x,y);
		
		terminar = true;
		sc.close();
		}
		
		
		
	}
			
			
		public static void sum (int x, int y) {
			
			int suma = x+y;
			
			System.out.println("El resultat de la suma és: " + suma);
			
			
		}
		
		public static void rest (double x, double y) {
			
			double resta = x-y;
			
			System.out.println("El resultat de la resta és: " + resta);
			
			
		}
		
		public static void div (double x, double y) {
			
			double division = x/y;
			
			System.out.println("El resultat de la divisió és: " + division);
		}
		
		public static void mult (int x, int y) {
			
			int multi = x*y;
			
			System.out.println("El resultat de la divisió és: " + multi);
			
		}
	
	}


	


