package perulangan;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        int angka,bilgen ,terbagi, nomor,rata2,jumlah = 0;
        Scanner faris = new Scanner(System.in);
        System.out.println("==== SumAvgGenap ====");
        System.out.print("Masukan Range Bilangan Bulat : ");
        angka  = faris.nextInt();
        terbagi = angka/2;
        System.out.println("Banyaknya Bilangan genap dari 1 sampai "
        +angka+" adalah "+terbagi); 
        
       for (nomor = 1 ,bilgen = 2 ; nomor <= (angka/2) ;nomor++ , bilgen +=2)
       {
           System.out.println("Bilangan genap Ke-"+nomor+ " adalah " +bilgen);
           jumlah += bilgen;
       }
       rata2 = jumlah / terbagi;
       System.out.println("Jumlah bilangan ganjil dari 1 sampai "+angka+" = " +jumlah);
       System.out.println("Rata-rata bilangan genap dari 1 sampai "+angka+" = " +rata2  );
       
        

    }
}