package edu.web2.myrequests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {
    @GetMapping
    @ResponseBody
    public String requestIMC(Double peso, Double altura){
        
        Double imc = peso/(altura*altura);
        String mensagem;
        if(imc<18.5){
            mensagem = "Baixo peso";
        } else if (imc>18.5 && imc<24.99){
            mensagem = "Normal";
        } else if (imc>25 && imc<29.99){
            mensagem = "Sobrepeso";
        } else {
            mensagem = "Obesidade";
        }
        return "IMC = "+imc+"<br> E está classificado como: "+mensagem;
    }
}
