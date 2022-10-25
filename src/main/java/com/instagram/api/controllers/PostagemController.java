package com.instagram.api.controllers;

import com.instagram.api.model.entities.Postagem;
import com.instagram.api.services.PostagemService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.rmi.server.LogStream.log;

@RestController
@RequestMapping("postagem")
@Log4j2
public class PostagemController {

    @Autowired
    private PostagemService service;

    @PostMapping
    public Postagem salvar(@RequestBody Postagem postagem){
        log.info("Salvar: {} ",postagem);

        return service.salvar(postagem);
    }

    @PutMapping
    public boolean alterar(@PathVariable("id") Long id,  @RequestBody Postagem postagem){
        log.info("alterar: {}, {}"+id +""+ postagem);

        return service.alterar(id, postagem);
    }

    @GetMapping("id/{id}")
    public Postagem pegarUm(@PathVariable("id") Long id){
        log.info("pegar um: {}",id);
        return service.pegarUm(id);
    }

    @DeleteMapping("id/{id}")
    public boolean excluir(@PathVariable ("id/{id}") Long id){
        log.info("excluir: {}",id);
        return service.excluir(id);
    }



    @GetMapping
    public List<Postagem> listar(){
        log.info("listar ");

        return service.listar();
    }

}
