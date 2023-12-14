import model.Produto;
import java.util.HashMap;
import java.util.Map;
public class Main {
    static Map<Integer, Produto> banco = new HashMap<>();

    //Criar Produto
    static Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produtos = new Produto(id, nome, valor);
        System.out.println(produtos);
        return produtos;
    }

    static Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }

    public static void main(String[] args) {
        System.out.println(banco.toString());
        Produto produto1 = new Produto(1, "caixa de som", 300.0);
        criarProduto(produto1.getId(), produto1.getNome(), produto1.getValor());
        Produto produto2 = new Produto(2, "fone de ouvido", 250.0);
        criarProduto(produto2.getId(), produto2.getNome(), produto2.getValor());
        Produto produto3 = new Produto(3, "caneta", 50.0);
        criarProduto(produto3.getId(), produto3.getNome(), produto3.getValor());
        System.out.println("-----------------------------------------------");
        //Salvando Produto no Banco apos criação.
        salvarProduto(produto1);
        salvarProduto(produto2);
        salvarProduto(produto3);
        System.out.println(banco.toString());

    }
}
