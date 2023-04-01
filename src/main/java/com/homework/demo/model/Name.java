package com.homework.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name {
    private String firstName;
    private String lastName;
    private String fullName;

    public String toString(){
        return "fullName" + ": " + this.fullName; 
    }
}
