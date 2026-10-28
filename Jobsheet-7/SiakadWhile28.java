import java.util.Scanner;

public class SiakadWhile28 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nilai, jml, i = 0;

    System.out.print("Masukkan jumlah mahasiswa: ");
    jml = scanner.nextInt();
    while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai = scanner.nextInt();
        
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
            continue;
        }

        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
        } else if (nilai > 65 && nilai <= 73) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
        } else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
        } else if (nilai >= 50 && nilai <= 60) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
        } else if (nilai >= 39 && nilai < 50) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
        } else {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
        }
        i++;
        }
    }
}
