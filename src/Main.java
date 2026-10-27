import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		System.out.printIn("Hola mundo");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe algo: ");
		String texto = sc.nextLine();
		System.out.println("Has escrito: "+ texto);
	}
}	
