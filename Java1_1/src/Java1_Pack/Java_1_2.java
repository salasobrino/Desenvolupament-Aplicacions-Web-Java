package Java1_Pack;

import java.util.*;

public class Java_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean terminar=false;
		boolean quite=false;
		
		//prueba calculadora
		Scanner sc = new Scanner(System.in);
		
		while(terminar == false) {
			
		System.out.println("Tecleja dos números pel teclat: \n");
					
		int x= sc.nextInt();
		int y = sc.nextInt();
		
					
		System.out.println("Quina operació preferèixes (tecleja la inicial): suma (s), resta (r), divisió (d) o multiplicació (m), totes (t) o surt(quite)? \n");
		char select = sc.next().charAt(0);
		String sortir = sc.nextLine();
		
		if(select == 's') {
			sum(x,y);
			terminar = true;
			
		} else if (select == 'r'){
			rest(x,y);
			terminar = true;
			
		} else if (select == 'd'){
			div(x,y);
			terminar = true;
			
		} else if (select == 'm'){
			mult(x,y);
			terminar = true;
			
		} else if (select == 't'){
			sum(x,y);	
			rest(x,y);
			div(x,y);
			mult(x,y);
			terminar = true;
			
		} else if (sortir.equals(quite)) {
			
			goOut(quite);
			terminar = true;
		}
		
		if(select!='s' && select!='r' && select!='d' & select!='m' && select!='t' && sortir!="quite") {
		
			System.out.println("Error en la selecció de la inical. Torna a repertir-ho. \n");
			
		}
		
		System.out.println("Operació finalitzada. \n");
		
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
		
		public static void goOut(boolean quite) {
			
			quite = true;
			System.out.println("Usuari decideix sortir. \n");
		}
	
	}


	


