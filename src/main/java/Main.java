import model.Produto;

import java.util.*;

public class Main {
    static Map<Integer, Produto> banco = new HashMap<>();
    static private List<Produto> produtos;

    public Main() {
        this.produtos = new ArrayList<>();
    }

    //Criar Produto
    static Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        System.out.println(produto);
        produtos.add(produto);
        return produto;
    }

    static Produto getById(int id) {
        for (Produto produto : produtos) {
            System.out.println("Produto pesquisado por id é ? " + produto + id);
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    static Produto editarProduto(int i, Produto produto) {
        Produto produtogatBYId = getById(i);
        var id = produto.getId();
        var nome = produto.getNome();
        var valor = produto.getValor();
        if (produtogatBYId != null) {
            produtogatBYId.setId(id);
            produtogatBYId.setNome(nome);
            produtogatBYId.setValor(valor);
            System.out.println("Produto editado com sucesso: " + produtogatBYId);

            produtos.add(produtogatBYId);

        } else {
            System.out.println("Produto não encontrado com o ID: " + i);
        }
        return null;
    }

    static void deletarProduto(int id) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produtoDeletado = iterator.next();
            if (produtoDeletado.getId() == id) {
                iterator.remove();
                System.out.println("Produto deletado com sucesso: " + produtoDeletado);
                return;
            }
        }

    }

    static void listarProduto() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    static Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }

    public static void main(String[] args) {
        Main produto = new Main();

        System.out.println(banco.toString());
        Produto produto1 = criarProduto(1, "caixa de som", 300.0);
        Produto produto2 = criarProduto(2, "fone de ouvido", 250.0);
        Produto produto3 = criarProduto(3, "caneta", 50.0);
        System.out.println("-----------------------------------------------");
        //Salvando Produto no Banco apos criação.
        salvarProduto(produto1);
        salvarProduto(produto2);
        salvarProduto(produto3);
//        System.out.println(banco.toString());

        //Ver o Produto no Banco por id.
//        Produto produtoParaEdicao = produto.getById(1);
//        System.out.println("Cliente encontrado: " + clienteParaEdicao);

//        // Editar cliente
//        Produto produtoEditado = criarProduto(1, "controle", 90.0);
//        editarProduto(1, produtoEditado);


        // Deletar produto.
        deletarProduto(1);
        listarProduto();

    }
}
