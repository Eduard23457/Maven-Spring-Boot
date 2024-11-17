package ru.skypro.first_spring_application.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.skypro.first_spring_application.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public CalculatorServiceImpl() {
    }

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

        }
            return "Оба аргумента обязательны";
        }


    @GetMapping("minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {

        }
            return "Оба аргумента обязательны";
        }
    @GetMapping("multiply")
    public String multiply( @RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {

        }
            return "Оба аргумента обязательны";
        }
    @GetMapping("divide")
    public String divide( @RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {

        }
            return "Оба аргумента обязательны";
        }
    }
