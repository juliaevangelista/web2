package edu.pw2.partidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pw2.partidas.model.Partida;
import edu.pw2.partidas.model.PartidaDados;

@Controller
@RequestMapping("/partidas")

public class PartidaController{
    @GetMapping("/formulario")
    public String loadPartidaForm(){
        return "cadastrar";
    }
    @PostMapping("/cadastrar")
    public String salvarPartida(PartidaDados dados, Model model){
        Partida pa = new Partida(dados);
        model.addAttribute("partida", pa);
        return "partidas/exibir";
    }
}