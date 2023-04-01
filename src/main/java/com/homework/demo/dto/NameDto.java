package com.homework.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NameDto {
    private String fullName;
    
}
