public class Studikasus2 {
    public static void main(String[] args) {
        double lebar = 30, panjang = 100;
        double diameterKolam = 5;
        double sisiTaman = 2;

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