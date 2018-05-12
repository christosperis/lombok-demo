package com.codehub.spring.lombokdemo.lombok;

/*
More detail getters and setters
When you dont want getters and setters for all fields
and also maybe control access modifiers
*/

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class LombokExample2 {

    @Getter
    private final String sentence;

    @Getter
    @Setter
    private boolean isValue;

    //you can control access level of each getter and setters
    @Setter(AccessLevel.PROTECTED)
    private String val;

    private Map<String,String> mapString;
    private final int someVal;

    public LombokExample2(int someVal, String sentence, boolean isValue) {
        this.someVal = someVal;
        this.sentence = sentence;
        this.isValue = isValue;
    }

}
