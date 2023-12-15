package service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;

@Log4j2
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;

    public Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        log.info("Produto {} criado com sucesso.", nome);
        return produto;
    }

    public Produto salvarProduto(Produto produto) {
        return repository.save(produto);
    }

    public String bancoToString() {
        return repository.bancoToString();
    }
}
