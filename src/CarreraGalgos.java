import java.util.Scanner;

public class CarreraGalgos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tiempo de carrera en milisegundos: ");
		long tiempo = sc.nextLong();

		Galgo g1 = new Galgo("Niki", tiempo);
		Galgo g2 = new Galgo("Mika", tiempo);
		Galgo g3 = new Galgo("Tina", tiempo);
		
		g1.start();
		g2.start();
		g3.start();
		
		try {
			g1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			g2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			g3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Clasificación final: ");
		for (String nombre : Galgo.getClasificacion()) {
			System.out.println(nombre);
		}
		
		sc.close();
	}

}
