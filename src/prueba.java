import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Validar numero
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese algo");
		String input = sc.nextLine();
		for(int i = 0; i<input.length(); i++) {
			char letra = input.charAt(i);
			int ascii = (int)letra;
			if(ascii >= 48 || ascii >= 57 ) {
				System.out.println("Ha ingresado un numero");
				break;
			}else {
				System.out.println("letrita");
			}
		}
	}

}
