import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        // Memasukkan ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = masukan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = masukan.nextInt();

        // Deklarasi matriks
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Input elemen matriks A
        System.out.println("\nMasukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = masukan.nextInt();
            }
        }

        // Input elemen matriks B
        System.out.println("\nMasukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = masukan.nextInt();
            }
        }

        // Proses penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("\nHasil Penjumlahan Matriks A + Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

        masukan.close();
    }
}
