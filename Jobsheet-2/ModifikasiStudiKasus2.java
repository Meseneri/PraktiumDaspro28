import java.util.Scanner;

public class ModifikasiStudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lebar, panjang, diameterKolam, sisiTaman;

        System.out.print("Masukkan lebar tanah: ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan panjang tanah: ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan diameter kolam: ");
        diameterKolam = sc.nextDouble();
        System.out.print("Masukkan sisi taman: ");
        sisiTaman = sc.nextDouble();

        double luasTanah = panjang * lebar;
        double luasKolam = Math.PI * (diameterKolam / 2) * (diameterKolam / 2);
        double luasTaman = sisiTaman * sisiTaman;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah: " + luasTanah);
        System.out.println("Luas kolam: " + luasKolam);
        System.out.println("Luas taman: " + luasTaman);
        System.out.println("Luas tanah yang tidak digunakan: " + luasTidakDigunakan);
    }
}