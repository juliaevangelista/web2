package edu.pw2.superesportes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pw2.superesportes.model.Atleta;
import edu.pw2.superesportes.model.AtletaDados;

@Controller
@RequestMapping("/atletas")

public class AtletaControler {
    
    @GetMapping
    public String loadAtletaForm(){
        return "atleta/cadastro";
    }
    @GetMapping("/cadastrar")
    public String salvarAtleta(AtletaDados dados, Model model){
        Atleta al = new Atleta(dados);
        model.addAttribute("atleta", al);
        return "atleta/exibir";
    }

}
