import java.util.Scanner;

public class StudiKasus2_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        scanner.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, Lainnya): ");
        String jenisKegiatan = scanner.nextLine();

        System.out.print("Masukkan jumlah dokumen yang diunggah: ");
        int jumlahDokumen = scanner.nextInt();

        int kekuranganDokumen = 4 - jumlahDokumen;

         if (jumlahDokumen < 4) {
            System.out.println("Dokumen tidak lengkap (kurang " + kekuranganDokumen + " dokumen). Dana penghargaan tidak diberikan.");
         } 
         else {
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.print("Masukkan status pendanaan PKM (1 untuk lolos, 0 untuk tidak lolos): ");
                int statusPendanaan = scanner.nextInt();

                  if (statusPendanaan == 1) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                  } 
                  else {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan tidak diberikan karena tidak lolos pendanaan PKM.");
                  }
            } 
         else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) 
               {
                System.out.print("Masukkan peringkat juara (1, 2, atau 3): ");
                int peringkatJuara = scanner.nextInt();

                  if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                  } 
                  else {

                    System.out.println("Status : Dokumen lengkap. Dana penghargaan tidak diberikan karena peringkat juara tidak valid.");
                  }
                }
            else  {
                  System.out.println("Status : Dokumen lengkap. Dana penghargaan tidak diberikan karena jenis kegiatan tidak memenuhi syarat.");
                  }
            }
        }
    }
}
