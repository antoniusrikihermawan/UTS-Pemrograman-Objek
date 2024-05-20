


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-2
 */

import java.util.Scanner;

public class utsPBO {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|                             |");
        System.out.println("|       UTS 20 MEI 2024       |");
        System.out.println("|Nama : Antonius Riki Hermawan|");    
        System.out.println("|      NIM : 23201115         |");
        System.out.println("| Pemrograman Berbasis Objek  |");
        System.out.println("|                             |");
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        
        System.out.println("Masukkan nama anda : ");
        String nama = scanner.nextLine();
        
        System.out.println("Pilih jenis kelamin (1) Laki-laki (2) Perempuan");
        byte jenisKelamin = scanner.nextByte();
        scanner.nextLine();
        
        String panggilNama = (jenisKelamin==1) ? "Mas" : "Mbak";
        
        System.out.println("Selamat datang " + panggilNama + " " + nama);
        
        System.out.println("Selamat Datang di Program Kalkulator");
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("Masukkan bilangan Pertama : ");
            double bilangan1 = scanner.nextDouble();
            
            System.out.println("Masukkan bilangan Kedua : ");
            double bilangan2 = scanner.nextDouble();
            
            System.out.println("Masukkan Operator (+, -, *, /) : ");
            char operator = scanner.next().charAt(0);
            
            double hasil = 0;
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Error : Pembagian dengan nol tidak di izinkan");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid, Pilih operator yang valid");
                    continue;
            }
            
            System.out.println("Hasil : " + hasil);
                    
            System.out.println("Apakah ingin melanjutkan program ? (y/n) : ");
            char pilihan = scanner.next().charAt(0);
            
            if (pilihan != 'n' && pilihan != 'N') {
            } else {
                lanjut  = false;
            }
        }
        
        System.out.println("Terimakasih telah menggunakan program Kalkulator");
        
    } 
}
