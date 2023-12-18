package service;

import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;

@Log4j2
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        return produto;
    }

    public Produto salvarProduto(Produto produto) {
        log.info(produto);
        return repository.salvarProduto(produto);
    }

    public Produto getById(int id) {
        log.info(id);
        return repository.getById(id);
    }

    public String bancoToString() {
        return repository.toString();
    }



}
