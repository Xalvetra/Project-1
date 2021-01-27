package TugasDaspro;
import java.util.Scanner;
    
    public class tugas2 {
         public static void main (String [] Args){
             Scanner input = new Scanner(System.in);
             
             int umur;
             
             System.out.println("Masukkan Umur Anda:");
             umur = input.nextInt();
             
             if(umur>=17){
                 System.out.println("Anda Boleh Berkendara");
             }
             else{
                 System.out.println("Anda Belum Boleh Berkendara");
             }
        
    }
}
