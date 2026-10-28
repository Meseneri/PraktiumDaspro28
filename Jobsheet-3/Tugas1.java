import java.util.Scanner;

public class Tugas1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop;
        double uangMuka;
        int lamaCicilan;
        double bunga = 0.02; 
        double sisaHarga;
        double bungaPerBulan;
        double cicilanPokok;
        double cicilanPerBulan;

        System.out.print("Masukkan harga laptop: ");
        hargaLaptop = sc.nextDouble();
        System.out.print("Masukkan uang muka: ");
        uangMuka = sc.nextDouble();
        System.out.print("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bungaPerBulan = bunga * sisaHarga;
        cicilanPokok = sisaHarga / lamaCicilan;
        cicilanPerBulan = cicilanPokok + bungaPerBulan;

        System.out.println("Sisa harga setelah uang muka: Rp. " + sisaHarga);
        System.out.println("Bunga per bulan: Rp. " + bungaPerBulan);
        System.out.println("Cicilan yang harus dibayar Rina setiap bulan: Rp. " + cicilanPerBulan);
    }
}