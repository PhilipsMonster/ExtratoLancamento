package extratolacamento.service;

import extratolacamento.domain.Extrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Service
public class ExtratoService {


    public List<Extrato> getExtrato() throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(".\\resources\\jsonfiles\\lancamento.json");
        Object obj = jsonparser.parse(reader);
        JSONObject empjsonobj = (JSONObject)obj;

        String quantidadeLancamentos = (String)empjsonobj.get("quantidadeLancamentos");
        String quantidadeRemessas = (String)empjsonobj.get("quantidadeRemessas");


        ArrayList<Extrato> extratos = new ArrayList<>();
        extratos.add(new Extrato(1L, quantidadeLancamentos));
        extratos.add(new Extrato(2L, quantidadeRemessas));

        return extratos;
    }
}
