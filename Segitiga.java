import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        if (N >= 1 && N <= 1000) {
            cetakSegitiga(N);
        } else {
            System.out.println("Input tidak valid");
        }
    }

    public static void cetakSegitiga(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
