import java.util.Scanner;

public class PersegiAngka03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan nilai N (minimal 3): ");
            int n = input.nextInt();

            if (n < 3) {
                System.out.println("Nilai N minimal adalah 3!");
            } else {
                // Bagian atas persegi
                for (int i = 1; i <= n; i++) {
                    System.out.print(n + " ");
                }
                System.out.println();

                // Bagian tengah persegi
                for (int i = 1; i <= n - 2; i++) {
                    System.out.print(n + " "); // sisi kiri
                    for (int j = 1; j <= n - 2; j++) {
                        System.out.print("  "); // bagian dalam kosong
                    }
                    System.out.println(n); // sisi kanan
                }

                // Bagian bawah persegi
                for (int i = 1; i <= n; i++) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }

            System.out.print("\nApakah ingin mengulang program? (y/t): ");
            ulang = input.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}
