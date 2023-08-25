package edu.pw2.partidas.model;

import java.time.LocalDateTime;

public record PartidaDados(String local, LocalDateTime inicio, LocalDateTime fim){}