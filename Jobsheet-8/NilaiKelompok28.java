import java.util.Scanner;

public class NilaiKelompok28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nomorKelompok = 1;
        double rataTertinggi = -1;
        int kelompokTerbaik = 0;

        System.out.print("Masukan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus lebih dari 0.");
        } else {
            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;
                 for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Masukan nilai penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus antara 0 dan 100. Ulangi input.");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": Nilai rata rata = " + rataNilai);
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
            System.out.println("================================");
            System.out.println("Kelompok terbaik: " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi: " + rataTertinggi);
        }
        sc.close();
    }
}