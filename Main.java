package uts_pbo;

// Definisi kelas dasar Hewan
class Hewan {
    protected String jenisSuara;

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println(jenisSuara);
    }
}

// Definisi kelas turunan Kucing dari Hewan
class Kucing extends Hewan {
    public Kucing() {
        // Memanggil konstruktor kelas dasar dengan jenisSuara "Meong"
        super("Meong");
    }
}

// Definisi kelas turunan Anjing dari Hewan
class Anjing extends Hewan {
    public Anjing() {
        // Memanggil konstruktor kelas dasar dengan jenisSuara "Guk Guk"
        super("Guk Guk");
    }
}

// Main class
public class Main {
    // Fungsi untuk mengecek apakah hewan adalah mamalia atau bukan
    public static void cekMamalia(Hewan hewan) {
        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Meminta pengguna memasukkan jenis hewan
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine().toLowerCase();

        // Membuat objek berdasarkan input pengguna
        Hewan hewan;
        switch (jenisHewan) {
            case "kucing":
                hewan = new Kucing();
                break;
            case "anjing":
                hewan = new Anjing();
                break;
            default:
                System.out.println("Jenis hewan tidak valid.");
                return;
        }

        // Memanggil metode bersuara dari objek hewan
        hewan.bersuara();

        // Memanggil fungsi cekMamalia
        cekMamalia(hewan);
    }
}
