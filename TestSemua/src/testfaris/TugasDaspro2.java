package testfaris;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class TugasDaspro2 {
    public static void main(String [] Args){
        Scanner faris = new Scanner(System.in);
        
        int angka[] = new int[8];
        int i ;
        for (i=1; i<angka.length; i++){
            System.out.print("Masukan Angka Yang Anda Inginkan Ke-"+i+ ": ");
            angka[i] = faris.nextInt();
        }
        for (i=1 ; i<angka.length;i++){
            System.out.println("Angka Yang Anda Masukan Ke-"+i+" Adalah  "+angka[i]);
        }
    }
    
}