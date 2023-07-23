package calculator;

import java.util.Scanner;

public class CalculatorInput {
    // Encapsulation
    //atribut
    private double bil1;
    private double bil2;
    private double hasil;
    private char operator;

    // Accessor
    public double getHasil() {
        return hasil;
    }
    
    //mutator
    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

  
    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    // Constructor
    public CalculatorInput() {
        readInput();
    }

    private void readInput() {
        //objek
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        bil1 = scanner.nextDouble();
        
        //seleksi
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan operasi (1, 2, 3, 4) atau 't' untuk keluar: ");

        operator = scanner.next().charAt(0);
        
        //perulangan1
        if (operator == 't' || operator == 'T') {
            return;
        }

        System.out.print("Masukkan angka kedua: ");
        bil2 = scanner.nextDouble();
    }
}
