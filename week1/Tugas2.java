package week1;

public class Tugas2 {
    public static void main(String[] args) {
        // Persegi
        int sisi = 100;
        System.out.println("Luas Persegi  : " + (sisi * sisi));
        System.out.println("Keliling Persegi : " + (4 * sisi));

        // Segitiga
        int alas = 12, tinggi = 15, a = 15, b = 13, c = 17;
        System.out.println("Luas Segitiga  : " + (0.5f * alas * tinggi));
        System.out.println("Keliling Segitiga : " + (a + b + c));

        // Lingkaran
        int r = 39;
        float phi = 3.14f;
        float luasLingkaran = phi * r * r;
        float kelilingLingkaran = 2 * phi * r;
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
  

        // Kubus
        int sisiKubus = 10;
        System.out.println("Luas Permukaan Kubus: " + (6 * sisiKubus * sisiKubus));
        System.out.println("Keliling Kubus: " + (12 * sisiKubus));

    }
}
