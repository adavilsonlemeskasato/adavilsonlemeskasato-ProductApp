package repository;

import lombok.extern.log4j.Log4j2;
import model.Produto;

import java.util.*;

@Log4j2
public class ProdutoRepository {
    public static Map<Integer, Produto> banco = new HashMap<>();
    //Criando Produto
    public Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }
    //Procurando Produto por ID
    public Produto getById(Integer id) {
        return banco.get(id);
    }
    //Editar Produto
    public Produto editarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }
    //Deletar Produto
    public void deletarProduto(int id) {
        banco.remove(id);
    }
    //Listar Produto
    public List<Produto> listarProduto() {
        var listaProduto = banco.values().stream().toList();
        log.info("Lista de Produtos: .+++++\n  {} \n", listaProduto);
        return listaProduto;
    }
}
