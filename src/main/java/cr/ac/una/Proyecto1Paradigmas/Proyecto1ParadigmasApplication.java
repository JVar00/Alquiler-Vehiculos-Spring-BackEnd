package cr.ac.una.Proyecto1Paradigmas;

import cr.ac.una.Proyecto1Paradigmas.entity.Alquiler;
import cr.ac.una.Proyecto1Paradigmas.entity.Persona;
import cr.ac.una.Proyecto1Paradigmas.entity.Tipo_Vehiculo;
import cr.ac.una.Proyecto1Paradigmas.entity.Vehiculo;
import cr.ac.una.Proyecto1Paradigmas.repository.AlquilerRepository;
import cr.ac.una.Proyecto1Paradigmas.repository.PersonaRepository;
import cr.ac.una.Proyecto1Paradigmas.repository.Tipo_VehiculoRepository;
import cr.ac.una.Proyecto1Paradigmas.repository.VehiculoRepository;
import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication

public class Proyecto1ParadigmasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1ParadigmasApplication.class, args);
	}

	@Bean
	CommandLineRunner run(AlquilerRepository alquilerRepository, PersonaRepository personaRepository,
			Tipo_VehiculoRepository tipo_VehiculoRepository, VehiculoRepository vehiculoRepository) {
		return args -> {

			personaRepository.save(new Persona( null,"123", "juan"));
			personaRepository.save(new Persona( null,"456", "pedro"));
			personaRepository.save(new Persona( null,"789", "maria"));
			vehiculoRepository.save(new Vehiculo(null, "123456", null));
			vehiculoRepository.save(new Vehiculo(null, "123457", null));
			vehiculoRepository.save(new Vehiculo(null, "123458", null));
			tipo_VehiculoRepository.save(new Tipo_Vehiculo(null, "avion"));
			tipo_VehiculoRepository.save(new Tipo_Vehiculo(null, "moto"));
			tipo_VehiculoRepository.save(new Tipo_Vehiculo(null, "lancha"));
		};
	}

}
