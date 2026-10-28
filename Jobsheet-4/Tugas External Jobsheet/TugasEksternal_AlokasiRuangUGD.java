import java.util.Scanner;

public class TugasEksternal_AlokasiRuangUGD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan SpO2 (%): ");
        double spo2 = sc.nextDouble();

        System.out.print("Masukkan sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        double sistolik = sc.nextDouble();

        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean kondisiSadarPenuh = sc.nextBoolean();

        System.out.print("Masukkan suhu tubuh (C): ");
        double suhuTubuh = sc.nextDouble();

        System.out.print("Apakah pasien punya riwayat komorbid? (true/false): ");
        boolean riwayatKomorbid = sc.nextBoolean();

        System.out.print("Masukkan usia pasien: ");
        int usia = sc.nextInt();

        System.out.print("Masukkan laju napas (x/menit): ");
        double lajuNapas = sc.nextDouble();

        String lokasi;

        if (spo2 < 85) {
            if (sisaBedICU > 0) {
                lokasi = "ICU";
            } else {
                lokasi = "UGD_VENTILATOR_MOBIL";
            }
        } else if ((spo2 >= 85 && spo2 <= 89)
                || (sistolik < 90 || sistolik > 180)
                || (!kondisiSadarPenuh)) {
            lokasi = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || suhuTubuh > 39)
                && riwayatKomorbid
                && usia >= 65) {
            lokasi = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            lokasi = "RAWAT_INAP_UMUM";
        } else {
            lokasi = "RAWAT_JALAN";
        }

        System.out.println("Lokasi perawatan: " + lokasi);
    }
}