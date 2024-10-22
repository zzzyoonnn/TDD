package sample;

import java.util.Scanner;

public class SampleApplication {

    public static void main(String[] args) {
        String[] parts = new CalculatorRequestReader().read();
        long num1 = Long.parseLong(parts[0]);
        long num2 = Long.parseLong(parts[2]);
        String operator = parts[1];

        long answer = new Calculator().calculate(num1, operator, num2);
        System.out.println(answer);
    }
}