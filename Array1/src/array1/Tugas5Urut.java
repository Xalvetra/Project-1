package array1;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Tugas5Urut {
    public static void main(String [] Args){
        Scanner faris = new Scanner(System.in);
        
        System.out.print("Masukkan Isi Array : ");
        int bil = faris.nextInt();
        int urut;
        
        int array[] = new int[bil];
        
        for (int i=0;i<array.length;i++){
            System.out.print("Masukkan Array Ke-"+i+" :");
            array[i]=faris.nextInt();
        }
        for (int i=0;i<array.length;i++){
            for(int j=1 ;j<array.length;j++){
                if (array[j-1]>array[j]){
                 urut = array[j-1];
                 array [j-1] = array[j];
                 array[j] = urut;
                }
            }
        }
            System.out.println("Angka Terbesar Adalah : "+array[bil-1] );
        }
    }