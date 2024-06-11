package operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()){
            for (Item i : carrinho){
                if(i.getNome().equalsIgnoreCase(nome)){
                    listaRemover.add(i);
                }
            }
            carrinho.removeAll(listaRemover);
        } else {
            throw new RuntimeException("O carrinho está vazinho!");
        }

    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho){
                double valorItem = item.getQuantidade() * item.getPreco();
                valorTotal += valorItem;
            }
        }
        return valorTotal;
    }

    public void exibirItens(){
        if (!carrinho.isEmpty()){
            System.out.println(carrinho);
        } else {
            System.out.println("O carrinho está vazinho!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinho +
                '}';
    }
}
