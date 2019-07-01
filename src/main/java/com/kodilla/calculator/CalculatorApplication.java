package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.substract(5,7));
        System.exit(0);
    }

}
