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
	  	
	  	Triangle triangulo = (Triangle) context.getBean("triangle");
  
	  	for(Point unPunto: triangulo.getListOfPoints()) {
	  		System.out.println("Punto A del triangulo: "+unPunto);
	  	}
  }
}