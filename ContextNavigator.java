package Patrones.Strategy.ejercicioNavigator;

public class ContextNavigator {
	private Strategy way;
	
	public void setWay(Strategy w) {
		this.way = w;
	}
	
	public void toDo() {
		this.way.creandoRuta();
	}
	
}
