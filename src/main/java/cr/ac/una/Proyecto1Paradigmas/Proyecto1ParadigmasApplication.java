package cr.ac.una.Proyecto1Paradigmas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Proyecto1ParadigmasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1ParadigmasApplication.class, args);
	}

}
