# JOBSHEET 6 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**
* **Nama:** Syauqi Khosyi Damar Agandi
* **NIM:** 264107020033
* **Kelas / No. Presensi:** TI-1D / 28

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan studi kasus menggunakan struktur pemilihan dasar dan pemilihan bersarang (*nested if*).
2. Mahasiswa mampu menyimpan dan mengumpulkan pekerjaan menggunakan Git dan GitHub melalui Visual Studio Code.
3. Mahasiswa mampu berkolaborasi dengan teman menggunakan GitHub (melakukan *invite collaborator*, *clone*, *commit*, *push*, dan *pull*).

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Menyiapkan Repository & Persiapan Awal Git

Pada percobaan pertama ini dilakukan konfigurasi identitas Git pada komputer menggunakan perintah `git config --global user.name` dan `git config --global user.email` melalui terminal Visual Studio Code. Selanjutnya dibuat *repository* baru di GitHub dengan nama `PraktikumDaspro28` (Public), kemudian dilakukan proses *Clone Git Repository* ke komputer lokal.

#### 2.1.1 Isi File `README.md`
```markdown
Ini adalah repository pertama saya
Nama  : Syauqi Khosyi Damar Agandi
NIM   : 264107020033
Kelas : TI-1D
```

#### 2.1.2 Ringkasan Proses Git pada Percobaan 1
| Tahap | Aksi di VS Code | Status File | Keterangan |
| :---: | :--- | :---: | :--- |
| 1 | Membuat file `README.md` | `U` (*Untracked*) | File baru belum dilacak oleh Git |
| 2 | Klik ikon `+` (*Stage Changes*) | `A` (*Added*) | File masuk ke *staging area* |
| 3 | Isi pesan `"Menambahkan identitas di README"` lalu klik **Commit** | Tersimpan lokal | Tersimpan sebagai *version* baru di *local repository* |
| 4 | Klik **Publish Branch / Push** | Terkirim ke GitHub | File `README.md` tampil di halaman GitHub |

---

### 2.2 Percobaan 2: Studi Kasus 1 - Pemilihan Dasar (Kedai Kopi Senja)

Pada percobaan ini dibuat program kasir sederhana untuk Kedai Kopi Senja yang menjual Kopi Susu Gula Aren seharga Rp18.000 per *cup*. Pembelian dengan total harga minimal Rp100.000 mendapatkan diskon 10%. Program juga menghitung total bayar serta memeriksa apakah uang pembayaran cukup (menampilkan kembalian) atau kurang (menampilkan nominal kekurangan).

#### 2.2.1 Kode Program Java (`StudiKasus1_28.java`)
```java
import java.util.Scanner;

public class StudiKasus1_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();
    }
}
```

#### 2.2.2 Hasil Running / Output
Berikut adalah tampilan *output* ketika membeli 3 *cup* dengan uang bayar Rp50.000:

```text
Masukkan jumlah cup : 3
Masukkan uang bayar : 50000
Total harga         : Rp 54000
Diskon              : Rp 0
Total bayar         : Rp 54000
Uang tidak cukup, kurang Rp 4000
```

#### 2.2.3 Tabel Pengujian Studi Kasus 1

| No | Jumlah Cup | Uang Bayar | Total Harga | Diskon | Total Bayar | Keterangan Output Akhir |
| :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | 3 | 50000 | Rp 54000 | Rp 0 | Rp 54000 | Uang tidak cukup, kurang Rp 4000 |
| 2 | 4 | 80000 | Rp 72000 | Rp 0 | Rp 72000 | Kembalian : Rp 8000 |
| 3 | 6 | 100000 | Rp 108000 | Rp 10800 | Rp 97200 | Kembalian : Rp 2800 |
| 4 | 6 | 90000 | Rp 108000 | Rp 10800 | Rp 97200 | Uang tidak cukup, kurang Rp 7200 |

---

### 2.3 Percobaan 3: Studi Kasus 2 - Pemilihan Bersarang (Validasi Dokumen Prestasi)

Pada percobaan ini dibuat program untuk membantu Admin Kemahasiswaan mengecek status dana penghargaan mahasiswa berdasarkan jenis kegiatan (`BELMAWA`, `BAKORMA`, `Mandiri`, `PKM`, atau `Lainnya`), kelengkapan dokumen yang diunggah di SIAKAD (wajib 4 dokumen), serta peringkat juara (Juara 1, 2, atau 3 untuk lomba) atau status lolos pendanaan (untuk PKM).

#### 2.3.1 Kode Program Java (`StudiKasus2_28.java`)
```java
import java.util.Scanner;

public class StudiKasus2_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || 
            jenis.equalsIgnoreCase("BAKORMA") || 
            jenis.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (Juara " + juara + " " + jenis.toUpperCase() + ").");
                } else {
                    int kurang = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int pendanaan = sc.nextInt();

            if (pendanaan == 1) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        sc.close();
    }
}
```

#### 2.3.2 Hasil Running / Output
Berikut adalah tampilan *output* sesuai contoh pengujian pada modul:

```text
Nama mahasiswa : Dori
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): bakorma
Jumlah dokumen : 3
Peringkat juara: 1
Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.
```

---

### 2.4 Percobaan 4: Uji Silang Program Teman (`HasilUji24.md`)

Pada percobaan ini dilakukan kolaborasi menggunakan fitur **Collaborators** di GitHub. Rekan praktikum diundang ke dalam *repository*, melakukan *Clone*, menguji program `StudiKasus2_28.java` dengan beberapa skenario data uji, mencatat hasilnya pada file dokumentasi (`HasilUji24.md` / `README.md`), lalu melakukan *Commit & Push*. Selanjutnya pemilik *repository* menarik perubahan terbaru ke komputer lokal menggunakan fitur **Pull / Sync Changes**.

#### 2.4.1 Tabel Hasil Uji Silang (`HasilUji24.md`)

| No | Jenis Kegiatan | Dokumen | Juara / Dana | Output Program | Sesuai? |
| :---: | :---: | :---: | :---: | :--- | :---: |
| 1 | BAKORMA | 3 | Juara 1 | Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan. | Ya |
| 2 | Mandiri | 4 | 0 (bukan juara 1/2/3) | Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3). | Ya |
| 3 | PKM | 4 | 1 (lolos pendanaan) | Berhak memperoleh dana penghargaan (PKM lolos pendanaan). | Ya |
| 4 | Lainnya | - | (tidak ditanyakan) | Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan). | Ya |

---

## 3: KESIMPULAN

Berdasarkan praktikum Jobsheet 6, dapat disimpulkan bahwa:
1. Penyelesaian studi kasus pemrograman seperti perhitungan transaksi kasir dan validasi dokumen bertingkat dapat diimplementasikan secara terstruktur menggunakan pemilihan dasar (`if-else`) dan pemilihan bersarang (*nested if*).
2. Penggunaan sistem kendali versi **Git** dan **GitHub** yang terintegrasi pada Visual Studio Code sangat memudahkan mahasiswa dalam mencatat riwayat perubahan kode (*Add/Stage*, *Commit*), mencadangkan kode ke *cloud* (*Push*), serta mengambil pembaruan (*Pull* / *Sync*).
3. Fitur *Collaborators* pada GitHub memungkinkan dilakukannya pengujian silang (*cross-testing*) dan kerja sama tim secara efektif tanpa perlu mengirim file secara manual.