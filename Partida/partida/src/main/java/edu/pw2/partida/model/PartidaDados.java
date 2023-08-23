package edu.pw2.partida.model;

import java.time.Duration;

public record PartidaDados(String local, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Duration duracao) {}
