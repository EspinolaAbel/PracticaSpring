package practica;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
	private List<Point> listOfPoints;

	public List<Point> getListOfPoints() {
		return listOfPoints;
	}

	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}

	@Override
	/**Método que se ejecuta automaticamente en el momento en que el contenedor de Spring destruye el bean Triangle.
	 * */
	public void destroy() throws Exception {
		System.out.println("Este mensaje se imprime justo antes de destruir el bean de Triangle");
		
	}

	@Override
	/**Método que se ejecuta automaticamente en el momento en que el contenedor de Spring termina de crear el bean Triangle.*/
	public void afterPropertiesSet() throws Exception {
		System.out.println("Este mensaje se imprime justo al terminar de crear el bean Triangle");
	}

	/**Al igual que afterPropertiesSet, este método se ejecuta al momento de crearse el bean. Para que se ejecute necesito
	 * configurar el bean triangle en mi archivo de configuración para que este método se ejecute al crearse el bean con
	 * init-method en la definición del bean.
	*/
	public void miMetodoDeInicio() {
		System.out.println("Este mensaje fue imprimido automaticamente por mí método de inicio.");
		System.out.println("Este método fué configurado en el archivo Spring.xml.");
	}

	public void miMetodoDeDestruccion() {
		System.out.println("Este mensaje fue imprimido automaticamente por mí método de destrucción.");
		System.out.println("Este método fué configurado en el archivo Spring.xml.");
	}
}

