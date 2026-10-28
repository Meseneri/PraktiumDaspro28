import java.util.Scanner;   

public class KafeDoWhile28 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    int kopi, teh, roti;
    String namaPelanggan;
    double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;


        do { 
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' untuk keluar ): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah kopi: ");
            kopi = scanner.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = scanner.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = scanner.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + (int)totalHarga);
            scanner.nextLine();
        } while (true);
    }
    
}
