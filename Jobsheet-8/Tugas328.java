import java.util.Scanner;

public class Tugas328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int jumlahBarangTerbanyak = -1;
        int nomorTokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("Jumlah barang Pelanggan " + pelanggan + " di Toko " + toko + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > jumlahBarangTerbanyak) {
                jumlahBarangTerbanyak = totalBarangToko;
                nomorTokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + nomorTokoTerbanyak);

        sc.close();    }
}
