package io.github.affonsobrian.estudographql;

import io.github.affonsobrian.estudographql.repository.EmpregadoRepository;
import io.github.affonsobrian.estudographql.repository.ProjetoRepository;
import io.github.affonsobrian.estudographql.service.Mutation;
import io.github.affonsobrian.estudographql.service.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EstudoGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoGraphqlApplication.class, args);
	}

	@Bean
	public Query query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
		return new Query(empregadoRepository, projetoRepository);
	}

	@Bean
	public Mutation mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
		return new Mutation(empregadoRepository, projetoRepository);
	}
}
