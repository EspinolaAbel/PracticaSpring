package practica;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**Esta clase tiene como función la de probar el funcionamiento del BeanFactoryPostProcessor. El BeanFactoryPostProcessor es una
 * interface que me permite implementar el método postProcessBeanFactory(), el cual es un método que se ejecuta inmediatamente
 * después de que el beanFactory se instancie por el contenedor de Spring.*/
public class MiBeanFactoryPostProcesorClass implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("-->En este momento se esta ejecutando el método del BeanFactoryPostProcessor");		
	}

}
