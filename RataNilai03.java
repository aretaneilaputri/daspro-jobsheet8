import java.util.Scanner;

public class RataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j = 1;
        float nilai, totalNilai, rataNilai;

        for (i=1; i<=5; i++) {
        totalNilai=0;
        System.out.println("  Input Nilai Mahasiswa ke " + i);
                for (j=1; j<=5; j++) {
                    System.out.print("Nilai ke-" + j + "=");
                    nilai = sc.nextFloat();
                    totalNilai += nilai;
                }
            rataNilai = totalNilai / 5;
            System.out.println("  Rata-rata nilai mahasiswa ke " + i + " = " + rataNilai);
        }
    }
}
