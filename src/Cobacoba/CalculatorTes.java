package Cobacoba;

import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;
    private char operator;

    // Constructor
    public Calculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // Method untuk melakukan perhitungan
    public double calculateResult() {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid.");
        }
        return result;
    }
}

public class CalculatorTes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2, operator);
        double result = calculator.calculateResult();
        System.out.println("Hasil: " + result);

        scanner.close();
    }
}
