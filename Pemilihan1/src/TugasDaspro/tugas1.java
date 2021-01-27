package TugasDaspro;
import java.util.Scanner;
    public class tugas1 {
        public static void main (String [] Args){
            Scanner input = new Scanner(System.in);
            int angka1,angka2;
            
         System.out.println("Masukan Bilangan 1 :");
         angka1 = input.nextInt();
         System.out.println("Masukan Bilangan 2 :");
         angka2 = input.nextInt();
         
         if(angka1>angka2) {
            System.out.println(angka1);
         }
         else{
             System.out.println(angka2);
         }
    
}
    }
