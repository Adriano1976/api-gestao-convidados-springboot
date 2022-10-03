package com.algaworks.festa.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serial;
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
@Table(name = "`tb_convidado`")
public class Convidado implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "Código do convidado")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "`id`", nullable = false)
    private Long id;
    @ApiModelProperty(value = "Nome do convidado")
    @Column(name = "`nome`", length = 100, nullable = false)
    private String nome;
    @ApiModelProperty(value = "Sobrenome do convidado")
    @Column(name = "`sobrenome`", length = 100, nullable = false)
    private String sobrenome;
    @ApiModelProperty(value = "Quantidade de acompanhantes do convidado")
    @Column(name = "`quantidadeAcompanhantes`", length = 10, nullable = false)
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
