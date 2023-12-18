import lombok.extern.log4j.Log4j2;
import model.Produto;
import repository.ProdutoRepository;
import service.ProdutoService;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Main produto = new Main();
        ProdutoRepository repo = new ProdutoRepository();
        ProdutoService service = new ProdutoService(repo);
        log.info("info atual no banco: {} ", service.bancoToString());

        Produto produto1 = service.criarProduto(1, "caixa de som", 300.0);
//        Produto produto2 = service.criarProduto(2, "fone de ouvido", 250.0);
//        Produto produto3 = service.criarProduto(3, "caneta", 50.0);
//        log.info("-----------------------------------------------");
        //Salvando Produto no Banco apos criação.
        service.salvarProduto(produto1);
//        service.salvarProduto(produto2);
//        service.salvarProduto(produto3);
//        log.info(service.bancoToString());
        //Ver o Produto no Banco por id.
        Produto produtoParaEdicao = service.getById(1);
        System.out.println("Cliente encontrado: " + produtoParaEdicao);
//
////        // Editar cliente
////        Produto produtoEditado = criarProduto(1, "controle", 90.0);
////        editarProduto(1, produtoEditado);
//
//
//        // Deletar produto.
//        deletarProduto(1);
//        listarProduto();

    }
}
