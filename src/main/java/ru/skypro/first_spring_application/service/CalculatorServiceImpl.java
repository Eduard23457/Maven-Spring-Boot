package ru.skypro.first_spring_application.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.skypro.first_spring_application.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }


    @GetMapping("plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }

        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }


    @GetMapping("minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }

        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("multiply")
    public String multiply( @RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }

        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("divide")
    public String divide( @RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }
        if (num2 == 0) {
            return "Второе число не должно равняться нулю!";

        }

        int result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;



    }
    }


