package repository;

import model.Produto;

import java.util.*;

public class ProdutoRepository {
    private final static Map<Integer, Produto> banco = new HashMap<>();
    public Produto save(Produto produto) {
        banco.put(produto.getId(), produto);
        return produto;
    }

    public Optional<Produto> getById(Integer id) {
        return Optional.of(banco.getOrDefault(id, null));
    }

    public Optional<List<Produto>> getAll() {
        return Optional.of(banco.values().stream().toList());
    }

    public void deleteById(Integer id) {
        banco.remove(id);
    }

    public String bancoToString() {
        return banco.toString();
    }
}
