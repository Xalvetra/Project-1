package testfaris;
import java.util.Scanner;
/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasDaspro3 {
    public static void main(String [] Args){
        Scanner faris = new Scanner(System.in);
        
        int angka[] = new int[6];
        int i ;
        for (i=1; i<angka.length; i++){
            System.out.print("Masukan Angka Yang Anda Inginkan Ke-"+i+ ": ");
            angka[i] = faris.nextInt();
        }
        for (i=5 ; i>0 ;i--){
            System.out.println("Angka Yang Anda Masukan Ke-"+i+" Adalah  "+angka[i]);
        }
    }
    
}

    

