import java.util.Locale;
import java.util.Scanner;
class Produto {
private String nome;
private double preco;
private int quantidade;

public Produto(String nome, double preco, int quantidade) {
this.nome = nome;
this.preco = preco;
this.quantidade = quantidade;
}

public double valorTotalEstoque() {
return preco * quantidade;
}

@Override
public String toString() {
return String.format("Nome: %s%nPreço: %.2f%nQuantidade: %d%nValor Total: %,.2f",
nome, preco, quantidade, valorTotalEstoque());
}
}
