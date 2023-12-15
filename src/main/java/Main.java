import lombok.extern.log4j.Log4j2;
import repository.ProdutoRepository;
import service.ProdutoService;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ProdutoRepository repo = new ProdutoRepository();
        ProdutoService service = new ProdutoService(repo);
        log.info("info atual no banco: {}", service.bancoToString());

        var produto1 = service.criarProduto(1, "caixa de som", 300.0);
        var produto2 = service.criarProduto(2, "fone de ouvido", 250.0);
        var produto3 = service.criarProduto(3, "caneta", 50.0);

        service.salvarProduto(produto1);
        service.salvarProduto(produto2);
        service.salvarProduto(produto3);

        log.info("info atual no banco: {}", service.bancoToString());
    }
}
