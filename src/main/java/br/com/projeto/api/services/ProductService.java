package br.com.projeto.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.ProductModel;
import br.com.projeto.api.repository.ProductRepository;

@Service
public class ProductService {
    

    @Autowired
    private ProductRepository pr;


    public Iterable<ProductModel> list() {
        return pr.findAll();
    }

}
