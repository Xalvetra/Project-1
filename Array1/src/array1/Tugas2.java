package array1;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Tugas2 {
   public static void main(String[] args) {
       Scanner faris = new Scanner(System.in);
       
       int bil,angka,urut;
       System.out.print("Masukan Jumlah Elemen Array :");
       bil = faris.nextInt();
       
       int array []= new int[bil];
       
       for(int i =0;i<array.length;i++){
           
           System.out.print("Masukkan Angka  Ke -"+i+" : ");
           angka = faris.nextInt();
           
           for(int j = 1 ; j<array.length;j++ ){
               if (array[j-1] > array[j]){
                   urut = array [j-1];
                   array [j-1] = array [j];
                   array [j] = urut;
               }
           }
       }
       System.out.println("Hasil Urutan :");
       for(int i =0;i<array.length;i++){
           
       }
       }

       
       
    }
    

