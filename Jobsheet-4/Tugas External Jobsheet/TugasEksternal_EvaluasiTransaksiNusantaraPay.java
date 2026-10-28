import java.util.Scanner;

public class TugasEksternal_EvaluasiTransaksiNusantaraPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan status akun (NORMAL/SUSPICIOUS/BLACK-LISTED): ");
        String statusAkun = sc.nextLine().trim();

        System.out.print("Masukkan nominal transaksi: ");
        double nominal = sc.nextDouble();

        System.out.print("Masukkan sisa saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Apakah transaksi dari luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();

        System.out.print("Masukkan jam transaksi (0-23): ");
        int jamTransaksi = sc.nextInt();

        double limitHarian = 10000;
        String status;

        if (statusAkun.equalsIgnoreCase("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominal > saldo) {
            status = "REJECTED_SALDO";
        } else if (nominal > limitHarian) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominal > 2000) {
            status = "FLAGGED_FRAUD";
        } else if ((jamTransaksi >= 0 && jamTransaksi < 4) && nominal > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equalsIgnoreCase("SUSPICIOUS") && nominal > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }

        System.out.println("Status transaksi: " + status);
    }
}