package perulangan;
import java.util.Scanner;
public class perulangan5 {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int angka, b;
        System.out.println("====PROGRAM LOOP DENGAN BREAK====");
        b=0;
        while (true){
            System.out.print("Masukkan Bilangan :");
            angka = faris.nextInt();
            b += angka;
            if (b>50)
                break;
        }
        System.out.printf("Angka berhenti pada jumlah angka : %d \n", b);
  
            }
}
