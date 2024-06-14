package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(int cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (estoqueProdutos.isEmpty()){
            System.out.println("O estoque está vazio");
        } else {
            System.out.println(estoqueProdutos);
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorQuantidade = null;
        double maiorValor = 0;
        if (!estoqueProdutos.isEmpty()){
            for (Map.Entry<Integer, Produto> entry : estoqueProdutos.entrySet()) {
                double valorProduto  = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProduto > maiorValor){
                    maiorValor = valorProduto;
                    maiorQuantidade = entry.getValue();
                }
            }
        }
        return maiorQuantidade;
    }
}
