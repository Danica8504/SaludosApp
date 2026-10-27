import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		System.out.printIn("Hola mundo");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cómo te llamas? ");
		String nombre = sc.nextLine();
		System.out.println("Buenos días, "+ nombre + "!");
		System.out.println("¡Hasta luego!");
	}
}	
