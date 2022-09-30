package com.algaworks.festa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <h3>Classe responsável em representar a entidade de convidado.</h3>
 *
 * @Entity Torna a classe como uma entidade do banco de dados.
 * @Id Marca a propriedade ‘id’ como identificador de entidade.
 * @GeneratedValue Pede que o Hibernate gere o identificador respectivamente.
 *
 */
@Entity
public class Convidado implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String sobrenome;
    private Integer quantidadeAcompanhantes;

    /**
     * <h3>Construtor da classe Convidado sem argumento</h3>
     */
    public Convidado() {
    }

    /**
     * <h3>Construtor da classe Convidado comm argumento</h3>
     *
     * @param id <p>Objeto responsável em receber um identificador.</p>
     * @param nome <p>Objeto responsável em receber o nome do convidado.</p>
     * @param sobrenome <p>Objeto responsável em receber o sobrenome do convidado.</p>
     * @param quantidadeAcompanhantes <p>Objeto responsável em receber a quantidade de acompanhantes.</p>
     */
    public Convidado(Long id, String nome, String sobrenome, Integer quantidadeAcompanhantes) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;

        return getId() != null ? getId().equals(convidado.getId()) : convidado.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
