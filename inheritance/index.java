// Kelas utama
class Hewan {
    // Properti
    String jenis;
    int umur;
    
    // Konstruktor
    public Hewan(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }
    
    // Metode
    public void bersuara() {
        System.out.println("Hewan ini bersuara.");
    }
}

// Subkelas yang mewarisi dari kelas Hewan
class Kucing extends Hewan {
    // Konstruktor
    public Kucing(String jenis, int umur) {
        super(jenis, umur); // Memanggil konstruktor kelas induk (Hewan)
    }
    
    // Metode khusus untuk kelas Kucing
    public void bersuara() {
        System.out.println("Meong!");
    }
    
    // Metode tambahan untuk kelas Kucing
    public void tidur() {
        System.out.println("Kucing sedang tidur.");
    }
}

// Subkelas lain yang mewarisi dari kelas Hewan
class Anjing extends Hewan {
    // Konstruktor
    public Anjing(String jenis, int umur) {
        super(jenis, umur); // Memanggil konstruktor kelas induk (Hewan)
    }
    
    // Metode khusus untuk kelas Anjing
    public void bersuara() {
        System.out.println("Guk guk!");
    }
    
    // Metode tambahan untuk kelas Anjing
    public void berlari() {
        System.out.println("Anjing sedang berlari.");
    }
}

// Kelas utama untuk menjalankan program
public class index {
    public static void main(String[] args) {
        // Membuat objek kucing
        Kucing kucing = new Kucing("Persia", 3);
        System.out.println("Kucing jenis " + kucing.jenis + " berumur " + kucing.umur + " tahun.");
        kucing.bersuara(); // Memanggil metode dari subkelas Kucing
        kucing.tidur(); // Memanggil metode dari subkelas Kucing
        
        // Membuat objek anjing
        Anjing anjing = new Anjing("Bulldog", 5);
        System.out.println("Anjing jenis " + anjing.jenis + " berumur " + anjing.umur + " tahun.");
        anjing.bersuara(); // Memanggil metode dari subkelas Anjing
        anjing.berlari(); // Memanggil metode dari subkelas Anjing
    }
}
