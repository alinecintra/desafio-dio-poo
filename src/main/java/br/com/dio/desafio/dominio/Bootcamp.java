package br.com.dio.desafio.dominio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsIsncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Set<Dev> getDevsIsncritos() {
        return devsIsncritos;
    }

    public void setDevsIsncritos(Set<Dev> devsIsncritos) {
        this.devsIsncritos = devsIsncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
}
