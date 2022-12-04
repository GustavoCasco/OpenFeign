package com.example.demo.feing.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChuckResponse {

    private String icon_url;
    private String id;
    private String url;
    private String value;
}
