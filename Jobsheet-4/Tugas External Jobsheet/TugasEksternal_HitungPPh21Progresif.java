import java.util.Scanner;

public class TugasEksternal_HitungPPh21Progresif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Penghasilan Kena Pajak (PKP): ");
        double pkp = sc.nextDouble();

        double batas1 = 60000000;
        double batas2 = 250000000;
        double batas3 = 500000000;
        double tarif1 = 0.05;
        double tarif2 = 0.15;
        double tarif3 = 0.25;
        double tarif4 = 0.30;

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= batas1) {
            pajak = tarif1 * pkp;
        } else if (pkp <= batas2) {
            pajak = (tarif1 * batas1) + tarif2 * (pkp - batas1);
        } else if (pkp <= batas3) {
            pajak = (tarif1 * batas1) + (tarif2 * (batas2 - batas1))
                    + tarif3 * (pkp - batas2);
        } else {
            pajak = (tarif1 * batas1) + (tarif2 * (batas2 - batas1))
                    + (tarif3 * (batas3 - batas2))
                    + tarif4 * (pkp - batas3);
        }

        System.out.println("Besar PPh 21 yang harus dibayar: Rp. " + pajak);
    }
}