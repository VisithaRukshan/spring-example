import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visitha.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		System.out.println("before appcontext");
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(appContext);
		System.out.println("");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());

	}

}
