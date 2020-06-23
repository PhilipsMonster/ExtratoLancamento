package extratolacamento.controller;

import extratolacamento.domain.Extrato;
import extratolacamento.service.ExtratoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class extratoController {

    @Autowired
    private ExtratoService service;

    @GetMapping(value = "/extrato", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Extrato> get() throws IOException, ParseException {
        return service.getExtrato();
    }

}
