package io.github.affonsobrian.estudographql.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.affonsobrian.estudographql.model.Empregado;
import io.github.affonsobrian.estudographql.repository.EmpregadoRepository;
import io.github.affonsobrian.estudographql.repository.ProjetoRepository;

import java.util.Date;

public class Mutation implements GraphQLMutationResolver {

    private EmpregadoRepository empregadoRepository;
    private ProjetoRepository projetoRepository;

    public Mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
        this.empregadoRepository = empregadoRepository;
        this.projetoRepository = projetoRepository;
    }

    public Empregado novoEmpregado(String nome, Integer idade) {
        Empregado empregado = new Empregado(nome, idade, new Date());
        empregadoRepository.save(empregado);
        return empregado;
    }

    public String joaoCuzao(){
        return "Joao Cuzao";
    }

    public boolean deletarEmpregado(Long id) {
        empregadoRepository.deleteById(id);
        return true;
    }

}
