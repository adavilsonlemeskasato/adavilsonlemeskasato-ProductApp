import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;
import service.ProdutoService;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ProdutoRepository repo = new ProdutoRepository();
        ProdutoService service = new ProdutoService(repo);

        log.info("info atual no banco: {} ", service.bancoToString());

        Produto produto1 = service.criarProduto(1, "caixa de som", 300.0);

        service.salvarProduto(produto1);

        Produto produtoParaEdicao = service.getById(1);
        System.out.println("Produto encontrado: " + produtoParaEdicao);
    }
}
