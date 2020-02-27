package perulangan2;
import java.util.Scanner;
public class SegitigaSikuSiku {

    public static void main(String[] args) {
        Scanner faris_irul =new Scanner(System.in);
        int baris, x, y;
        System.out.print("Masukan Jumlah Baris Yang Anda Inginkan: ");
        baris = faris_irul.nextInt();
                
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris; j++) {
                y = i + j;
                x = baris+1 ;
                if (x <= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
  