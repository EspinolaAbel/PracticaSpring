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
	/**M�todo que se ejecuta automaticamente en el momento en que el contenedor de Spring destruye el bean Triangle.
	 * */
	public void destroy() throws Exception {
		System.out.println("Este mensaje se imprime justo antes de destruir el bean de Triangle");
		
	}

	@Override
	/**M�todo que se ejecuta automaticamente en el momento en que el contenedor de Spring termina de crear el bean Triangle.*/
	public void afterPropertiesSet() throws Exception {
		System.out.println("Este mensaje se imprime justo al terminar de crear el bean Triangle");
	}

	/**Al igual que afterPropertiesSet, este m�todo se ejecuta al momento de crearse el bean. Para que se ejecute necesito
	 * configurar el bean triangle en mi archivo de configuraci�n para que este m�todo se ejecute al crearse el bean con
	 * init-method en la definici�n del bean.
	*/
	public void miMetodoDeInicio() {
		System.out.println("Este mensaje fue imprimido automaticamente por m� m�todo de inicio.");
		System.out.println("Este m�todo fu� configurado en el archivo Spring.xml.");
	}

	public void miMetodoDeDestruccion() {
		System.out.println("Este mensaje fue imprimido automaticamente por m� m�todo de destrucci�n.");
		System.out.println("Este m�todo fu� configurado en el archivo Spring.xml.");
	}
}

