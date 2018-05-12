package com.codehub.spring.lombokdemo.lombok;

/*
val, it can be used replacing any Class name, good replacement for Huge classnames
*/

import lombok.val;

public class LombokExample7 {
    public void tryit () {
        LombokExample6 example6 = new LombokExample6();
        val expected = new LombokExample6();
    }
}
