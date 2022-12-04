package com.example.demo.feing.Feing;

import com.example.demo.feing.dto.ChuckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "chuckNoris", url = "https://api.chucknorris.io/jokes/random")
public interface ChuckNorisFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    ChuckResponse retornaChuck();
}
