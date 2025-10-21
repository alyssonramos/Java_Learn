package com.example.meu_segundo_springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {

    public String obterMensagem() {
        return "Mensagem do ProdutoRepository";
    }
}
