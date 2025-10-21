package com.example.meu_segundo_springboot.services;

import org.springframework.stereotype.Service;

import com.example.meu_segundo_springboot.repository.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String getProdutoRepository() {
        return produtoRepository.obterMensagem();
    }
}
