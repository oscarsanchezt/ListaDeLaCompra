import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();

		System.out.println("Lista: ");

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
		
		TreeSet<String> mayusOrden = new TreeSet<>();
		for (String string : listaMinusculas) {
			String mayus = Character.toUpperCase(string.charAt(0)) + string.substring(1);
			mayusOrden.add(mayus);
		}
		
		String sinComas = String.join(", ", mayusOrden);
		System.out.println(sinComas);
	}
}