import java.util.InputMismatchException;
import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String agree = "";
		double precio = 0.0; 
		double iva, total = 0.0;
		Scanner sc = new Scanner(System.in);
		Scanner cs = new Scanner(System.in);

		System.out.println("Bienvenido al portal IVA \nPorfavor ingrese un precio");
		try {
			precio = sc.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("Solo se permite el ingreso de numeros \n");
			main(args);
		}
		
		
		System.out.println("Ha ingresado $" + precio + " , ¿Desea continuar? [S/N]");
		agree = cs.nextLine();

		switch (agree.toUpperCase()) {
		case "S":
			iva = precio * 0.19;
			total = precio + iva;
			System.out.println("El precio ingresado tiene un IVA de $" + iva + "\nY un monto total de $" + total
					+ "\n¿Desea pagar? [S/N]");
			String pago = cs.nextLine();
			switch (pago.toUpperCase()) {
			case "S":
				System.out.println("Ha pagado la suma de $" + total + "\n¿Desea ingresar otro precio? [S/N]");
				String exit = cs.nextLine();
				switch (exit.toUpperCase()) {
				case "S":
					main(args);
					break;

				case "N":
					System.out
							.println("Esta saliendo del programa \nGracias por su preferencia \nQue tenga un buen dia");
					System.exit(0);

				default:
					System.out.println("Ha ingresado una opcion no valida \nVolviendo al inicio");
					main(args);
					break;
				}

			case "N":
				System.out.println("Esta saliendo del programa \nGracias por su preferencia \nQue tenga un buen dia");
				System.exit(0);

			default:
				System.out.println("Ha ingresado una opcion no valida \nVolviendo al inicio");
				main(args);
				break;
			}

		case "N":
			System.out.println("¿Desea ingresar otro precio? [S/N]");
			String noPaga = sc.nextLine();
			switch (noPaga.toUpperCase()) {
			case "S":
				main(args);
				break;
			case "N":
				System.out.println("Esta saliendo del programa \nGracias por su preferencia \nQue tenga un buen dia");
				System.exit(0);
			default:
				System.out.println("Ha ingresado una opcion no valida \nVolviendo al inicio");
				main(args);
				break;
			}
		default:
			System.out.println("Ha ingresado una opcion no valida \nVolviendo al inicio");
			main(args);
			break;
		}
		sc.close();
	}

}
