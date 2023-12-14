import model.Produto;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        var service = new ProductService();
        var banco = service.getBanco();
        System.out.println(banco.toString());

        Produto produto1 = new Produto(1, "caixa de som", 300.0);
        service.criarProduto(produto1.getId(), produto1.getNome(), produto1.getValor());
        Produto produto2 = new Produto(2, "fone de ouvido", 250.0);
        service.criarProduto(produto2.getId(), produto1.getNome(), produto1.getValor());
        Produto produto3 = new Produto(3, "caneta", 50.0);
        service.criarProduto(produto3.getId(), produto1.getNome(), produto1.getValor());

        System.out.println("-----------------------------------------------");

        //Salvando Produto no Banco apos criação.
        service.salvarProduto(produto1);
        service.salvarProduto(produto2);
        service.salvarProduto(produto3);

        System.out.println(banco);

    }
}
