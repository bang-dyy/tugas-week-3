package perulangann;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cetak brapa kali? ");
        int n = input.nextInt();

        // Membuat objek dari class Ulang
        looping u = new looping();
        u.cetakHalo(n); // Panggil method dari class Ulang

        input.close();
    }
}