package perulangan;
import java.util.Scanner;
public class perulangan4 {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int angka, b;
        System.out.println("====PROGRAM LOOP DENGAN BREAK====");
        for (b=0; true;)
        {
        System.out.print("Masukkan Bilangan :");
        angka = faris.nextInt();
        b += angka;
        
        if (b>50) 
            break;
        }
       System.out.printf("Angka berhenti pada jumlah angka : %d \n", b);

    }
}