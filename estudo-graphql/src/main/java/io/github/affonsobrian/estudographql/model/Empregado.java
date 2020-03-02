package io.github.affonsobrian.estudographql.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Empregado {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @Column(name = "nascimento", nullable = false)
    private Date nascimento;

    @OneToMany(mappedBy = "empregado", fetch = FetchType.EAGER)
    private List<Projeto> projetos;

    public Empregado(){

    }

    public Empregado(String nome, Integer idade, Date nascimento) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
}