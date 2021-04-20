package Soal_Uts;

import java.util.Scanner;
public class Soal_Nomor3 {
     public static void main (String[] args) {
        System.out.println("Agung Budi");
        int i, j, m, n;
        int matrix[][] = new int [10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks A: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        n = scan.nextInt();
        System.out.println("masukkan elemen matriks A: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks A: ");
        for (i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil transpose matriks A: ");
        for(i = 0; i<n; i++){
            for(j = 0; j<m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Masukkan jumlah baris matriks B: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        n = scan.nextInt();
        System.out.println("masukkan elemen matriks B: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks B: ");
        for (i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Hasil transpose matriks B: ");
        for(i = 0; i<n; i++){
            for(j = 0; j<m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
