package com.example.demo.feing.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class DtoTestBuildList {

    @Builder.Default
    List<EnderecoResponse> endereco = new ArrayList<>();
}
