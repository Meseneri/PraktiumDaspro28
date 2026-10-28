import java.util.Scanner;

public class ModifikasiStudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gajiPokok, tunjanganPerAnak, persenPensiun = 0.10;
        int jumlahAnak;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextDouble();
        System.out.print("Masukkan tunjangan anak per bulan: ");
        tunjanganPerAnak = sc.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        double totalTunjangan = tunjanganPerAnak * jumlahAnak;
        double potonganPensiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Total tunjangan anak: " + totalTunjangan);
        System.out.println("Potongan dana pensiun: " + potonganPensiun);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}