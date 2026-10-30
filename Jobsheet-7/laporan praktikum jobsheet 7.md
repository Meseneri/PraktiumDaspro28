# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Syauqi Khosyi Damar Agandi
* **NIM:** 264107020033
* **Kelas / No. Presensi:** TI-1D / 28

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (`for`, `while`, dan `do-while`).
2. Mahasiswa dapat mengimplementasikan *flowchart* perulangan menggunakan bahasa pemrograman Java.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan FOR

Pada percobaan ini dibuat program untuk mencari nilai tertinggi dan nilai terendah Kuis dari 10 mahasiswa di dalam satu kelas menggunakan struktur perulangan `for`, serta dimodifikasi untuk menghitung jumlah mahasiswa yang lulus dan tidak lulus (batas minimal kelulusan = 60).

#### 2.1.1 Kode Program Java (`SiakadFor28.java`)
```java
import java.util.Scanner;

public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus       : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);

        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Output
Berikut adalah tampilan *output* setelah program dijalankan dengan 10 data nilai mahasiswa:

```text
Masukkan nilai mahasiswa ke-1: 76.5
Masukkan nilai mahasiswa ke-2: 82.3
Masukkan nilai mahasiswa ke-3: 62.1
Masukkan nilai mahasiswa ke-4: 88.4
Masukkan nilai mahasiswa ke-5: 65.9
Masukkan nilai mahasiswa ke-6: 67.9
Masukkan nilai mahasiswa ke-7: 90.1
Masukkan nilai mahasiswa ke-8: 55.3
Masukkan nilai mahasiswa ke-9: 73.7
Masukkan nilai mahasiswa ke-10: 78.6
Nilai tertinggi: 90.1
Nilai terendah : 55.3
Jumlah mahasiswa lulus       : 9
Jumlah mahasiswa tidak lulus : 1
```

#### 2.1.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
  * **Jawab:** Pada baris `for (int i = 1; i <= 10; i++)`, terdapat tiga komponen utama:
    1. **Inisialisasi (`int i = 1`):** Menetapkan nilai awal variabel pencacah (*counter*) `i` dimulai dari 1. Dieksekusi satu kali di awal perulangan.
    2. **Kondisi (`i <= 10`):** Batas syarat perulangan tetap berjalan. Selama `i` kurang dari atau sama dengan 10 (bernilai `true`), badan perulangan akan dieksekusi.
    3. **Perubahan nilai / *Update* (`i++`):** Menambah nilai `i` sebesar 1 setiap kali satu iterasi badan perulangan selesai dijalankan.

* **Pertanyaan 2:** Mengapa variabel `tertinggi` diinisialisasi `0` dan `terendah` diinisialisasi `100`? Apa yang terjadi jika variabel `tertinggi` diinisialisasi `100` dan `terendah` diinisialisasi `0`?
  * **Jawab:** Rentang nilai mahasiswa normalnya berada pada skala $0$ hingga $100$. Variabel `tertinggi` diberi nilai awal paling minimum ($0$) agar nilai mahasiswa pertama yang diinputkan pasti lebih besar dari `tertinggi` dan langsung menggantikannya. Sebaliknya, `terendah` diberi nilai awal paling maksimum ($100$) agar nilai masukan pertama pasti lebih kecil dan menggantikan nilai `terendah`. Jika dibalik (`tertinggi = 100` dan `terendah = 0`), maka kondisi `nilai > tertinggi` tidak akan pernah terpenuhi (kecuali ada nilai $> 100$) sehingga hasil nilai tertinggi akan selalu tetap `100.0`, dan kondisi `nilai < terendah` tidak akan pernah terpenuhi sehingga nilai terendah akan selalu tetap `0.0`.

* **Pertanyaan 3:** Jelaskan fungsi dan alur kerja dari potongan kode berikut!
  ```java
  if (nilai > tertinggi) {
      tertinggi = nilai;
  }
  if (nilai < terendah) {
      terendah = nilai;
  }
  ```
  * **Jawab:** Potongan kode tersebut berfungsi memperbarui rekor nilai tertinggi dan nilai terendah pada setiap iterasi.
    1. Pertama, program mengecek apakah `nilai` yang baru saja dimasukkan lebih besar daripada isi variabel `tertinggi` saat ini. Jika `true`, maka nilai `tertinggi` ditimpa dengan `nilai` baru tersebut.
    2. Kedua, secara terpisah (menggunakan `if` baru, bukan `else if`), program mengecek apakah `nilai` baru tersebut lebih kecil daripada isi variabel `terendah` saat ini. Jika `true`, maka nilai `terendah` diperbarui dengan `nilai` tersebut. Penggunaan dua `if` terpisah memastikan pada input mahasiswa ke-1, nilai tersebut dapat tercatat sekaligus sebagai nilai tertinggi dan terendah sementara.

* **Pertanyaan 4:** Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
  * **Jawab:** Modifikasi telah diterapkan pada kode di atas dengan menambahkan variabel `int lulus = 0, tidakLulus = 0;` serta pengecekan `if (nilai >= 60) { lulus++; } else { tidakLulus++; }` di dalam perulangan `for`.

---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan WHILE

Percobaan ini menggunakan perulangan `while` untuk mengonversi nilai angka sejumlah mahasiswa menjadi kategori nilai huruf (`A`, `B+`, `B`, `C+`, `C`, `D`, `E`). Jika nilai yang dimasukkan tidak valid ($< 0$ atau $> 100$), program menampilkan peringatan dan meminta input ulang untuk mahasiswa yang sama menggunakan sintaks `continue`.

#### 2.2.1 Kode Program Java (`SiakadWhile28.java`)
```java
import java.util.Scanner;

public class SiakadWhile28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            i++;
        }

        sc.close();
    }
}
```

#### 2.2.2 Hasil Running / Output
```text
Masukkan jumlah mahasiswa: 5
Masukkan nilai mahasiswa ke-1: 85
Nilai mahasiswa ke-1 adalah A
Bagus, pertahankan nilainya!
Masukkan nilai mahasiswa ke-2: 63
Nilai mahasiswa ke-2 adalah C+
Masukkan nilai mahasiswa ke-3: 101
Nilai tidak valid. Masukkan lagi nilai yang valid!
Masukkan nilai mahasiswa ke-3: 23
Nilai mahasiswa ke-3 adalah E
Masukkan nilai mahasiswa ke-4: -15
Nilai tidak valid. Masukkan lagi nilai yang valid!
Masukkan nilai mahasiswa ke-4: 70
Nilai mahasiswa ke-4 adalah B
Masukkan nilai mahasiswa ke-5: 55
Nilai mahasiswa ke-5 adalah C
```

#### 2.2.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks:
  * **a. `nilai < 0 || nilai > 100`:** Memeriksa apakah nilai yang dimasukkan berada di luar rentang valid ($0-100$), yaitu bernilai negatif (kurang dari $0$) **atau** melebihi $100$.
  * **b. `continue`:** Menghentikan iterasi saat ini secara paksa dan langsung melompat kembali ke pemeriksaan kondisi `while (i < jml)` di atas. Dengan demikian, kode penentuan nilai huruf dan perintah `i++` di bawahnya dilewati, sehingga pengguna diminta menginput ulang nilai untuk nomor mahasiswa yang sama.

* **Pertanyaan 2:** Mengapa sintaks `i++` dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
  * **Jawab:** `i++` diletakkan di paling akhir agar penambahan nomor urut mahasiswa hanya dilakukan **setelah** input nilai dinyatakan valid dan berhasil dikonversi ke nilai huruf. Jika `i++` diletakkan di awal perulangan (sebelum validasi `if (nilai < 0 || nilai > 100)`), maka: (1) penomoran tampilan `(i + 1)` akan bergeser dimulai dari mahasiswa ke-2, dan (2) ketika pengguna memasukkan nilai yang tidak valid lalu terkena `continue`, nilai `i` sudah terlanjur bertambah sehingga jatah input mahasiswa tersebut hangus/terlewat.

* **Pertanyaan 3:** Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
  * **Jawab:** Jika seluruh input yang dimasukkan valid, perulangan `while` akan berjalan tepat **19 kali** (mulai dari $i = 0$ sampai $i = 18$). Namun, jika terdapat $k$ kali kesalahan input nilai tidak valid, maka perulangan akan berjalan sebanyak $19 + k$ kali.

* **Pertanyaan 4:** Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan `"Bagus, pertahankan nilainya"`!
  * **Jawab:** Modifikasi telah ditambahkan di dalam blok `if (nilai > 80 && nilai <= 100)` dengan perintah `System.out.println("Bagus, pertahankan nilainya!");`.

---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe - Perulangan DO-WHILE

Pada percobaan ini dibuat program kasir kafe menggunakan perulangan `do-while` yang terus menerima pesanan pelanggan (kopi Rp12.000, teh Rp7.000, roti Rp20.000) hingga kasir mengetikkan `"batal"` pada nama pelanggan.

#### 2.3.1 Kode Program Java (`KafeDoWhile28.java`)
```java
import java.util.Scanner;

public class KafeDoWhile28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
```

#### 2.3.2 Hasil Running / Output
```text
Masukkan nama pelanggan (ketik 'batal' untuk keluar): Rena
Jumlah kopi: 3
Jumlah teh: 0
Jumlah roti: 1
Total yang harus dibayar: Rp 56000
Masukkan nama pelanggan (ketik 'batal' untuk keluar): Yuni
Jumlah kopi: 1
Jumlah teh: 4
Jumlah roti: 2
Total yang harus dibayar: Rp 80000
Masukkan nama pelanggan (ketik 'batal' untuk keluar): BATAL
Transaksi dibatalkan.
Semua transaksi selesai.
```

#### 2.3.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah `"batal"`, maka berapa kali perulangan dilakukan?
  * **Jawab:** Perulangan dilakukan sebanyak **1 kali** (masuk ke badan `do`, meminta input nama pelanggan, mengecek kondisi `if`, mencetak `"Transaksi dibatalkan."`, lalu keluar dari perulangan karena perintah `break`).

* **Pertanyaan 2:** Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
  * **Jawab:** Kondisi berhentinya berada di dalam badan perulangan, yaitu ketika `namaPelanggan.equalsIgnoreCase("batal")` bernilai `true` yang kemudian mengeksekusi pernyataan `break;` untuk menghentikan perulangan secara langsung.

* **Pertanyaan 3:** Apa fungsi dari penggunaan nilai `true` pada kondisi DO-WHILE (`while (true)`)?
  * **Jawab:** Menciptakan *infinite loop* (perulangan tak terbatas secara syarat di akhir) sehingga program akan terus mengulang proses transaksi tanpa batas jumlah pelanggan tertentu, dan baru berhenti apabila dipicu oleh perintah `break` di dalam perulangan.

* **Pertanyaan 4:** Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
  * **Jawab:** Karena perulangan ini termasuk *uncounted loop* (perulangan yang jumlah iterasinya tidak ditentukan oleh angka pencacah), melainkan dikendalikan oleh kejadian/masukan pengguna (*event/sentinel-controlled loop*). Selama kondisi `while (true)` selalu bernilai benar, perulangan tetap berjalan hingga pengguna mengetikkan kata kunci `"batal"`.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Program perhitungan total penjualan tiket bioskop dalam satu hari dengan ketentuan diskon dan validasi input.
- [x] **Tugas 2:** Implementasi *flowchart* perhitungan total pembayaran parkir kendaraan (mobil dan motor).

### 3.1 Implementasi Kode Tugas 1: Penjualan Tiket Bioskop (`TUGAS_PenjualanTIketBioskop.java`)

Program menghitung total tiket terjual dan total pendapatan penjualan tiket bioskop (harga Rp50.000/tiket). Pembelian $> 4$ tiket mendapat diskon 10%, dan pembelian $> 10$ tiket mendapat diskon 15%. Input negatif diabaikan dan diminta ulang.

```java
import java.util.Scanner;

public class TUGAS_PenjualanTIketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiketTerjual = 0;
        double hargaTransaksi, diskon, totalPenjualan = 0;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif)! Masukkan ulang.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            hargaTransaksi = jumlahTiket * hargaTiket * (1 - diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTransaksi;

            System.out.println("Diskon didapat       : " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar pelanggan: Rp " + (int)hargaTransaksi);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== REKAP PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual   : " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan : Rp " + (int)totalPenjualan);

        sc.close();
    }
}
```

**Contoh Output Tugas 1:**

```text
=== PROGRAM PENJUALAN TIKET BIOSKOP ===
Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): 3
Diskon didapat       : 0%
Total bayar pelanggan: Rp 150000
----------------------------------------
Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): -2
Jumlah tiket tidak valid (negatif)! Masukkan ulang.
Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): 6
Diskon didapat       : 10%
Total bayar pelanggan: Rp 270000
----------------------------------------
Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): 12
Diskon didapat       : 15%
Total bayar pelanggan: Rp 510000
----------------------------------------
Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): 0

=== REKAP PENJUALAN HARI INI ===
Total tiket terjual   : 21 tiket
Total harga penjualan : Rp 930000
```

### 3.2 Implementasi Kode Tugas 2: Pembayaran Parkir Sesuai Flowchart (`TugasParkir28.java`)

Program mengimplementasikan *flowchart* tempat parkir dengan tarif Rp3.000/jam untuk mobil (`jenis == 1`) dan Rp2.000/jam untuk motor (`jenis == 2`), serta berhenti ketika pengguna memasukkan `0`.

```java
import java.util.Scanner;

public class TugasParkir28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
        sc.close();
    }
}
```

**Contoh Output Tugas 2:**

```text
Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): 1
Masukkan durasi parkir (jam): 3
Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): 2
Masukkan durasi parkir (jam): 4
Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): 0
Total pembayaran parkir: Rp 17000
```

---

## 4: KESIMPULAN

Berdasarkan praktikum Jobsheet 7, dapat disimpulkan bahwa bahasa Java menyediakan tiga struktur perulangan utama dengan karakteristik yang saling melengkapi:
1. **`for`** digunakan untuk *counted loop* ketika jumlah iterasi sudah diketahui secara pasti sejak awal (seperti menginputkan 10 nilai mahasiswa).
2. **`while`** mengevaluasi kondisi di awal sebelum menjalankan badan perulangan, serta sangat cocok dikombinasikan dengan pernyataan `continue` untuk memvalidasi dan mengulang input yang tidak sesuai syarat.
3. **`do-while`** mengevaluasi kondisi di akhir sehingga badan perulangan dijamin berjalan minimal satu kali, sangat efektif untuk menu transaksi berulang yang dihentikan dengan kata kunci tertentu menggunakan `break` atau nilai *sentinel*.