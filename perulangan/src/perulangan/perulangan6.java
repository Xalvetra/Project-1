package perulangan;
import java.util.Scanner;
public class perulangan6 {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int angka, b;
        System.out.println("====PROGRAM LOOP DENGAN BREAK====");
        b=0;
        do
        {
            System.out.print("Masukkan Bilangan :");
            angka = faris.nextInt();
            b += angka;
            if (b>50)
                break;
        }
        while(true);
        System.out.printf("Angka berhenti pada jumlah angja : %d \n", b);

    }
}
