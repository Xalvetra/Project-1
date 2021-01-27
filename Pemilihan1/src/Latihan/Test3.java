package Latihan;

import java.util.Scanner;
public class Test3 {
    public static void main(String [] Args, String String) {
    Scanner sc = new Scanner(System.in);
        
       String jenis,novel = null,komik = null;
       double diskon1,diskon2;
       double biaya1,biaya2;
       int jumlah;
       int hargaNovel=100000;
       int hargaKomik=75000;
       int hargaBuku=25000;
       
       
     System.out.println("Apa Jenis Buku Anda");
     jenis = sc.nextLine();
    
     System.out.println("Masukkan Jumlah Buku Yang Anda Beli");
     jumlah = sc.nextInt();
       
     
     if(jenis == novel) {
         diskon1 = 0.07*hargaNovel*jumlah;
         biaya1=(hargaNovel*jumlah)- diskon1;
         
         System.out.println(biaya1);
         
         if (jumlah>3){
             diskon2 = 0.02 * biaya1 ;
             biaya2 = biaya1*diskon2;
             
             System.out.println("Biaya yang anda bayar" +biaya2);
         }
         else {
              System.out.println(biaya1);
                     }
          }
     else if (jenis == komik){
         diskon1 = 0.05 *hargaKomik * jumlah;
         biaya1 = (hargaKomik*jumlah)-diskon1;
         System.out.println(biaya1);
         
         if(jumlah>3){
         diskon2 = 0.02*biaya1;
         biaya2 = biaya1 - diskon2;
         System.out.println(biaya2);
         }
         else{
         diskon2 = 0.01*biaya1;
         biaya2 = biaya1 - diskon2;
         System.out.println(biaya2);
                 }
         }
     else{
         
         if(jumlah > 10){
             
         }     
             }
     
         
     
     
     
    
    }
}

