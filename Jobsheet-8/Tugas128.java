import java.util.Scanner;

public class Tugas128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("total angka tercetak = " + ((n * (n + 1)) / 2));
        sc.close();
    }
    
}
