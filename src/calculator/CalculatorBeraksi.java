package calculator;

//inheritance
public class CalculatorBeraksi extends CalculatorInput {

    // Constructor
    public CalculatorBeraksi() {
        super();
    }

    public void calculateResult() {
        switch (getOperator()) {
            case '1':
                setHasil(getBil1() + getBil2());
                break;
            case '2':
                setHasil(getBil1() - getBil2());
                break;
            case '3':
                setHasil(getBil1() * getBil2());
                break;
            case '4':
                if (getBil2() != 0) {
                    setHasil(getBil1() / getBil2());
                // error handling
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid.");
        }
    }

    public double getResult() {
        return getHasil();
    }
}
