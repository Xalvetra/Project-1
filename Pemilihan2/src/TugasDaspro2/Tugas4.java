package TugasDaspro2;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String []Args){
      Scanner faris = new Scanner(System.in);
         int menu,pilih,alas, tinggi, sisi,jari2;
         double volume,luas;
         char pilihan;
      
      System.out.println("=====BANGUN DAN RUANG=====");
      
      System.out.println("| 1. Luas | 2.Volume |");
      System.out.print("Masukkan Pilihan Anda 1 atau 2 :");
      menu = faris.nextInt();
   
      if(menu == 1){
        System.out.println("| a.Persegi | b.Segitiga |");
        System.out.print("Masukkan Pilihan Anda a atau b :");
        pilihan = faris.next().charAt(0);
        if (pilihan == 'a'){
        System.out.println("== Anda Memilih Persegi ==");
        System.out.print("Masukkan Sisi Yang Anda Inginkan : ");
        sisi = faris.nextInt();
        luas = sisi * sisi;
        System.out.print("Luas Persegi Anda Adalah : " +luas);   
        }
        else if(menu == 2){
            System.out.println("== Anda memilih Segitiga ==");
            System.out.print("Masukan Tinggi Yang Anda Inginkan : ");
            tinggi = faris.nextInt();
            System.out.print("Masukan Alas Yang Anda Inginkan : ");
            alas = faris.nextInt();
            luas = alas*tinggi/2;
            System.out.println("Luas Segitiga Anda : " +luas);
        }
        else{
             System.out.println("KODE YANG ANDA MASUKKAN SALAH");
        }
        
    }
      else if(menu == 2){
      System.out.println("| a.Kubus | b.Tabung |");
      System.out.print("Masukkan Pilihan Anda a atau b :");
      pilihan = faris.next().charAt(0);
      if(pilihan == 'a'){
       System.out.println("== Anda Memilih Kubus ==");
       System.out.print("Masukkan Sisi Kubus Anda :");
       sisi = faris.nextInt();
       volume = sisi*sisi*sisi;
       System.out.println("Hasil Perhitungan Volume : " +volume);
      }
      else if(pilihan == 'b'){
       System.out.println("== Anda Memilih Tabung ==");
       System.out.print("Masukkan Jari-Jari Tabung Anda :");
       jari2 = faris.nextInt();
       System.out.print("Masukkan Tinggi Tabung Anda :");
       tinggi = faris.nextInt();
       volume = jari2 * jari2 *3.14* tinggi;
       System.out.println("Hasil Perhitungan Volume :" +volume);  
      }
      else{
             System.out.println("Kode yang anda masukkan salah");
        }
    }
      else{
          System.out.println("Kode Yang Anda Masukkan Salah");
      }

    }
}
