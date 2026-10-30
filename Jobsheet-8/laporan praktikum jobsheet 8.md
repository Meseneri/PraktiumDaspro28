w# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** Syauqi Khosyi Damar Agandi
* **NIM:** 264107020033
* **Kelas / No. Presensi:** TI-1D / 28

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang (*nested loop*) pada algoritma.
2. Memahami alur eksekusi perulangan bersarang (*outer loop* dan *inner loop*).
3. Mengenal sintaks perulangan bersarang dalam bahasa pemrograman Java.
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Review Perulangan 1 (`Star28.java`)

Percobaan ini mengulang konsep perulangan `for` satu tingkat untuk mencetak karakter bintang (`*`) sebanyak $n$ kali secara mendatar menggunakan `System.out.print("*")`.

#### 2.1.1 Kode Program Java (`Star28.java`)
```java
import java.util.Scanner;

public class Star28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Output
```text
Masukkan nilai n = 5
*****
```

| Pengujian | Nilai `n` | Output yang Muncul | Jumlah Karakter `*` |
| :---: | :---: | :--- | :---: |
| 1 | 5 | `*****` | 5 |
| 2 | 3 | `***` | 3 |
| 3 | 7 | `*******` | 7 |

#### 2.1.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika $n = 5$? Jelaskan.
  * **Jawab:** Karakter `*` yang tercetak adalah **6 karakter** (`******`). Hal ini terjadi karena perulangan dimulai dari $i = 0$ dan berhenti setelah $i = 5$ ($i = 0, 1, 2, 3, 4, 5$), sehingga total terdapat 6 iterasi.

* **Pertanyaan 2:** Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat $n = 5$? Mengapa hasilnya berbeda?
  * **Jawab:** Perulangan dijalankan sebanyak **4 kali** (untuk $i = 1, 2, 3, 4$). Hasilnya berbeda karena operator `<` tidak menyertakan batas atas $n = 5$; ketika $i$ mencapai $5$, kondisi `5 < 5` bernilai `false` dan perulangan langsung berhenti.

* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika $n = 9$, kemudian buktikan dan modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi $n$.
  ```java
  for (int i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
  }
  ```
  * **Jawab:** Ketika $n = 9$, output yang tercetak adalah bilangan genap: `2 4 6 8 `. Agar mencetak bilangan ganjil positif yang tidak melebihi $n$, nilai awal `i` diubah menjadi `1`:
    ```java
    for (int i = 1; i <= n; i += 2) {
        System.out.print(i + " ");
    }
    ```
    Output untuk $n = 9$: `1 3 5 7 9 `.

* **Pertanyaan 4:** Jelaskan mengapa perubahan increment `i++` menjadi `i--` (dengan kondisi tetap `i <= n`) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk $n$ positif.
  * **Jawab:** Karena nilai awal $i = 1$ sudah lebih kecil dari $n$ positif, dan setiap iterasi nilai $i$ dikurangi 1 (`i--`) menjadi $0, -1, -2, -3, \dots$ yang nilainya selalu $\le n$. Akibatnya kondisi `i <= n` selalu bernilai `true` (*infinite loop*) hingga terjadi *integer underflow*.

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang - Nested FOR (`Rectangle28.java`)

Percobaan ini menerapkan *nested loop* `for` untuk mencetak pola persegi panjang berukuran $\text{baris} \times \text{kolom}$, kemudian dimodifikasi sesuai instruksi pertanyaan nomor 5 untuk mencetak karakter `#`.

#### 2.2.1 Kode Program Java (`Rectangle28.java`)
```java
import java.util.Scanner;

public class Rectangle28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

#### 2.2.2 Hasil Running / Output
Output awal (menggunakan `*`) untuk `baris = 3` dan `kolom = 6`:
```text
Masukkan jumlah baris: 3
Masukkan jumlah kolom: 6
******
******
******
```

Output setelah modifikasi karakter `#` untuk `(4, 2)` dan `(1, 5)`:
```text
Masukkan jumlah baris: 4
Masukkan jumlah kolom: 2
##
##
##
##
```

#### 2.2.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Tentukan fungsi variabel `i` dan `j` pada program tersebut.
  * **Jawab:** Variabel `i` berfungsi sebagai pencacah pada *outer loop* yang mengatur perpindahan **baris** (vertikal), sedangkan variabel `j` berfungsi sebagai pencacah pada *inner loop* yang mengatur pencetakan karakter pada setiap **kolom** (horizontal) di dalam suatu baris.

* **Pertanyaan 2:** Berapa kali *outer loop*, *inner loop*, dan perintah `print("*")` dijalankan untuk `baris = 4` dan `kolom = 7`?
  * **Jawab:**
    * *Outer loop* dijalankan sebanyak **4 kali**.
    * *Inner loop* dijalankan sebanyak **7 kali** pada setiap baris, sehingga total keseluruhan dijalankan $4 \times 7 = \mathbf{28\text{ kali}}$.
    * Perintah `print("*")` dijalankan sebanyak **28 kali**.

* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (*outer* menggunakan `kolom`, *inner* menggunakan `baris`)? Gunakan `baris = 3` dan `kolom = 6` untuk menjelaskan.
  * **Jawab:** Ukuran orientasi persegi panjang akan tertukar (ter-transpos). Jika `baris = 3` dan `kolom = 6` ditukar batasnya, maka *outer loop* akan berjalan 6 kali (menghasilkan 6 baris ke bawah) dan *inner loop* berjalan 3 kali (mencetak 3 bintang ke samping pada tiap baris), sehingga terbentuk persegi panjang berukuran $6 \times 3$.

* **Pertanyaan 4:** Jelaskan akibat penghapusan `System.out.println();` setelah *inner loop*.
  * **Jawab:** Kursor tidak akan pernah pindah ke baris baru setelah satu baris selesai dicetak. Akibatnya, seluruh karakter bintang dari semua baris akan tercetak menyambung menjadi satu baris lurus ke samping (sebanyak $\text{baris} \times \text{kolom}$ karakter).

* **Pertanyaan 5:** Modifikasi program agar karakter yang dicetak adalah `#`, lalu commit dan push perubahan ke GitHub.
  * **Jawab:** Modifikasi telah diterapkan pada kode `Rectangle28.java` di atas dengan mengubah `System.out.print("*")` menjadi `System.out.print("#")`.

---

### 2.3 Percobaan 3: Debugging Bintang Segitiga - Nested WHILE (`Triangle28.java`)

Pada percobaan ini dilakukan *debugging* terhadap kode awal perulangan `while` bersarang agar menghasilkan pola segitiga siku-siku yang benar, lalu ditambahkan *nested while* kedua di bawahnya untuk mencetak segitiga terbalik.

#### 2.3.1 Kode Program Java Setelah Perbaikan & Modifikasi (`Triangle28.java`)
```java
import java.util.Scanner;

public class Triangle28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga siku-siku bertingkat naik
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Modifikasi: Segitiga siku-siku terbalik
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close();
    }
}
```

#### 2.3.2 Hasil Running / Output (`n = 5`)
```text
Masukkan nilai n = 5
*
**
***
****
*****
*****
****
***
**
*
```

#### 2.3.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
  * **Jawab:** Pada kode awal, ketika $n = 5$, semua bintang tercetak menyambung dalam satu baris (`***************`) dan *outer loop* berjalan 6 kali (terdapat baris kosong saat $i = 0$). Dua perbaikan yang dilakukan:
    1. Menambahkan `System.out.println();` setelah *inner loop* selesai (sebelum `i++`) agar setiap selesai mencetak bintang pada satu baris, kursor berpindah ke baris berikutnya.
    2. Mengubah inisialisasi `int i = 0;` menjadi `int i = 1;` agar *outer loop* berjalan tepat $n$ kali (mulai dari 1 bintang hingga $n$ bintang) tanpa menghasilkan baris kosong di awal.

* **Pertanyaan 2:** Jelaskan peran variabel `i` dan `j`. Mengapa nilai `j` harus diinisialisasi kembali ke 0 pada setiap iterasi *outer loop*? Apa yang terjadi jika `j` tidak di-reset?
  * **Jawab:** Variabel `i` mengatur nomor baris sekaligus menentukan batas jumlah bintang yang harus dicetak pada baris tersebut, sedangkan `j` menghitung jumlah bintang yang sudah dicetak pada baris yang sedang aktif. Nilai `j` wajib di-reset ke `0` di setiap awal *outer loop* agar penghitungan bintang pada baris baru dimulai dari nol lagi. Jika `j` dideklarasikan dan diinisialisasi di luar *outer loop* (tidak di-reset), maka pada baris ke-2 nilai `j` sudah sama dengan $i$ sebelumnya, sehingga pada setiap baris hanya akan tercetak 1 bintang saja.

* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (*update*) pada *outer loop* yang diperlukan untuk membentuk segitiga terbalik.
  * **Jawab:** Untuk membentuk segitiga terbalik (dari $n$ bintang turun menjadi 1 bintang):
    * **Inisialisasi:** diubah menjadi `i = n;` (dimulai dari jumlah bintang terbanyak).
    * **Kondisi:** diubah menjadi `while (i >= 1)` (terus berjalan selama nilai `i` minimal 1).
    * **Update:** diubah dari *increment* `i++` menjadi *decrement* `i--` (berkurang 1 di setiap baris berikutnya).

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok (`NilaiKelompok28.java`)

Percobaan ini menggabungkan tiga tingkat perulangan sekaligus: `while` (memproses setiap kelompok), `for` (memproses setiap penilai), dan `do-while` (memvalidasi agar nilai berada pada rentang $0-100$), untuk menghitung rata-rata tiap kelompok dan menentukan kelompok dengan rata-rata tertinggi.

#### 2.4.1 Kode Program Java (`NilaiKelompok28.java`)
```java
import java.util.Scanner;

public class NilaiKelompok28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);

                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }

        sc.close();
    }
}
```

#### 2.4.2 Hasil Running / Output
```text
Masukkan jumlah kelompok: 3
Masukkan jumlah penilai : 2
Kelompok 1
  Nilai dari Penilai 1: 80
  Nilai dari Penilai 2: 90
Kelompok 1: nilai rata-rata = 85.0
Kelompok 2
  Nilai dari Penilai 1: 75
  Nilai dari Penilai 2: 105
  Nilai harus 0-100. Ulangi input!
  Nilai dari Penilai 2: 85
Kelompok 2: nilai rata-rata = 80.0
Kelompok 3
  Nilai dari Penilai 1: 90
  Nilai dari Penilai 2: 96
Kelompok 3: nilai rata-rata = 93.0
==============================
Kelompok terbaik    : 3
Rata-rata tertinggi : 93.0
```

#### 2.4.3 Jawaban Pertanyaan
* **Pertanyaan 1:** Mengapa `totalNilai` perlu di-reset di dalam *outer loop*, tetapi `rataTertinggi` tidak boleh di-reset pada setiap kelompok?
  * **Jawab:** `totalNilai` hanya digunakan untuk menjumlahkan nilai milik **satu kelompok** yang sedang diproses; jika tidak di-reset ke `0` pada awal setiap kelompok, maka nilai kelompok sebelumnya akan ikut terakumulasi ke kelompok berikutnya. Sebaliknya, `rataTertinggi` berfungsi membandingkan dan menyimpan rekor tertinggi dari **seluruh kelompok** dari awal hingga akhir; jika di-reset di dalam *outer loop*, maka program hanya akan mengingat nilai kelompok terakhir saja.

* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?
  * **Jawab:** Badan perulangan `for` dijalankan sebanyak $3 \times 2 = \mathbf{6\text{ kali}}$ secara keseluruhan.

* **Pertanyaan 3:** Apa yang terjadi jika `totalNilai` dideklarasikan sebagai `int` dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
  * **Jawab:** Akan terjadi **pembagian bilangan bulat (*integer division*)** di mana bagian desimal/pecahan dari hasil bagi akan dipotong (dibulatkan ke bawah menjadi bilangan bulat) sebelum disimpan ke variabel `rataNilai`. Contohnya: jika terdapat 2 penilai yang memberikan nilai `80` dan `85`, maka `totalNilai` = `165`. Jika keduanya bertipe `int`, maka `165 / 2` akan menghasilkan `82` (atau `82.0`), padahal rata-rata sebenarnya adalah `82.5`.

* **Pertanyaan 4:** Mengapa `rataTertinggi` diberi nilai awal `-1`, bukan `0`? Berikan contoh input yang membuat hasil salah apabila nilai awalnya `0`.
  * **Jawab:** Karena nilai minimum yang valid adalah `0`, sehingga sebuah kelompok sangat mungkin memperoleh rata-rata `0.0`. Jika `rataTertinggi` diinisialisasi `0` dan seluruh kelompok mendapatkan nilai `0` dari semua penilai (rata-rata = `0.0`), maka kondisi `if (rataNilai > rataTertinggi)` yaitu `0.0 > 0` akan bernilai `false`. Akibatnya, `kelompokTerbaik` tetap bernilai `0` (tidak ada kelompok yang terpilih). Dengan nilai awal `-1`, rata-rata `0.0` pada kelompok pertama tetap lebih besar dari `-1` sehingga kelompok pertama pasti tercatat.

* **Pertanyaan 5:** Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.
  * **Jawab:**
    1. **Tingkat 1 (*Outer Loop*) - `while`:** Mengatur perpindahan proses penilaian dari satu kelompok ke kelompok berikutnya sebanyak `jumlahKelompok`.
    2. **Tingkat 2 (*Middle Loop*) - `for`:** Mengatur iterasi pengambilan nilai dari masing-masing penilai (penilai ke-1 sampai ke-`jumlahPenilai`) pada setiap kelompok.
    3. **Tingkat 3 (*Innermost Loop*) - `do-while`:** Memvalidasi input nilai dari seorang penilai agar wajib diulang apabila nilai yang dimasukkan berada di luar rentang $0-100$.

---

## 3: TUGAS MANDIRI

Berikut adalah daftar tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1 (`Tugas128.java`):** Mencetak pola bilangan bertingkat $1$ sampai nomor baris beserta total banyaknya angka yang tercetak.
- [x] **Tugas 2 (`Tugas228.java`):** Menampilkan tabel perkalian berukuran $n \times n$ ($n$ minimal 3) secara rapi beserta jumlah seluruh angka pada tabel.
- [x] **Tugas 3 (`Tugas328.java`):** Program rekap penjualan beberapa toko menggunakan perulangan bersarang.

### 3.1 Implementasi Kode Tugas 1: Pola Bilangan Bertingkat (`Tugas128.java`)

```java
import java.util.Scanner;

public class Tugas128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n minimal 1!");
        } else {
            int totalAngka = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalAngka++;
                }
                System.out.println();
            }

            System.out.println("Total angka tercetak: " + totalAngka);
        }

        sc.close();
    }
}
```

**Hasil Output Tugas 1 (`n = 5`):**
```text
Masukkan nilai n = 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
Total angka tercetak: 15
```

---

### 3.2 Implementasi Kode Tugas 2: Tabel Perkalian (`Tugas228.java`)

```java
import java.util.Scanner;

public class Tugas228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
        } else {
            int jumlahSeluruhAngka = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlahSeluruhAngka += hasil;
                }
                System.out.println();
            }

            System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        }

        sc.close();
    }
}
```

**Hasil Output Tugas 2 (`n = 4`):**
```text
Masukkan nilai n = 4
   1   2   3   4
   2   4   6   8
   3   6   9  12
   4   8  12  16
Jumlah seluruh angka: 100
```

---

### 3.3 Implementasi Kode Tugas 3: Rekap Penjualan Beberapa Toko (`Tugas328.java`)

```java
import java.util.Scanner;

public class Tugas328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
        } else {
            int totalBarangSeluruhToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\n--- Toko " + i + " ---");
                int jumlahPelanggan;

                do {
                    System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan ke-" + j + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif!");
                        }
                    } while (barang < 0);

                    totalBarangToko += barang;
                }

                System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruhToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }

            System.out.println("\n==========================================");
            System.out.println("Total barang seluruh toko    : " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }

        sc.close();
    }
}
```

**Hasil Output Tugas 3:**
```text
Masukkan jumlah toko: 2

--- Toko 1 ---
Masukkan jumlah pelanggan Toko 1: 2
  Jumlah barang pelanggan ke-1: 3
  Jumlah barang pelanggan ke-2: 2
Toko 1 -> pelanggan: 2, total barang: 5

--- Toko 2 ---
Masukkan jumlah pelanggan Toko 2: 3
  Jumlah barang pelanggan ke-1: 1
  Jumlah barang pelanggan ke-2: 4
  Jumlah barang pelanggan ke-3: 2
Toko 2 -> pelanggan: 3, total barang: 7

==========================================
Total barang seluruh toko    : 12
Toko dengan barang terbanyak : 2
```

---

## 4: KESIMPULAN

Berdasarkan praktikum Jobsheet 8, dapat disimpulkan bahwa perulangan bersarang (*nested loop*) bekerja dengan mengeksekusi seluruh rangkaian iterasi *inner loop* hingga tuntas untuk setiap satu kali iterasi pada *outer loop*. Konsep ini sangat esensial dalam pembuatan pola dua dimensi (baris dan kolom seperti persegi panjang, segitiga bintang, pola bilangan, dan tabel perkalian) maupun pengolahan data bertingkat (seperti penilaian proyek beberapa kelompok oleh banyak penilai dan rekapitulasi transaksi pelanggan di berbagai cabang toko) tanpa harus membuat banyak variabel terpisah.