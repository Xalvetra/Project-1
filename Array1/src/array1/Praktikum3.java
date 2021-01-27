package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        int total = 0,siap;
        double rata1,rata2;
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        siap =faris.nextInt();
        int[] nilaiMHS = new int[siap];
        
        int  c=0, d=0, jumlah1=0, jumlah2=0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMHS[i] = faris.nextInt();
            
        }

        for (int i = 0; i < nilaiMHS.length; i++) {

            total += nilaiMHS[i];
            
            
            if(nilaiMHS[i] > 70){
               jumlah1 += nilaiMHS[i];
               c++;
        }       
            else{
               jumlah2 += nilaiMHS[i];
               d++; 
            }
        }

        rata1 =jumlah1/c;
        rata2 =jumlah2/d;
        
        System.out.println("Rata-rata Yg Lulus       : " +rata1);
        System.out.println("Rata-rata Yg Tidak Lulus : " +rata2);
        

    }

}
