package bac.dev.se.testapp.controller;

import bac.dev.se.testapp.models.Product;
import bac.dev.se.testapp.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class TestController {
    private final ProductRepository productRepository;
//    int count = 1;
//    @GetMapping
//    public String test(){
//        return  "Hello world " + count++;
//    }

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    public int sum(List<Integer> nums){
        return nums.stream().reduce(0, Integer::sum);
    }
}
