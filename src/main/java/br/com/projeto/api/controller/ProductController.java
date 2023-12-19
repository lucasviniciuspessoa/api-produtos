package br.com.projeto.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {



    @GetMapping("/")
    public String paginaInicial() {
        return "Olá, Mundo";
    }
}
