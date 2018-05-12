package com.codehub.spring.lombokdemo;

import com.codehub.spring.lombokdemo.lombok.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LombokDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        example8();
    }

    public static void example1 () {
        LombokExample ex1 = new LombokExample(10,"test",false);
        System.out.println(ex1.getSentence());
    }

    public static void example2 () {
        LombokExample2 ex2 = new LombokExample2(10,"test",false);
        ex2.setValue(true);
        System.out.println(ex2.getSentence());
    }

    public static void example3 () {

        //AllArgsConstructor
        LombokExample3 ex2 = new LombokExample3("sen",true,"as");

        //RequiredArgsConstructor
        LombokExample3 ex3 = new LombokExample3("sen");
    }

    public static void example4 () {
        //AllArgsConstructor
        LombokExample4 ex1 = new LombokExample4("sen",true,"as");
        System.out.println(ex1); //LombokExample4(sentence=sen, isValue=true)

        //AllArgsConstructor
        LombokExample4 ex2 = new LombokExample4("sen",true,"as");

        System.out.println(ex1.equals(ex2)); //true

        //NoArgsConstructor
        LombokExample4 ex3 = new LombokExample4();
        System.out.println(ex3);
    }

    public static void example5 () {
        //Builder
        LombokExample5 ex1 = LombokExample5.builder().isValue(true).sentence("asdf").val("asd").build();

        System.out.println(ex1.equals(ex1));
    }

    public static void example8 () {
        //Now if you run this example you will be able to see logs
        LombokExample8 ex1 = new LombokExample8();
        ex1.tryit();
    }

}
