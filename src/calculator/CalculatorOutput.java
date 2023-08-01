package calculator;

public class CalculatorOutput {
    // Polymorphism
    public void displayResult(double hasil) {
        System.out.println("============================");
        System.out.println("Hasil Perhitungan : " + hasil);
        System.out.println("============================");
    }
    
    // Overloading tanpa parameters
    public void displayResult() {
        System.out.println("============================");
        System.out.println("Hasil Perhitungan : ");
        System.out.println("============================");
    }
}