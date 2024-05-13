package it.epicode.G1;

import it.epicode.G1.elements.MyAppConfig;
import it.epicode.G1.elements.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class G1Application {

	public static void main(String[] args) {
		SpringApplication.run(G1Application.class, args);

		try{
			ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);

			var pizza1 = ctx.getBean("pizza1");
			System.out.println(pizza1);
		}catch(Exception e){
			System.out.println("errore");
		}





	}

}
