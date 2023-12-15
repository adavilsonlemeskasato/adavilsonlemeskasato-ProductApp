import model.Produto;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, Produto> banco = new HashMap<>();

    //Criar Produto
    static Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        System.out.println(produto);
        return produto;
    }


    static Produto editarProduto (){
        return null;
    }

    static Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }

    public static void main(String[] args) {
        System.out.println(banco.toString());
        Produto produto1 = criarProduto(1,"caixa de som",300.0);
        Produto produto2 = criarProduto(2, "fone de ouvido", 250.0);
        Produto produto3 = criarProduto(3, "caneta", 50.0);
        System.out.println("-----------------------------------------------");
        //Salvando Produto no Banco apos criação.
        salvarProduto(produto1);
        salvarProduto(produto2);
        salvarProduto(produto3);
        System.out.println(banco.toString());

    }
}
