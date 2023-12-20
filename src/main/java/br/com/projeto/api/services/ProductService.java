package br.com.projeto.api.services;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.ProductModel;
import br.com.projeto.api.model.ResponseModel;
import br.com.projeto.api.repository.ProductRepository;

@Service
public class ProductService {
    

    @Autowired
    private ProductRepository pr;

    @Autowired
    private ResponseModel rm;

    public Iterable<ProductModel> list() {
        return pr.findAll();
    }

    public ResponseEntity<?> registerAlter(ProductModel pm, String action) {
        if(pm.getName().equals("")) {
            rm.setMessage("O nome do produto é obrigatório.");  
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        } else if(pm.getBrand().equals("")) {
            rm.setMessage("O nome da marca é obrigatório.");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(action.equals("register")) {
                 return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.CREATED);
            } else {
                 return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.OK);

            }


        }
        
    }


    public ResponseEntity<ResponseModel> remove (long id) {
        pr.deleteById(id);

        rm.setMessage("O produto foi removido com sucesso");
        return new ResponseEntity<ResponseModel>(rm, HttpStatus.OK);
        
    }
 
}
