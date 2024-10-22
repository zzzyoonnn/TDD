package sample;

public class Calculator {
    public long calculate(long num1, String operator, long num2) {
        // Java 12 도입(switch에 람다 도입)
        long answer = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new RuntimeException();
        };
        return answer;
    }
}