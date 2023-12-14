package service;

import model.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    static Map<Integer, Produto> banco = new HashMap<>();

    public Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        System.out.println(String.format("O produto %s foi criado com sucesso", produto.getNome()));
        return produto;
    }

    public boolean salvarProduto(Produto produto) {
        try {
            banco.put(produto.getId(), produto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Map<Integer, Produto> getBanco() {
        return banco;
    }
}
