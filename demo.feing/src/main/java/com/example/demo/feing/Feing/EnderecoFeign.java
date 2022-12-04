package com.example.demo.feing.Feing;

import com.example.demo.feing.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "endereco", url = "https://viacep.com.br/ws/")
public interface EnderecoFeign {

    @RequestMapping(method = GET, value = "/{cep}/json/")
    EnderecoResponse retornaEnderecoResponse(@PathVariable String cep);
}
