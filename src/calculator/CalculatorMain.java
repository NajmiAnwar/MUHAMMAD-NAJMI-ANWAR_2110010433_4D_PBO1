package calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char pilihan;
        
        //perulangan2
        do {
            CalculatorBeraksi calculator = new CalculatorBeraksi();
            calculator.calculateResult();
            double result = calculator.getResult();

            CalculatorOutput calculatorOutput = new CalculatorOutput();
            calculatorOutput.displayResult(result);

            System.out.print("Apakah Anda ingin melakukan kalkulasi lagi? (y/n): ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}
