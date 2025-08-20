package com.aluracursos.foro.domain.topico;

public record DatosRegistroTopico(
    String titulo,
    String mensaje,
    Long autorId,
    String curso
) {}