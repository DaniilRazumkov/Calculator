import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {


    double numA;
    double numB;
    String symbol;



    Calculator() {
        this.numA = numberGet();
        this.numB = numberGet();
        this.symbol = symbolGet();
           }

    public double getRezult() {
        System.out.println("Start calculation");
        return switch (symbol) {
            case "*" -> numA * numB;
            case "/" -> numA / numB;
            case "+" -> numA + numB;
            case "-" -> numA - numB;
            default -> numA + numB;
        };
    }

    private  double numberGet() {
        Scanner go = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        return go.nextDouble();
    }

    private String symbolGet() {
        Scanner go = new Scanner(System.in);
        System.out.print("Введите арифметическую операцию (*,/,+,-): ");
        return go.next();
    }
}
