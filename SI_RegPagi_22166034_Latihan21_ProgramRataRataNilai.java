/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166034_latihan21_programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 * Nama     : Nur Hidayah
 * Kelas    : PBO 021
 * NIM      : 22166034
 * Deskripsi Program : Program Rata-Rata Nilai
 */
public class SI_RegPagi_22166034_Latihan21_ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi variabel
        int jumlahMahasiswa = 0;
        int banyaknyaMahasiswa;
        double rataRata;
        
        // Input banyak nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        banyaknyaMahasiswa = input.nextInt();
        
        // Input nilai dan hitung jumlah nilai
        for (int i = 1; i <= banyaknyaMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            jumlahMahasiswa += nilai;
        }
        
        // Hitung rata-rata
        rataRata = (double) jumlahMahasiswa / banyaknyaMahasiswa;
        
        // Output rata-rata
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        
        // Developed by
        System.out.println("Developed by : Nur Hidayah");
    }
}
    
