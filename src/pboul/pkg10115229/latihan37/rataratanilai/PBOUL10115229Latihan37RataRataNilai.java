/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan37.rataratanilai;

import java.util.*;

/**
 *
 * @author Lukman
 * NIM      : 10115229   
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int array[], i, n;
    array = new int[100];
    float rata, total=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Mahasiswa: ");
    n = scan.nextInt();
    for(i = 1; i <= n; i++){
      System.out.print("Nilai Mahasiswa Ke-"+ i +" : ");
      array[i] = scan.nextInt();
      total = total + array[i];
    }
    rata = total/n;
    System.out.println("Hasil nilai total adalah : " + total);
    System.out.println("Hasil rata-rata adalah : " + rata);
    
    System.out.println("");
    System.out.println("  develop BY: Muhammad Lukman Hakim ");

    }
    
    
}
