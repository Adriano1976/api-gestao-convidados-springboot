package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoty.ConvidadosRepositoty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Optional;

/**
 * Classe responsavel em receber a requisicao e dizer o nome da view ao framework,
 * para entao ser renderizada de volta ao navegador do cliente.
 * A anotacao @Controller tem a funcao de informar que a classe está sendo um componente Spring e que esta sendo um controller.
 *
 * @author Adriano Santos
 */
@RestController
@RequestMapping(value = "/convidados")
public class ConvidadosController {

    /**
     * A anotacao @Autowired no objeto convidados, informa que o Spring sera responsavel por
     * estanciar o objeto quando for chamado aqui na classe.
     */
    @Autowired
    private ConvidadosRepositoty convidadosRepositoty;

    /**
     * Metodo responsavel por listar os convidados para mostrar na view.
     * <p>
     * A anotacao {@code @GetMapping} informa que respondera para a requisição HTTP do tipo GET deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações {@code @ApiResponses} e {@code @ApiResponse} são responsaveis por especificar os ccdigos e as mensagens
     * de retorno diretamente no controller.
     *
     * @return Retorna a lista de convidados.
     */
    @ApiOperation(value = "Retorna uma lista dos convidados da base de dados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma confirmação de que os convidados foram encontrados com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @GetMapping(produces = "application/json")
    public ModelAndView listaConvidados() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");

        if (!modelAndView.isEmpty()) {
            modelAndView.addObject(new Convidado());
            modelAndView.addObject("convidados", convidadosRepositoty.findAll());
        }

        return modelAndView;
    }


    /**
     * Metodo responsavel por listar os convidados para mostrar na view.
     * <p>
     * A anotacao {@code @GetMapping} informa que respondera para a requisição HTTP do tipo GET deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações {@code @ApiResponses} e {@code @ApiResponse} são responsaveis por especificar os ccdigos e as mensagens
     * de retorno diretamente no controller.
     *
     * @return Retorna a lista de convidados.
     */
    @ApiOperation(value = "Retorna um convidado específico de acordo com o id na base de dados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma confirmação de que um convidado foi encontrado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ModelAndView listarOneConvidado(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");

        if (!modelAndView.isEmpty()) {
            modelAndView.addObject(new Convidado());
            modelAndView.addObject("convidados", convidadosRepositoty.findAllById(Collections.singleton(id)));
        }

        return modelAndView;
    }


    /**
     * Metodo responsavel por salvar as informacoes do convidado na base de dados.
     * <p>
     * O atributo {@code produces} esta sendo responsavel em indicar o tipo do conteúdo que ele produz.
     * O atributo {@code consumes} esta sendo responsável em especificar o tipo de conteudo que ele consume.
     *
     * @param convidado Objeto responsavel por receber as informacoes do convidado e manipular esses dados.
     * @return Retorna ao formulario inicial apo salvar os dados e validado corretamente.
     */

    @ApiOperation(value = "Faz a inserção de um novo convidado na base de dados.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma confirmação de que um novo convidado foi salvo com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Convidado> salvaConvidado(@Validated @RequestBody Convidado convidado) {

        return new ResponseEntity<>(convidadosRepositoty.save(convidado), HttpStatus.CREATED);
    }


    /**
     * Metodo responsavel por Deletar o convidado escolhido pelo ‘id’.
     * <p>
     * A anotacao {@code @DeleteMapping} informa que respondera para a requisição HTTP do tipo DELETE deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações {@code @ApiResponses} e {@code @ApiResponse} são responsaveis por especificar os ccdigos e as mensagens
     * de retorno diretamente no controller.
     *
     * @return Retorna um status de confirmação ou não.
     */
    @ApiOperation(value = "Apaga um convidado específico de acordo com o id na base de dados.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma confirmação de que o convidado específico foi apagado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> deleteConvidado(@PathVariable(value = "id") Long id) {
        Optional<Convidado> ConvidadoOptional = convidadosRepositoty.findById(id);

        if (ConvidadoOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            convidadosRepositoty.delete(ConvidadoOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }


    /**
     * Metodo responsavel por Alterar os dados de um convidado escolhido pelo ‘id’.
     * <p>
     * A anotacao {@code @PutMapping} informa que respondera para a requisição HTTP do tipo UPDATE deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações {@code @ApiResponses} e {@code @ApiResponse} são responsaveis por especificar os ccdigos e as mensagens
     * de retorno diretamente no controller.
     *
     * @return Retorna um status de confirmação ou não.
     */
    @ApiOperation(value = "Altera um convidado específico de acordo com o id na base de dados.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma confirmação de que o convidados foi alterado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Convidado> updateConvidado(@PathVariable(value = "id") Long id, @RequestBody @Validated Convidado convidado) {
        Optional<Convidado> ConvidadoOptional = convidadosRepositoty.findById(id);

        if (ConvidadoOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            convidado.setId(ConvidadoOptional.get().getId());
            return new ResponseEntity<>(convidadosRepositoty.save(convidado), HttpStatus.OK);
        }
    }
}
