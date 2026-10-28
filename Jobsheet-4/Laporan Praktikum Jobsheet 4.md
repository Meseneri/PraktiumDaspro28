# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**
* **Nama:** Syauqi Khosyi Damar Agandi
* **NIM:** 264107020033
* **Kelas / No. Presensi:** TI-1D / 28

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan sederhana.
2. Mahasiswa mampu menerapkan sintaks pemilihan sederhana ke dalam program Java.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

Pada awal semester, mahasiswa wajib mencetak KRS untuk ditandatangani Dosen Pembina Akademik. SIAKAD memeriksa status pembayaran UKT, dan jika sudah lunas maka KRS dapat dicetak. Program menerima masukan bertipe `boolean` pada variabel `uktLunas`, lalu memeriksanya dengan struktur `if` dan `if-else`.

#### 2.1.1 Kode Program Java
```java
import java.util.Scanner;

public class PemilihanIf28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}

```

#### 2.1.2 Hasil Running / Output

Input `true`:
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): true
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

Input `false` (setelah ditambahkan blok `else`):
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): false
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu
```

#### 2.1.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Nilai apa yang harus dimasukkan agar kedua baris di dalam blok IF ikut tercetak? Jelaskan mengapa hanya nilai tersebut yang diterima!
  * **Jawab:** Nilai yang harus dimasukkan adalah `true`. Kondisi pada `if` harus berupa ekspresi bertipe `boolean`, dan blok `if` hanya dieksekusi bila kondisinya bernilai `true`. Variabel `uktLunas` bertipe `boolean` sehingga hanya bisa bernilai `true` atau `false`. Karena hanya `true` yang membuat kondisi terpenuhi, kedua baris di dalam blok `if` (kedua `System.out.println`) tercetak bersamaan hanya pada nilai tersebut.
* **Pertanyaan 2:** Jalankan program, lalu masukkan `false`. Baris mana saja yang tercetak dan baris mana yang tidak? Jelaskan alur eksekusinya ketika kondisi IF bernilai false!
  * **Jawab:** Pada versi awal (hanya `if` tanpa `else`), yang tercetak hanya `--- Cetak KRS SIAKAD ---` dan pertanyaan `Apakah UKT sudah lunas? (true/false):` beserta input `false`. Baris `Pembayaran UKT terverifikasi` dan `Silakan cetak KRS dan minta tanda tangan DPA` tidak tercetak. Alurnya: program membaca `false`, kondisi `if (uktLunas)` dievaluasi bernilai `false`, sehingga seluruh blok `if` dilewati, lalu program lanjut ke baris sesudah blok. Karena tidak ada perintah lain, program langsung selesai tanpa pesan apa pun.
* **Pertanyaan 3:** Jalankan program, lalu masukkan `TRUE` (huruf kapital) dan `ya`. Apa yang terjadi pada masing-masing input? Jika program berhenti dengan error, jelaskan penyebabnya!
  * **Jawab:**
    * Input `TRUE`: diterima dan dianggap `true`, sehingga kedua baris di dalam blok `if` tercetak. Hal ini karena `Scanner.nextBoolean()` tidak membedakan huruf besar dan kecil.
    * Input `ya`: program berhenti dengan error `Exception in thread "main" java.util.InputMismatchException`. Penyebabnya, `nextBoolean()` hanya mengenali token `true` atau `false`, sedangkan `ya` bukan nilai boolean yang valid sehingga tidak dapat dikonversi.
* **Pertanyaan 4:** Modifikasi program dengan menambahkan struktur ELSE, lalu tunjukkan hasil run untuk input `true` dan `false`!
  * **Jawab:** Blok `else { System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"); }` ditambahkan setelah blok `if` seperti pada kode di 2.1.1. Hasil run untuk input `true` dan `false` sudah ditampilkan pada bagian 2.1.2.

---

### 2.2 Percobaan 2: SWITCH-CASE untuk Mencetak KRS

Sistem SIAKAD memeriksa semester mahasiswa saat ini, lalu menampilkan KRS semester tersebut. Nilai semester disimpan pada variabel `semester` bertipe `int` dan diperiksa dengan `switch-case`.

#### 2.2.1 Kode Program Java (SWITCH-CASE)
```java
import java.util.Scanner;

public class PemilihanSwitch28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS Semester 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 ditampilkan");
                break;
            default:
                System.out.println("Semester tidak valid");
        }
    }
}

```

#### 2.2.2 Tabel Pengujian Parameter Output

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `5` | "KRS Semester 5 ditampilkan" | Valid |
| 2 | `1` | "KRS Semester 1 ditampilkan" | Valid |
| 3 | `10` | "Semester tidak valid" | Invalid |
| 4 | `0` | "Semester tidak valid" | Invalid |
| 5 | `5` (tanpa `break` pada case 5) | KRS Semester 5, 6, 7, 8 ditampilkan, lalu "Semester tidak valid" | Fall-through |

Contoh output:
```text
--- Cetak KRS SIAKAD ---
Masukkan semester saat ini: 5
KRS Semester 5 ditampilkan
```

#### 2.2.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Hapus perintah `break;` pada `case 5`, lalu jalankan dengan masukan `5`. Tuliskan keluaran yang muncul, lalu jelaskan fungsi `break`!
  * **Jawab:** Keluaran yang muncul:
    ```text
    --- Cetak KRS SIAKAD ---
    Masukkan semester saat ini: 5
    KRS Semester 5 ditampilkan
    KRS Semester 6 ditampilkan
    KRS Semester 7 ditampilkan
    KRS Semester 8 ditampilkan
    Semester tidak valid
    ```
    Tanpa `break`, eksekusi tidak berhenti di `case 5` tetapi terus berjalan ke `case` di bawahnya (fall-through) sampai bertemu `break` atau akhir `switch`, termasuk `default`. Jadi fungsi `break` adalah menghentikan eksekusi `switch` begitu satu `case` yang cocok selesai dijalankan, sehingga hanya satu pilihan yang diproses. Kode sudah dikembalikan seperti semula.
* **Pertanyaan 2:** Jalankan program dengan masukan `10`, lalu `0`. Apa keluarannya? Jelaskan peran `default` dan apa yang terjadi jika `default` dihapus!
  * **Jawab:** Pada masukan `10` maupun `0`, keluarannya sama yaitu `Semester tidak valid`. Hal ini karena tidak ada `case` yang bernilai 10 maupun 0, sehingga program menjalankan `default`. Peran `default` adalah menangani semua nilai yang tidak cocok dengan `case` mana pun (mirip `else` pada if-else). Jika `default` dihapus, masukan `10` dan `0` tidak akan menghasilkan keluaran apa pun setelah input karena tidak ada blok yang dieksekusi, dan program langsung selesai tanpa pesan.
* **Pertanyaan 3:** Ganti tipe data `semester` menjadi `double`, lalu compile. Apakah berhasil? Tuliskan pesan error dan penyebabnya. Sebutkan tipe data yang boleh digunakan pada `switch`!
  * **Jawab:** Program tidak berhasil dicompile. Pesan error dari compiler berbunyi kurang lebih `incompatible types: possible lossy conversion from double to int` (pada JDK lama), atau `selector type double is not allowed` (pada JDK 21 ke atas); bunyinya bergantung versi JDK. Penyebabnya, `switch` tidak mendukung tipe bilangan pecahan seperti `double` karena nilai pecahan tidak dapat dibandingkan secara tepat dengan konstanta `case`. Tipe data yang boleh digunakan sebagai ekspresi `switch` adalah `byte`, `short`, `char`, `int` (beserta wrapper-nya: `Byte`, `Short`, `Character`, `Integer`), `String`, dan `enum`. Tipe `long`, `float`, `double`, dan `boolean` tidak diperbolehkan.
* **Pertanyaan 4:** Ubah program ke bentuk IF - ELSE IF - ELSE dengan keluaran yang sama persis. Menurut Anda mana yang lebih mudah dibaca, dan mengapa?
  * **Jawab:** Program versi IF - ELSE IF - ELSE (file `Percobaan2elseif.java`) adalah sebagai berikut:
```java
import java.util.Scanner;

public class Percobaan2elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}
```

    Untuk kasus ini, `switch-case` lebih mudah dibaca. Alasannya, yang dicek hanya satu variabel (`semester`) terhadap beberapa nilai tetap, sehingga struktur `case 1`, `case 2`, dan seterusnya terlihat rapi dan sejajar. Pada if-else, ekspresi `semester == ...` harus diulang pada setiap cabang. Namun if-else tetap lebih unggul jika kondisinya berupa rentang nilai atau gabungan beberapa kondisi.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Mengubah struktur `if-else` menjadi *Ternary Operator*.
- [x] **Tugas 2:** Membuat program berdasarkan *Flowchart* penentuan SKS.
- [x] **Tugas 3:** Mengimplementasikan studi kasus parkir & antrean.
- [x] **Tugas Eksternal:** NusantaraPay, Alokasi Ruang UGD, dan PPh 21 Progresif.

### 3.1 Tugas 1: Ternary Operator

#### 3.1.1 Kode Program
```java
import java.util.Scanner;

public class Tugas1Pemilihan28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
                ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
}
```

#### 3.1.2 Hasil Running / Output
Input `true`:
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): true
Pembayaran UKT terverifikasi
Silakan cetak KRS dan minta tanda tangan DPA
```

Input `false`:
```text
--- Cetak KRS SIAKAD ---
Apakah UKT sudah lunas? (true/false): false
Registrasi ditolak. Silakan lunasi UKT terlebih dahulu
```

#### 3.1.3 Jawaban Pertanyaan
* **Pertanyaan:** Kapan Ternary Operator lebih baik digunakan dibanding IF-ELSE, dan kapan sebaiknya tidak?
  * **Jawab:** Ternary Operator lebih baik digunakan ketika hanya ada dua kemungkinan nilai yang akan ditampung ke sebuah variabel dan kondisinya sederhana, karena kodenya lebih ringkas dalam satu baris (seperti pada variabel `pesan`). Sebaiknya tidak digunakan ketika kondisinya rumit, bersarang (nested), atau tiap cabang perlu menjalankan banyak perintah, karena kode menjadi sulit dibaca dan dirawat. Dalam kondisi tersebut IF-ELSE lebih jelas.

### 3.2 Tugas 2: Validasi SKS (Flowchart)

#### 3.2.1 Kode Program
```java
import java.util.Scanner;

public class Tugas2Pemilihan28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah SKS: ");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}

```

#### 3.2.2 Hasil Running / Output
```text
Masukkan jumlah SKS: 26
Melebihi batas
```
```text
Masukkan jumlah SKS: 20
KRS valid
```

### 3.3 Tugas 3: Studi Kasus Parkir dan Antrean

#### 3.3.1 Soal 1: Sistem Parkir (IF-ELSE)
Tarif dasar Rp. 2000 untuk 2 jam pertama, ditambah Rp. 1000 untuk setiap jam berikutnya.
```java
import java.util.Scanner;

public class TugasParkir28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = sc.nextInt();

        int tarifDasar = 2000;
        int tarifTambahan = 1000;
        int totalBiaya;

        if (lamaParkir <= 2) {
            totalBiaya = tarifDasar;
        } else {
            int jamLebih = lamaParkir - 2;
            totalBiaya = tarifDasar + (jamLebih * tarifTambahan);
        }

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Total biaya parkir: Rp. " + totalBiaya);
    }
}

```

Hasil running:
```text
Masukkan lama parkir (jam): 1
Lama parkir: 1 jam
Total biaya parkir: Rp. 2000
```
```text
Masukkan lama parkir (jam): 5
Lama parkir: 5 jam
Total biaya parkir: Rp. 5000
```

#### 3.3.2 Soal 2: Mesin Antrean Akademik (SWITCH-CASE)
```java
import java.util.Scanner;

public class TugasAntrean28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan: ");
        int kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah");
                System.out.println("Silakan menuju Loket A");
                break;
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                System.out.println("Silakan menuju Loket B");
                break;
            case 3:
                System.out.println("Layanan: Pembayaran UKT");
                System.out.println("Silakan menuju Loket C");
                break;
            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik");
                System.out.println("Silakan menuju Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}
```

Hasil running:
```text
Masukkan kode layanan: 3
Layanan: Pembayaran UKT
Silakan menuju Loket C
```
```text
Masukkan kode layanan: 7
Kode layanan tidak tersedia
```

### 3.4 Tugas Eksternal 1: Evaluasi Transaksi NusantaraPay

Program mengevaluasi transaksi berdasarkan status akun, nominal, saldo, asal transaksi, dan jam transaksi. Kondisi diperiksa berurutan dari prioritas tertinggi (blacklist, saldo, limit, fraud, OTP malam, OTP akun mencurigakan), dan yang pertama terpenuhi menentukan status.

#### 3.4.1 Kode Program
```java
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
```

#### 3.4.2 Hasil Pengujian

| No | Status Akun | Nominal | Saldo | Luar Negeri | Jam | Status Transaksi |
| :---: | :--- | :---: | :---: | :---: | :---: | :--- |
| 1 | BLACK-LISTED | 500 | 1000 | false | 10 | REJECTED_BLACKLIST |
| 2 | NORMAL | 5000 | 3000 | false | 10 | REJECTED_SALDO |
| 3 | NORMAL | 12000 | 50000 | false | 10 | REJECTED_LIMIT |
| 4 | NORMAL | 3000 | 20000 | true | 12 | FLAGGED_FRAUD |
| 5 | NORMAL | 1500 | 20000 | false | 2 | REQUIRE_OTP_NIGHT |
| 6 | SUSPICIOUS | 800 | 5000 | false | 12 | REQUIRE_OTP_SUSPICIOUS |
| 7 | NORMAL | 300 | 5000 | false | 12 | APPROVED |

Contoh output:
```text
Masukkan status akun (NORMAL/SUSPICIOUS/BLACK-LISTED): SUSPICIOUS
Masukkan nominal transaksi: 800
Masukkan sisa saldo: 5000
Apakah transaksi dari luar negeri? (true/false): false
Masukkan jam transaksi (0-23): 12
Status transaksi: REQUIRE_OTP_SUSPICIOUS
```

### 3.5 Tugas Eksternal 2: Alokasi Ruang UGD

Program menentukan lokasi perawatan pasien berdasarkan SpO2, sisa bed ICU, tekanan darah sistolik, kesadaran, suhu, komorbid, usia, dan laju napas. Pemeriksaan dilakukan dari kondisi paling kritis ke yang paling ringan.

#### 3.5.1 Kode Program
```java
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
```

#### 3.5.2 Hasil Pengujian

| No | SpO2 | Bed ICU | Sistolik | Sadar | Suhu | Komorbid | Usia | Laju Napas | Lokasi Perawatan |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | 80 | 2 | 120 | true | 37 | false | 30 | 18 | ICU |
| 2 | 80 | 0 | 120 | true | 37 | false | 30 | 18 | UGD_VENTILATOR_MOBIL |
| 3 | 87 | 2 | 120 | true | 37 | false | 30 | 18 | RESUSITASI_UGD |
| 4 | 92 | 2 | 120 | true | 37 | true | 70 | 20 | HCU_ISOLASI |
| 5 | 92 | 2 | 120 | true | 37 | false | 30 | 20 | RAWAT_INAP_UMUM |
| 6 | 98 | 2 | 120 | true | 37 | false | 30 | 18 | RAWAT_JALAN |

Contoh output:
```text
Masukkan SpO2 (%): 92
Masukkan sisa bed ICU: 2
Masukkan tekanan darah sistolik (mmHg): 120
Apakah pasien sadar penuh? (true/false): true
Masukkan suhu tubuh (C): 37
Apakah pasien punya riwayat komorbid? (true/false): true
Masukkan usia pasien: 70
Masukkan laju napas (x/menit): 20
Lokasi perawatan: HCU_ISOLASI
```

### 3.6 Tugas Eksternal 3: Konsultan Pajak (PPh 21 Progresif)

Program menghitung PPh 21 dengan tarif progresif per lapisan: 5% sampai Rp. 60 juta, 15% sampai Rp. 250 juta, 25% sampai Rp. 500 juta, dan 30% di atasnya. Setiap lapisan hanya dikenakan pada bagian penghasilan yang masuk ke lapisan tersebut.

#### 3.6.1 Kode Program
```java
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
```

#### 3.6.2 Hasil Pengujian

| No | PKP | Perhitungan | Pajak |
| :---: | :--- | :--- | :--- |
| 1 | 0 | PKP tidak positif | Rp. 0.0 |
| 2 | 50.000.000 | 5% x 50.000.000 | Rp. 2500000.0 |
| 3 | 100.000.000 | (5% x 60.000.000) + 15% x 40.000.000 | Rp. 9000000.0 |

Contoh output:
```text
Masukkan Penghasilan Kena Pajak (PKP): 100000000
Besar PPh 21 yang harus dibayar: Rp. 9000000.0
```

Catatan: karena variabel `pajak` bertipe `double`, Java akan menampilkan hasil di atas 10 juta dalam notasi ilmiah (misalnya `4.4E7` untuk 44.000.000).

---

## 4: KESIMPULAN

Struktur pemilihan digunakan untuk mengatur alur jalannya program (*flow control*) berdasarkan kondisi atau pilihan pengguna. Pada praktikum ini `if` dan `if-else` cocok untuk kondisi bernilai benar atau salah serta rentang nilai, `switch-case` cocok untuk membandingkan satu variabel dengan beberapa nilai tetap (dengan `break` untuk mencegah fall-through dan `default` untuk nilai di luar pilihan), sedangkan Ternary Operator cocok untuk memilih satu dari dua nilai secara ringkas. Pada tugas eksternal, urutan pemeriksaan kondisi pada rangkaian `else if` sangat menentukan hasil, sehingga kondisi dengan prioritas tertinggi harus diletakkan paling awal.