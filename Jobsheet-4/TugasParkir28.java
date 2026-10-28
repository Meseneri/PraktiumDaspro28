import java.util.Scanner;

public class TugasParkir28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = sc.nextInt();

        int tarifDasar = 2000;
        int tarifTambahan = 1000;
        int totalBiaya;

        if (lamaParkir <= 2) {
            totalBiaya = tarifDasar;
        } else {
            int jamLebih = lamaParkir - 2;
            totalBiaya = tarifDasar + (jamLebih * tarifTambahan);
        }

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Total biaya parkir: Rp. " + totalBiaya);
    }
}
