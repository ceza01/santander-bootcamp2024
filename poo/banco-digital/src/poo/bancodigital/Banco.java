package poo.bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta encontrada.");
        } else {
            for (Conta conta : contas) {
                conta.imprimirExtrato();
            }
        }
    }

}