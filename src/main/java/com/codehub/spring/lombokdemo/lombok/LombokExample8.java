package com.codehub.spring.lombokdemo.lombok;

import lombok.extern.slf4j.Slf4j;

/*
@Slf4j, will create a log instance
*/

@Slf4j
public class LombokExample8 {
    public void tryit () {
        log.info("info logs testing for lombok");
        log.warn("info logs testing for lombok");
        log.error("info logs testing for lombok");
    }
}
