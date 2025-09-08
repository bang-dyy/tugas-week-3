package Percabangann;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ifelse cek = new ifelse();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Status: " + cek.cekStatus(nilai));
        
        input.close();
    }
}
