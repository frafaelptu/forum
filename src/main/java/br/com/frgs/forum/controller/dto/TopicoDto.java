package br.com.frgs.forum.controller.dto;

import br.com.frgs.forum.model.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.mensagem = topico.getMensagem();
        this.titulo = topico.getTitulo();
        this.dataCriacao = topico.getDataCriacao();

    }

    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map((Topico topico) -> new TopicoDto(topico).collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
