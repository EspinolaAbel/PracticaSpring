package practica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle {
	
	@Autowired
	@Qualifier("unCalificadorParaMiCentro")
	private Point center;

	public void draw() {
		System.out.println("Este es mí circulo:");
		System.out.println("El centro de mi circulo es: ("+ center.getCoordX() +", "+ center.getCoordY() +")");
	}
	
	public Point getCenter() {
		return center;
	}

//	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
