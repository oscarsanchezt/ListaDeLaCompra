import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();

		System.out.println("Hola Juan, introduce tu lista de la compra: ");

		while (true) {
			String nombre = sc.next();
			lista.add(nombre);
			if (nombre.equals("fin")) {
				break;
			}
		}

		lista.remove("fin");
		ArrayList<String> listaMinusculas = new ArrayList<>();
		for (String palabra : lista) {
			listaMinusculas.add(palabra.toLowerCase());
		}

		ArrayList<String> listaJuan = new ArrayList<>();
		for (String string : listaMinusculas) {
			String mayus = Character.toUpperCase(string.charAt(0)) + string.substring(1);
			listaJuan.add(mayus);
		}

		System.out.println();
		String sinLlaves = String.join(", ", listaJuan);
		System.out.println("Listado Juan: ");
		System.out.println(sinLlaves);
		System.out.println();

		TreeSet<String> mayusOrden = new TreeSet<>();
		for (String string : listaMinusculas) {
			String mayus = Character.toUpperCase(string.charAt(0)) + string.substring(1);
			mayusOrden.add(mayus);
		}

		String sinComas = String.join(", ", mayusOrden);
		System.out.println("Listado Marta: ");
		System.out.println(sinComas);

		System.out.println();
		HashMap<String, Integer> tiketRosa = new HashMap<>();
		System.out.println("Rosa pasa los artículos por su caja: ");

		for (String string : mayusOrden) {
			System.out.print(string + ": ");
			int precio = sc.nextInt();
			tiketRosa.put(string, precio);
		}
		System.out.println();
		System.out.println("TIKET TOTAL");
		int total=0;
		for (Entry<String, Integer> entry : tiketRosa.entrySet()) {
			String string = entry.getKey();
			Integer precio = entry.getValue();
			total+=precio;
			System.out.println(string+" "+precio+"€");
		}
		
		System.out.println("Total: "+total+"€");
	}
}
