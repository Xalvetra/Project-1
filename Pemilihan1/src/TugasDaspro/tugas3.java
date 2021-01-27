package TugasDaspro;
import java.util.Scanner;
    public class tugas3 {
      public static void main (String [] Args){
        Scanner input = new Scanner(System.in);
        int kuis,uas,uts,tugas;
        double nilai;
        
             System.out.println("Masukkan Nilai Kuis Anda:");
        kuis = input.nextInt();
             System.out.println("Masukkan Nilai UAS Anda:");
        uas = input.nextInt();
             System.out.println("Masukkan Nilai TUGAS Anda:");
        tugas = input.nextInt();
            System.out.println("Masukkan Nilai UTS Anda:");
        uts = input.nextInt();
         
        nilai =(0.4*uas)+(0.3*uts)+(0.1*kuis)+(0.2*tugas); 
        
        if(nilai>65){
            System.out.println("Anda Tidak remidi");
        }
        else{
            System.out.println("Anda Remidi");
        }
}
}