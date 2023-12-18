package model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Setter
@Log4j2
public class Produto {
    public Produto() {
    }

    public Produto(Integer id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }


    @Getter
    private Integer id;
    private String nome;
    @Getter
    private Double valor;

    public String getNome() {
        return this.nome = nome;
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
