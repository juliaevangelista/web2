package edu.pw2.partidas.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Partida {
    private String local;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    public Partida(){}
    public Partida(String local, LocalDateTime inicio, LocalDateTime fim) {
        this.local = local;
        this.inicio = inicio;
        this.fim = fim;
    }
    public Partida(PartidaDados dados){
        this.local = dados.local();
        this.inicio = dados.inicio();
        this.fim = dados.fim();
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public LocalDateTime getInicio() {
        return inicio;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }
    public LocalDateTime getFim() {
        return fim;
    }
    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public int calcDuracao(){
        Duration duracao = Duration.between(inicio, fim);
        return (int) duracao.getSeconds();
    }
    @Override
    public String toString() {
        return "Partida [local=" + local + ", inicio=" + inicio + ", fim=" + fim + "]";
    }

    
}