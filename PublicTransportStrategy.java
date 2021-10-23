package Patrones.Strategy.ejercicioNavigator;

public class PublicTransportStrategy  implements Strategy {

	@Override
	public void creandoRuta() {
		elegirtransporte();
	}
	
	public void elegirtransporte() {
		System.out.println("Desea viajar en: 1- Colectivo 2- Subte");
		int rta = App.entradaUsuario();
		if(rta == 1) viajandoColectivo();
		else if(rta == 2) viajandoSubte();
		else System.out.println("Opción incorrecta");
	}
	
	public void viajandoColectivo() {
		System.out.println("Viajando en colectivo...");
	}
	
	public void viajandoSubte() {
		System.out.println("Viajando en subte...");
	}
	

}
