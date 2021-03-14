package Java1_Pack;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1_2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		boolean terminar=false;
				
		//prueba calculadora
		//Scanner sc = new Scanner(System.in);
		
		//Ingrese datos usando BufferReader
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
		
		while(terminar==false) {
			
		System.out.println("Tecleja dos números pel teclat: \n");
					
		//int x= sc.nextInt();
		//int y = sc.nextInt();
		int x = Integer.parseInt(reader.readLine());
		int y = Integer.parseInt(reader.readLine());
					
		System.out.println("Quina operació preferèixes (tecleja la inicial): suma (s), resta (r), divisió (d) o multiplicació (m), totes (t) o surt(q)? \n");
		String select = reader.readLine();
		int numChar = select.length();	
		
		if (numChar>1) {
			countChar(select);
			terminar=true;
			
		}
					
		if(select == "s") {
			sum(x,y);
			terminar= true;
			
		} else if (select == "r"){
			rest(x,y);
			terminar = true;
			
		} else if (select == "d"){
			div(x,y);
			terminar = true;
			
		} else if (select == "m"){
			mult(x,y);
			terminar = true;
			
		} else if (select == "t"){
			sum(x,y);	
			rest(x,y);
			div(x,y);
			mult(x,y);
			terminar = true;
			
		} else if (select == "q") {
			
			goOut();		
			terminar = true;
		}
		
		if(select!="s" && select!="r" && select!="d" & select!="m" && select!="t" && select!="q") {
		
			System.out.println("Error en la selecció de la inical. Torna a repertir-ho. \n");
			
		}
		
		System.out.println("Operació finalitzada. \n");
		
		//sc.close();
		//reader.close();
		}
		}
			
	
		public static boolean countChar(String numChar) {
			
				int numC = numChar.length();
				System.out.println("Error. Torna a teclejar una sola lletra"+ numC);
				return true;
				
			}
			
		public static boolean sum (int x, int y) {
			
			int suma = x+y;
			
			System.out.println("El resultat de la suma és: " + suma);
			
			return true;
			
		}
		
		public static boolean rest (double x, double y) {
			
			double resta = x-y;
			
			System.out.println("El resultat de la resta és: " + resta);
			return true;
			
		}
		
		public static boolean div (double x, double y) {
			
			double division = x/y;
			
			System.out.println("El resultat de la divisió és: " + division);
			return true;
		}
		
		public static boolean mult (int x, int y) {
			
			int multi = x*y;
			
			System.out.println("El resultat de la divisió és: " + multi);
			return true;
			
		}
		
		public static boolean goOut() {
			
			
			System.out.println("Usuari decideix sortir. \n");
			return true;
		}
	
	}


	


