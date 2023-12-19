package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.ProductModel;
import br.com.projeto.api.services.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService ps;


    @GetMapping("/")
    public Iterable<ProductModel> list() {
        return ps.list();
    }
}
