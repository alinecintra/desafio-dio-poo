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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bootcamp bootcamp = (Bootcamp) o;
//        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsIsncritos, bootcamp.devsIsncritos) && Objects.equals(conteudos, bootcamp.conteudos);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsIsncritos, conteudos);
//    }
}
