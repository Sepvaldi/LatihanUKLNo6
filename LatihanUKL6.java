import java.util.Scanner;

public class LatihanUKL6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan jumlah baris matriks: ");
    int baris = input.nextInt();
    System.out.println("Masukkan jumlah kolom matriks: ");
    int kolom = input.nextInt();

    int[][] matriks1 = new int[baris][kolom];
    System.out.println("Masukkan elemen matriks pertama: ");
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("matriks1 [" + i + "][" + j + "]: ");
            matriks1[i][j] = input.nextInt();
        }
        
    }

    int[][] matriks2 = new int[baris][kolom];
    System.out.println("Masukkan elemen matriks kedua: ");
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("matriks2 [" + i + "][" + j + "]: ");
            matriks2[i][j] = input.nextInt();
        }
    }

    int[][] hasilPenjumlahan = new int[baris][kolom];
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            hasilPenjumlahan[i][j] = matriks1[i][j] + matriks2[i][j];
        }
    }
    System.out.println();
    System.out.println("Hasil penjumlahan matriks:");
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print(hasilPenjumlahan[i][j] + " ");
        }
        System.out.println();
    }
        input.close();
    }

}
