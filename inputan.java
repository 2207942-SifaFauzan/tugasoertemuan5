import java.util.Scanner;

public class inputan {
    static void cekRibuan(int[] bilangan){ 
        if(bilangan[0] >= 1000 && bilangan[1] >=1000 && bilangan[2] >= 1000){
            System.out.println("semua bilangan adalah ribuan");
        } else if (bilangan[0] >= 1000 || bilangan[1] >= 1000 || bilangan[2] >= 1000){
            System.out.println("Sebagian bilangan merupakan ribuan");
        } else {
            System.out.println("bilangan bukan merupakan ribuan");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] angka = new int[3];
        int i, n = 3;
        for(i = 0; i < n; i++){
            System.out.print("Masukan bilangan ke-"+(i+1)+": ");
            angka[i] = scanner.nextInt();
        }
        
        cekRibuan(angka);
        
}
}
