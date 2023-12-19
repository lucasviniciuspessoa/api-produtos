package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    
}
