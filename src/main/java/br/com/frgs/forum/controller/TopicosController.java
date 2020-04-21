package br.com.frgs.forum.controller;

import br.com.frgs.forum.controller.dto.TopicoDto;
import br.com.frgs.forum.model.Curso;
import br.com.frgs.forum.model.Topico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "Dúvidas com Spring", new Curso("Spring", "Progranação"));
        //List<Topico> lista = new ArrayList<Topico>();
        //lista.add(topico);
        //return lista;
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}

