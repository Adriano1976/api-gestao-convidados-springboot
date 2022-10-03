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
 * <h3>Classe responsável em receber a requisição e dizer o nome da view ao framework,
 * para então ser renderizada de volta ao browser do cliente.</h3>
 * <p>A anotação @Controller é para informar que a classe é um componente Spring e que é um controller.</p>
 */
@RestController
@RequestMapping(value = "/convidados")
public class ConvidadosController {

    /**
     * A anotação @Autowired no objeto convidados, informa que o Spring será responsável por
     * estânciar o objeto quando for chamado aqui na classe.
     */
    @Autowired
    private ConvidadosRepositoty convidados;

    /**
     * Método responsáel por listar os convidados para mostrar na view.
     * A anotação @GetMapping informa que responderá à requisição HTTP do tipo GET deve cair nesse método.
     * Com isso, o Spring MVC sabe que a view deve ser renderizada para o cliente.
     * As anotações @ApiResponses e @ApiResponse são responsáveis por especificar os códigos e as mensagens
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
     * Método responsável por salvar as informações do convidado na base de dados.
     *
     * @param convidado Objeto responsável por receber as informações do convidado e manipular esses dados.
     * @return Retorna ao formulário inicial após salvar os dados e validado corretamente.
     */
    @PostMapping(produces = "application/json", consumes = "application/json")
    public String salvar(@Validated @RequestBody Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
