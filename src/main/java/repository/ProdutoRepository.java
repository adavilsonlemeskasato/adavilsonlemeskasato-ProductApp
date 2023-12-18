package repository;

import lombok.extern.log4j.Log4j2;
import model.Produto;

import java.util.*;

@Log4j2
public class ProdutoRepository {
    private static Map<Integer, Produto> banco = new HashMap<>();

    public Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }

    public Produto getById(Integer id) {
        return banco.get(id);
    }

    public Produto editarProduto(Produto produto) {
        if(banco.containsKey(produto.getId())){
            banco.put(produto.getId(), produto);
            return produto;
        } else {
            throw new RuntimeException("Produto nâo existente");
        }
    }

    public void deletarProduto(int id) {
        banco.remove(id);
    }

    public List<Produto> listarProduto() {
        return (List<Produto>) banco.values();
    }
}
