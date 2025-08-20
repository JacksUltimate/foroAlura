package com.aluracursos.foro.domain.topico;

public record DatosActualizarTopico(
    Long id,
    String titulo,
    String mensaje,
    String curso
) {}