public class StudiKasus1 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        double tunjanganPerAnak = 100000;
        int jumlahAnak = 4;
        double persenPensiun = 0.10;

        double totalTunjangan = tunjanganPerAnak * jumlahAnak;
        double potonganPensiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Total tunjangan anak: " + totalTunjangan);
        System.out.println("Potongan dana pensiun: " + potonganPensiun);
        System.out.println("Gaji bersih Pak Danur: " + gajiBersih);
    }
}
