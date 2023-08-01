# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penghitung dua bilangan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa bilangan/angka, dan metode perhitungan, dan memberikan output berupa hasil dari perhitungan dua bilangan tersebut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `CalculatorBeraksi`, `CalculatorInput`, `CalculatorMain`,  dan `CalculatorOutput` adalah contoh dari class.

```bash
public class CalculatorInput {
    ...
}

public class CalculatorBeraksi extends CalculatorInput {
    ...
}

public class CalculatorMain {
    ...
}

public class CalculatorOutput {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` Scanner scanner = new Scanner(System.in);` adalah contoh pembuatan object.

```bash
 Scanner scanner = new Scanner(System.in);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `bil1`, `bil2`, `hasil` dan `operator` adalah contoh atribut.

```bash
    double bil1;
    double bil2;
    double hasil;
    char operator;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `CalculatorInput` dan `CalculatorBeraksi`.

```bash
public CalculatorInput() {
        readInput();
}

public CalculatorBeraksi() {
        super();
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBil1`, `setBil2`, `setHasil` dan `setOperator` adalah contoh method mutator.

```bash
public void setHasil(double hasil) {
        this.hasil = hasil;
    }

public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

public void setOperator(char operator) {
        this.operator = operator;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getBil1`, `getBil2`, `getHasil` dan `getOperator` adalah contoh method accessor.

```bash
 public double getHasil() {
        return hasil;
    }

public double getBil1() {
        return bil1;
    }

public double getBil2() {
        return bil2;
    }

public char getOperator() {
        return operator;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `bil1`, `bil2`, `hasil` dan `operator` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private double bil1;
    private double bil2;
    private double hasil;
    private char operator;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `CalculatorBeraksi` mewarisi `CalculatorInput` dengan sintaks `extends`.

```bash
public class CalculatorBeraksi extends CalculatorInput {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayResult(double hasil)` di `CalculatorOutput` merupakan overloading method `displayResult` merupakan override dari method dan `displayResult` di `CalculatorBeraksi`.

```bash
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
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dan `if else` dalam method `getOperator`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do while` untuk meminta input dan menampilkan data.

```bash
 do {
            CalculatorBeraksi calculator = new CalculatorBeraksi();
            calculator.calculateResult();
            double result = calculator.getResult();

            CalculatorOutput calculatorOutput = new CalculatorOutput();
            calculatorOutput.displayResult(result);

            System.out.print("Apakah Anda ingin melakukan kalkulasi lagi? (y/n): ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'y' || pilihan == 'Y');
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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

        if (operator == 't' || operator == 'T') {
            return;
        }

        System.out.print("Masukkan angka kedua: ");
        bil2 = scanner.nextDouble();


        //output
        public void displayResult(double hasil) {
        System.out.println("============================");
        System.out.println("Hasil Perhitungan : " + hasil);
        System.out.println("============================");
    }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `-` adalah contoh penggunaan array.

```bash
Tidak menggunakan Array
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `if else` untuk menangani error.

```bash
 if (getBil2() != 0) {
  setHasil(getBil1() / getBil2());

  } else {
  System.out.println("Tidak dapat melakukan pembagian dengan nol.");
  }
  break;
default:
  System.out.println("Operator yang dimasukkan tidak valid.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   0     |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **85**  |

## Pembuat

Nama: MUHAMMAD NAJMI ANWAR
NPM: 2110010433
