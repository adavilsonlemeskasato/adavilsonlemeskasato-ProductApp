import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;
import service.ProduceService;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ProdutoRepository repo = new ProdutoRepository();
        ProduceService service = new ProduceService(repo);
        log.info("Info atual no banco: {} ", service.bancoToString());
        Produto produto1 = service.criarProduto(1, "caixa de som", 300.0);
        Produto produto2 = service.criarProduto(2, "fone de ouvido", 250.0);
        Produto produto3 = service.criarProduto(3, "caneta", 50.0);
        log.info("-----------------------------------------------");
        //Salvando Produto no Banco apos criação.
        service.salverProduce(produto1);
        service.salverProduce(produto2);
        service.salverProduce(produto3);
        log.info(service.bancoToString());
        //Ver o Produto no Banco por id.
        Produto produtoParaEdicao = service.getById(1);
        log.info("Cliente encontrado: {}" , produtoParaEdicao);
        // Editar cliente
        Produto produtoEditado = service.criarProduto(1, "controle", 90.0);
        service.editorProduce(produtoEditado);
        // Deletar produto.
        service.deleterProduce(1);
        service.listaProduto();

    }
}
