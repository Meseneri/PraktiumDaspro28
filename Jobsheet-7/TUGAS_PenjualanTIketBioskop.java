///Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program harus menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari dengan ketentuan sebagai berikut:• Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon 10%. • Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon 15%. • Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input tersebut dan meminta input ulang. Catatan: Perulangan dapat menggunakan for, while, atau do-while. Penambahan break atau continue jika diperlukan
import java.util.Scanner;

public class TUGAS_PenjualanTIketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaTiket = 50000;
        int totaltiket = 0, jumlahTiket, totalHargaSelama1Hari = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik -1 untuk keluar): ");
            jumlahTiket = scanner.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah tiket yang valid.");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }

            totaltiket += jumlahTiket;
            totalHargaSelama1Hari += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + (int)totalHarga);
        }

        System.out.println("Total tiket yang terjual: " + totaltiket);
        System.out.println("Total harga penjualan tiket selama satu hari: Rp " + totalHargaSelama1Hari);
    }
}
