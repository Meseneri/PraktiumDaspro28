import java.util.Scanner;

public class StudiKasus1_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargapercup = 18000;
        int jumlahcup, uangbayar, totalharga, kembalian, kurang;

        System.out.print("Masukkan jumlah cup\t: ");
        jumlahcup = scanner.nextInt();
        System.out.print("Masukkan uang bayar\t: ");
        uangbayar = scanner.nextInt();
        
        totalharga = hargapercup * jumlahcup;

        if (totalharga >= 100000) {
            totalharga = totalharga - (totalharga * 10 / 100);
            System.out.println("Diskon\t\t\t: Rp " + (totalharga * 10 / 100));
        }

        kembalian = uangbayar - totalharga;
        kurang = totalharga - uangbayar;

        if (uangbayar >= totalharga) {
            System.out.println("Total harga\t\t: Rp " + totalharga);
            System.out.println("Kembalian\t\t: Rp " + kembalian);
        } 
        else {
            System.out.println("Total harga\t\t: Rp " + totalharga);
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}
