package com.example.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class CafeBasicInfoDto {
    private String cafeName;
    private String address;
    private String phone;
    private List<String> hashtag;
    private String businessStatus;
    private Map<String, String> businessHour = new HashMap<>();
}