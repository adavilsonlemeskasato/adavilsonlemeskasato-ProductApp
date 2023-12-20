package service;

import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;

import java.util.List;

@Log4j2
public class ProduceService {
    private final ProdutoRepository repository;

    public ProduceService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto criarProduto(Integer id, String nome, Double valor) {
        log.info("Produto {} criado com sucesso.", nome);
        return new Produto(id, nome, valor);
    }

    public void salverProduce(Produto produto) {
        repository.salvarProduto(produto);
    }

    public void editorProduce(Produto produto) {
        log.info("Produto {} editado com sucesso.", produto.getNome());
        repository.editarProduto(produto);
    }

    public Produto getById(int id) {
        return repository.getById(id);
    }

    public String bancoToString() {
        return repository.toString();
    }

    public void deleterProduce(Integer id) {
        log.info("Produto {} deletado com sucesso.", id);
        repository.deletarProduto(id);
    }

    public List<Produto> listaProduto() {
        return repository.listarProduto();
    }

}
