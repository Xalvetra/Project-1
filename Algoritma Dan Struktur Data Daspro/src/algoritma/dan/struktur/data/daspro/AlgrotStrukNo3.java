package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo3 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.println("Masukkan Bilangan Yang Anda Inginkan = ");
        int A, hasil;
        A = faris.nextInt();

        for (int i = 5; i > 0; i--){
                A-=3;      
                
        }
        if(A % 2 == 0){
        System.out.println(A+ " Hasil Akhir Bilangan Anda Termasuk Bilangan Genap");
        }else{
            System.out.println(A+ " Hasil AkhirBilangan Anda Termasuk Bilangan Ganjil");
        }
        
    }
}