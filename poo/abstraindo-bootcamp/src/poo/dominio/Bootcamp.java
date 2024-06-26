package poo.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final Set<Dev> devsInscritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia");
        }
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return new HashSet<>(devsInscritos);
    }

    public Set<Conteudo> getConteudos() {
        return new LinkedHashSet<>(conteudos);
    }

    public void addConteudo(Conteudo conteudo){
        if (conteudo == null) {
            throw new IllegalArgumentException("Conteúdo não pode ser nulo");
        }
        conteudos.add(conteudo);
    }

    public void inscreverDev(Dev dev) {
        if (dev == null) {
            throw new IllegalArgumentException("Dev não pode ser nulo");
        }
        if (devsInscritos.contains(dev)) {
            throw new IllegalArgumentException("Dev já está inscrito neste bootcamp");
        }
        devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(dataInicial, bootcamp.dataInicial) &&
                Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
                Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
