package com.emanuel.ProductAPI.repository;

import com.emanuel.ProductAPI.model.Produto;
import  org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
