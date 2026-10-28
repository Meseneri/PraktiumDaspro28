import java.util.Scanner;

public class Tugas2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        int biayaCetak;
        int totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen: ");
        jumlahLembar = sc.nextInt();

        biayaCetak = jumlahLembar * biayaPerLembar;
        totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Biaya cetak: Rp. " + biayaCetak);
        System.out.println("Biaya penjilidan: Rp. " + biayaJilid);
        System.out.println("Total biaya yang harus dibayar: Rp. " + totalBiaya);
    }
}