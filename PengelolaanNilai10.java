import java.util.Scanner;

public class PengelolaanNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            input.close();
            return;
        }
        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi, terendah;
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;
        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("\nHASIL NILAI MAHASISWA");

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) +
                    ": " + nilai[i] + " (" + status + ")");
        }
        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}