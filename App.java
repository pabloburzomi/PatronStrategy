package Patrones.Strategy.ejercicioNavigator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static int comoViajo() {
		System.out.println("Como desea viajar?\n1-Caminando\n2-Transporte publico\n3-En auto");
		return entradaUsuario();
	}

	public static int entradaUsuario() {
		BufferedReader that = new BufferedReader(new InputStreamReader(System.in));
		String texttoInt = "";
		int toInt = 0;
		try {
			texttoInt = that.readLine();
			toInt = Integer.parseInt(texttoInt.trim());
		} catch (IOException e) {
			System.err.print("ERROR");
		} catch (NumberFormatException ex) {
			System.err.println("No es un numero!\nPor favor ingrese un numero: ");
		}
		return toInt;
	}

	public static void main(String[] args) {

		ContextNavigator gps = new ContextNavigator();

		Strategy swR = new RoadStrategy();
		Strategy swP = new PublicTransportStrategy();
		Strategy swW = new WalkingStrategy();
		int bandera = 0;
		while (bandera != 1) {

			switch (comoViajo()) {
			case 1:
				gps.setWay(swW);
				gps.toDo();
				break;
			case 2:
				gps.setWay(swP);
				gps.toDo();
				break;
			case 3:
				gps.setWay(swR);
				gps.toDo();
				break;
			default:
				System.out.println("Opción incorrecta");
			}

			System.out.println("Ingrese 1 si desea cambiar el modo de viaje, o ingrese 2 para terminar");
			if (entradaUsuario() == 2) bandera = 1;
		}
		
		System.out.println("Gracias por viajar con nosotros!");
	}

}
