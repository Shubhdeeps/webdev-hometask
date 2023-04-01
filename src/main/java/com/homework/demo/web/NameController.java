package com.homework.demo.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homework.demo.dto.NameDto;
import com.homework.demo.model.Name;

@RestController
public class NameController {

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/name")
    public ResponseEntity<NameDto> createFullName(@RequestBody Name name) {
        String fullName = name.getFirstName().concat(" ").concat(name.getLastName());
        name.setFullName(fullName);
        // Setting only required fields
        NameDto fullName1 = new NameDto();
        fullName1.setFullName(fullName);

        return new ResponseEntity<>(fullName1, HttpStatus.OK);
    }
}