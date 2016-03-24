package practica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String args[]) {

//	  	AbstractApplicationContext me permite destruir los beans creados con el m�todo
//	  	registerShutdownHook()
	  	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	  	
	  	context.registerShutdownHook();
//	  	Con registerShutdownHook puedo llamar a todos los métodos de terminación.
	  	
	  	Triangle triangulo = (Triangle) context.getBean("triangle");
	  	Circle circulo = (Circle) context.getBean(Circle.class);
	  	
	  	for(Point unPunto: triangulo.getListOfPoints()) {
	  		System.out.println("Punto A del triangulo: "+unPunto);
	  	}
	  	
	  	circulo.draw();
	  	

	  	
  }
}
