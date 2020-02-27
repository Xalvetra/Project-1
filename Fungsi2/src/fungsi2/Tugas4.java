package fungsi2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Tugas4 {
  public static void main (String [] Args){
      Scanner faris = new Scanner(System.in);
      int hasil, angka1, angka2 ;
      System.out.print("Masukkan Angka 1 : ");
      angka1 = faris.nextInt();
      System.out.print("Masukkan Angka 2 : ");
      angka2 = faris.nextInt();
      hasil = FPB(angka1,angka2);
      System.out.println("FPB nya Adalah : " +hasil);
  }  
  static int FPB(int a ,int b){
      
    return (b == 0) ? a: FPB(b,a%b);  
  }
}
