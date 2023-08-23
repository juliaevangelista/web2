package edu.pw2.partida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pw2.partida.model.Partida;
import edu.pw2.partida.model.PartidaDados;

@Controller
@RequestMapping("/atletas")

public class PartidaController {
    
    @GetMapping
    public String loadAtletaForm(){
        return "atleta/cadastro";
    }
    @GetMapping("/cadastrar")
    public String salvarAtleta(PartidaDados dados, Model model){
        Partida al = new Partida(dados);
        model.addAttribute("atleta", al);
        return "atleta/exibir";
    }

}