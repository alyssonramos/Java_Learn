package com.example.meu_segundo_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_segundo_springboot.services.ProdutoService;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @RequestMapping()
    public String getProduto() {
        return produtoService.getProdutoRepository();
    }
}
