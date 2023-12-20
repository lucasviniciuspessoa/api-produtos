package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.ProductModel;
import br.com.projeto.api.services.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService ps;


    @GetMapping("/")
    public Iterable<ProductModel> list() {
        return ps.list();
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody ProductModel pm) {
        return ps.registerAlter(pm, "register");
    }

    @PutMapping("/alter")
    public ResponseEntity<?> alter(@RequestBody ProductModel pm) {
        return ps.registerAlter(pm, "alterar");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        return ps.remove(id);

    }
}
