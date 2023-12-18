package repository;

import lombok.extern.log4j.Log4j2;
import model.Produto;

import java.util.*;

@Log4j2
public class ProdutoRepository {
    public Map<Integer, Produto> banco = new HashMap<>();
    static private List<Produto> repositoryProd;

   public ProdutoRepository() {
        repositoryProd = new ArrayList<>();
    }

    //Criando Produto
    public Produto criarProduto(Integer id, String nome, Double valor) {
        Produto produto = new Produto(id, nome, valor);
        repositoryProd.add(produto);
        log.info(repositoryProd);
        return produto;
    }

    public Produto salvarProduto(Produto produto) {
        return banco.put(produto.getId(), produto);
    }

    public Produto getById(Integer id) {
        log.info(id);
        log.info(id + " estou fora do for");
        log.info(repositoryProd + " produto");
        for (Produto produto : repositoryProd) {
            log.info(id + "estou aqui no for");
            if (produto.getId() == id) {
                log.info(id);
                log.info("Produto pesquisado por id é { } ? " , produto);
                return produto;
            }
        }
        return null;
    }

    public Produto editarProduto(int i, Produto produto) {
        Produto produtogatBYId = getById(i);
        var id = produto.getId();
        var nome = produto.getNome();
        var valor = produto.getValor();
        if (produtogatBYId != null) {
            produtogatBYId.setId(id);
            produtogatBYId.setNome(nome);
            produtogatBYId.setValor(valor);
            log.info("Produto { } editado com sucesso " , produtogatBYId);
            repositoryProd.add(produtogatBYId);

        } else {
            log.info("Produto não encontrado com o ID: " + i);
        }
        return null;
    }

    public void deletarProduto(int id) {
        Iterator<Produto> iterator = repositoryProd.iterator();
        while (iterator.hasNext()) {
            Produto produtoDeletado = iterator.next();
            if (produtoDeletado.getId() == id) {
                iterator.remove();
                log.info("Produto { }  deletado com sucesso: " , produtoDeletado);
                return;
            }
        }

    }

    public void listarProduto() {
        log.info("Lista de Produtos:");
        for (Produto produto : repositoryProd) {
            log.info(produto);
        }
    }
}
