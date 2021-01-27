package Pemilihan2;
import java.util.Scanner;
public class Percobaan1 {
    public static void main (String[]Args){
        Scanner faris =new Scanner (System.in);
        int nilai;
        System.out.println("Masukkan nilai ujian (0 - 100):");
        nilai = faris.nextInt();
  if (nilai >=0 || nilai <=100) {      
    
     if(nilai >= 90 && nilai <=100){
        System.out.println("Nilai A, EXCELLENT!");
    }
    else if(nilai >=85 && nilai <=89) {
        System.out.println("Nilai B+, pertahankan prestasi Anda!");       
    }
     else if(nilai >=80 && nilai <=84) {
        System.out.println("Nilai B, pertahankan prestasi Anda!");  
    }
    else if(nilai>=60 && nilai<=79){
        System.out.println("Nilai C,Tingkatkan prestasi Anda");
    }  
    else if(nilai >=50 && nilai <=59){
        System.out.println("Nilai D, tingkatkan belajar Anda!");
    }
    else   {
        System.out.println("Nilai E, Anda Tidak Lulus!");
    } 
    }

  else if (nilai <0) {
      System.out.println("Nilai yan anda masukkan kurang dari 0");
  }
  else if (nilai >100){
      System.out.println("Nilai yan anda masukkan lebih dari 100");
  }
  else {
      System.out.println("Nilai yang anda masukkan tidak valid");
  }
    }
    
}
