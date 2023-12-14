package model;

public class Produto {
    public Produto() {
    }

    public Produto(Integer id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = -valor;
    }

    private Integer id;
    private String nome;
    private Double valor;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome = nome;
    }

    public void setNome(Integer id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }
    public void setValor(Integer id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}' + '\n';
    }


}
