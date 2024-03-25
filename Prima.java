import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        if (batasAwal >= 1 && batasAkhir <= 100) {
            System.out.println("Bilangan prima antara " + batasAwal + " dan " + batasAkhir + " adalah:");
            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (cekPrima(i))
                    System.out.print(i + " ");
            }
        } else {
            System.out.print("Inputan tidak valid");
        }
        System.out.println();
    }

    public static boolean cekPrima(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
