import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.tampilkanMenu();
    }
}

class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("=== Masak apa hari ini chef? ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Ayam Goreng");
            System.out.println("3. Sate");
            System.out.println("4. Ayam Bakar");
            System.out.println("0. Tekan 0 untuk exit");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan karakter baru (\n) setelah membaca nomor

                prosesPilihanMenu(pilihan);
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // Membersihkan input yang tidak valid
            }
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan program ini!");
    }

    private void prosesPilihanMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Hari ini memasak Nasi Goreng");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 1
                break;
            case 2:
                System.out.println("Hari ini memasak Ayam Goreng");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 2
                break;
            case 3:
                System.out.println("Hari ini memasak Sate");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 3
                break;
            case 4:
                System.out.println("Hari ini memasak Ayam Bakar");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 4
                break;
            case 0:
                System.out.println("Keluar dari program...");
                return; // Langsung keluar dari metode untuk menghentikan loop di tampilkanMenu
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        // Menampilkan pilihan untuk melanjutkan atau keluar
        int subPilihan = -1;
        while (subPilihan != 0) {
            System.out.println("Apakah Anda ingin:");
            System.out.println("1. Lanjutkan memasak");
            System.out.println("0. Udah bang capek");

            if (scanner.hasNextInt()) {
                subPilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan karakter baru (\n) setelah membaca nomor

                if (subPilihan == 1) {
                    return; // Kembali ke menu utama
                } else if (subPilihan == 0) {
                    System.out.println("Keluar dari program...");
                    System.exit(0); // Menghentikan program
                } else {
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka.");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // Membersihkan input yang tidak valid
            }
        }
    }
}
