package sample;

import java.util.Scanner;

public class CalculatorRequestReader {
    public String[] read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator(e.g 1 + 2)");
        String result = scanner.nextLine();
        return result.split(" ");
    }
}
