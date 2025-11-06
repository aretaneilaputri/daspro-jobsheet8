import java.util.Scanner;

public class DataAtlet03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoltek = input.nextInt();
        input.nextLine();

        System.out.println("\n=== INPUT DATA ATLET PORSENI 2024 ===");

        // Perulangan untuk setiap politeknik
        for (int p = 1; p <= jumlahPoltek; p++) {
            System.out.print("\nMasukkan nama politeknik ke-" + p + ": ");
            String namaPoltek = input.nextLine();

            System.out.println("\n--- Input Data Atlet untuk " + namaPoltek + " ---");

            // Perulangan untuk 4 cabang olahraga
            for (int i = 1; i <= 4; i++) {
                String cabor = "";

                // Menentukan nama cabang olahraga
                if (i == 1) {
                    cabor = "Badminton";
                } else if (i == 2) {
                    cabor = "Tenis Meja";
                } else if (i == 3) {
                    cabor = "Basket";
                } else if (i == 4) {
                    cabor = "Bola Voli";
                }

                System.out.println("\nCabang " + cabor + " (" + namaPoltek + "):");
                System.out.println("Masukkan 5 nama atlet untuk cabang ini:");

                String n1, n2, n3, n4, n5;
                System.out.print("  Nama atlet ke-1: ");
                n1 = input.nextLine();
                System.out.print("  Nama atlet ke-2: ");
                n2 = input.nextLine();
                System.out.print("  Nama atlet ke-3: ");
                n3 = input.nextLine();
                System.out.print("  Nama atlet ke-4: ");
                n4 = input.nextLine();
                System.out.print("  Nama atlet ke-5: ");
                n5 = input.nextLine();

                // Output langsung untuk cabang tersebut
                System.out.println("\n=== Daftar Atlet Cabang " + cabor + " (" + namaPoltek + ") ===");
                System.out.println("1. " + n1);
                System.out.println("2. " + n2);
                System.out.println("3. " + n3);
                System.out.println("4. " + n4);
                System.out.println("5. " + n5);
                System.out.println("-----------------------------------------");
            }

        }

        System.out.println("\nTotal politeknik yang berpartisipasi: " + jumlahPoltek);
        System.out.println("Program selesai. Terima kasih!");

        input.close();
    }
}
