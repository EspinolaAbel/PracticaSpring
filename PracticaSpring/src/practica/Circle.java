package practica;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Circle {
	
	@Autowired
	@Qualifier("unCalificadorParaMiCentro")
	private Point center;
	@Autowired
	private MessageSource messageSource;

	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	
	
	public void draw() {
		System.out.println(messageSource.getMessage("miCirculo", null, "Default circulo", null));
		System.out.println(messageSource.getMessage("miPunto",
				new Object[] {this.getCenter().getCoordX(),this.getCenter().getCoordY()},
				"Default punto", null));
		System.out.println(messageSource.getMessage("greetings", null, "Default message", null));
	}
	
	
	
	public Point getCenter() {
		return center;
	}

//	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
//	@PostConstruct
//	public void init() {
//		System.out.println("Método de inicio");
//	}
//	
//	@PreDestroy
//	public void finish() {
//		System.out.println("Método de fin");
//	}
}
