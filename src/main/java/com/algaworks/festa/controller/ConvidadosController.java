package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoty.ConvidadosRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h3>Classe responsável em receber a requisição e dizer o nome da view ao framework,
 * para então ser renderizada de volta ao browser do cliente.</h3>
 * <p>A anotação @Controller é para informar que a classe é um componente Spring e que é um controller.</p>
 */
@Controller
@RequestMapping("/convidados")
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
     *
     * @return Retorna a lista de convidados.
     */
    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject(new Convidado());
        modelAndView.addObject("convidados", convidados.findAll());
        return modelAndView;
    }

    @PostMapping
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
