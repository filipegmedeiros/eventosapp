package br.ufrn.evento.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {

    @RequestMapping("/") /* Requisao, retorno */
    public String index(){
        return "index";
    }
}
