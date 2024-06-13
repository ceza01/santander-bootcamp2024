package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media){
        setAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula){
        Aluno alunoRemover = null;
        if (!setAlunos.isEmpty()){
            for (Aluno a : setAlunos){
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            setAlunos.remove(alunoRemover);
        } else {
            System.out.println("Não há alunos matriculados.");
        }
        if (alunoRemover == null){
            System.out.println("Aluno não encontrado.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparadorPorMedia());
        alunosPorNota.addAll(setAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(setAlunos);
    }
}
