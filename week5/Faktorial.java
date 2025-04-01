package week5;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        
        int hasil = 1;
        
        for (int i = n; i > 0; i--) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);

        scanner.close();
    }
}


