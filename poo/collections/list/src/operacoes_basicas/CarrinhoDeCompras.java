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
        for (Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaRemover.add(i);
            }
        }
        carrinho.removeAll(listaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : carrinho){
            double valorItem = item.getQuantidade() * item.getPreco();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

}
