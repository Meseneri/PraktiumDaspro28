import java.util.Scanner;

public class Rectangle28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah baris: ");
        int bari = sc.nextInt();
        System.out.print("Masukan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int j = 1; j <= kolom; j++) {
            for (int i = 1; i <= bari; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
