package com.example.demo.feing.Controller;

import com.example.demo.feing.Feing.EnderecoFeign;
import com.example.demo.feing.Feing.ChuckNorisFeign;
import com.example.demo.feing.dto.DtoTestBuildList;
import com.example.demo.feing.dto.EnderecoResponse;
import com.example.demo.feing.dto.ResponseAll;
import com.example.demo.feing.dto.ChuckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("endereco")
public class OrchestratorController {

    @Autowired
    EnderecoFeign test;
    @Autowired
    ChuckNorisFeign test1;

    @GetMapping("/{cep}")
    public ResponseAll retornaEndereco(@PathVariable String cep){
        ChuckResponse response = test1.retornaChuck();
        EnderecoResponse endResponse = test.retornaEnderecoResponse(cep);

        ResponseAll all = ResponseAll.builder()
                .img(response.getIcon_url())
                .bairro(endResponse.getBairro())
                .logradouro(endResponse.getLogradouro())
                .value(response.getValue())
                .build();

        return all;
    }
}
