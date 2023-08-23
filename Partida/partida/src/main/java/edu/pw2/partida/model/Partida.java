package edu.pw2.partida.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Partida {
    private String local;
    private LocalDateTime dataHoraInicio = LocalDateTime.of(2019, 10, 10, 10, 10, 10);
    private LocalDateTime dataHoraFim = LocalDateTime.of(2019, 10, 10, 7, 10, 10);
    private Duration duracao = Duration.between(dataHoraInicio, dataHoraFim);
    private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public Partida(String local, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Duration duracao, long horas,
            long minutos, DateTimeFormatter formatador) {
        this.local = local;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.duracao = duracao;
        this.horas = horas;
        this.minutos = minutos;
        this.formatador = formatador;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }
    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }
    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }
    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
    public Duration getDuracao() {
        return duracao;
    }
    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }
    public long getHoras() {
        return horas;
    }
    public void setHoras(long horas) {
        this.horas = horas;
    }
    public long getMinutos() {
        return minutos;
    }
    public void setMinutos(long minutos) {
        this.minutos = minutos;
    }
    public DateTimeFormatter getFormatador() {
        return formatador;
    }
    public void setFormatador(DateTimeFormatter formatador) {
        this.formatador = formatador;
    }


}
