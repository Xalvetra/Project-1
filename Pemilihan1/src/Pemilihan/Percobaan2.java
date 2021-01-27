package Pemilihan;

import java.util.Scanner;
public class Percobaan2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1,nilai2,rata2;
        System.out.println("Masukan Sebuah Bilangan 1:");
        nilai1 = input.nextInt();
        System.out.println("Masukan Sebuah Bilangan 2:");
        nilai2 = input.nextInt();
        
        rata2 = (nilai1+nilai2)/2;
        
        if(rata2>=100){
            rata2-=5;
          
        }
        else{
            System.out.println(rata2);
        }
  System.out.println("Hasil Nilai Akhir adalah" +rata2);
}
}