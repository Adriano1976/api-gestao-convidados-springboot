package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoty.ConvidadosRepositoty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classe responsavel em receber a requisicao e dizer o nome da view ao framework,
 * para entao ser renderizada de volta ao navegador do cliente.
 * A anotacao @Controller tem a funcao de informar que a classe esta sendo um componente Spring e que esta sendo um controller.
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
    private ConvidadosRepositoty convidados;

    /**
     * Metodo responsavel por listar os convidados para mostrar na view.
     * A anotacao {@code @GetMapping} informa que respondera para a requisição HTTP do tipo GET deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações {@code @ApiResponses} e {@code @ApiResponse} são responsaveis por especificar os ccdigos e as mensagens
     * de retorno diretamente no controller.
     *
     * @return Retorna a lista de convidados.
     */
    @ApiOperation(value = "Retorna uma lista de convidados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de convidados"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    @GetMapping(produces = "application/json")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");

        modelAndView.addObject(new Convidado());
        modelAndView.addObject("convidados", convidados.findAll());

        return modelAndView;
    }

    /**
     * Metodo responsavel por salvar as informacwes do convidado na base de dados.
     * O atributo {@code produces} esta sendo responsavel em indicar o tipo do conteúdo que ele produz.
     * O atributo {@code consumes} esta sendo responsável em especificar o tipo de conteudo que ele consume.
     *
     * @param convidado Objeto responsavel por receber as informacoes do convidado e manipular esses dados.
     * @return Retorna ao formulario inicial apo salvar os dados e validado corretamente.
     */
    @PostMapping(produces = "application/json", consumes = "application/json")
    public String salvar(@Validated @RequestBody Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
