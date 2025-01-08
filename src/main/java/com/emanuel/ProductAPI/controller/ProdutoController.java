package com.emanuel.ProductAPI.controller;

import com.emanuel.ProductAPI.model.Produto;
import com.emanuel.ProductAPI.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.UUID;

import static java.sql.DatabaseMetaData.tableIndexOther;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto Recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto ObterIdProduto(@PathVariable String id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.isPresent() ? produto.get() : null;

    }
}
