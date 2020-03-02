package io.github.affonsobrian.estudographql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.affonsobrian.estudographql.model.Empregado;
import io.github.affonsobrian.estudographql.repository.EmpregadoRepository;
import io.github.affonsobrian.estudographql.repository.ProjetoRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private EmpregadoRepository empregadoRepository;
    private ProjetoRepository projetoRepository;

    public Query(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
        this.empregadoRepository = empregadoRepository;
        this.projetoRepository = projetoRepository;
    }

    public List<Empregado> obterEmpregados() {
        return empregadoRepository.findAll();
    }

    public long contarEmpregados() {
        return empregadoRepository.count();
    }

    public Empregado obterEmpregadoPorId(Long id) {
        return empregadoRepository.findById(id).orElseThrow(null);
    }

}
