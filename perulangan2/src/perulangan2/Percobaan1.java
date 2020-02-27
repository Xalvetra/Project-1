package perulangan2;
/**
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Percobaan1 {
    public static void main(String [] Args){
        Scanner faris = new Scanner(System.in);
        int N,i;
        System.out.print("Masukan Nilai N = ");
        N = faris.nextInt();
        
        for(i=1; i<=N; i--){
            System.out.print("*");
        }
    }
    
}
