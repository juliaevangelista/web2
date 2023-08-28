package edu.pw2.partidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pw2.partidas.model.Partida;
import edu.pw2.partidas.model.PartidaDados;

@Controller
@RequestMapping("/partidas")

public class PartidaController{
    @GetMapping
    public String loadPartidaForm(){
        return "partida/cadastro";
    }
    @PostMapping
    public String salvarPartida(PartidaDados dados, Model model){
        Partida partida = new Partida(dados);
        long duracaoEmMinutos = partida.calcDuracao();
        model.addAttribute("partida", partida);
        model.addAttribute("duraçãoEmMinutos",duracaoEmMinutos);
        return "partida/exibir";
    }
}