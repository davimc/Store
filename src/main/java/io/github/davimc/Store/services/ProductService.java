package io.github.davimc.Store.services;

import io.github.davimc.Store.dto.ProductDTO;
import io.github.davimc.Store.dto.ProductNewDTO;
import io.github.davimc.Store.dto.ProductUpdateDTO;
import io.github.davimc.Store.entities.Product;
import io.github.davimc.Store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product findById(Long id) {

        return repository.findById(id).orElse(null);
    }
    public List<Product> findAll() {

        return repository.findAll();
    }

    public ProductDTO insert(ProductNewDTO dtoNew) {
        Product obj = dtoNew.toModel();
        return new ProductDTO(repository.save(obj));
    }

    public ProductDTO update(Long id, ProductUpdateDTO dtoUpdate) throws Exception {
        Product obj = repository.findById(id).orElseThrow(() -> new Exception("Resource not found"));
        obj = dtoUpdate.toModel(obj);
        obj = repository.save(obj);

        return new ProductDTO(obj);
    }

    public void delete(Long id) throws Exception {
        Product obj = repository.findById(id).orElseThrow(() -> new Exception("Resource not found"));
        repository.delete(obj);
    }
}
