package perulangan2;

/**
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
import java.util.Random;

public class Quiz {

    public static void main(String[] Args) {

        Random bebas = new Random();
        Scanner faris = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = bebas.nextInt(10);
            boolean success = false;

            do {
                System.out.print("Tebak angka(1-10) : ");
                int answer = faris.nextInt();

                success = (answer == number);
                
                if(answer>number){
                    System.out.println("Angka Lebih kecil dari tebakan anda");
                }
                else if(answer<number){
                    System.out.println("Angka Lebih besar dari tebakan anda");
                }
                else{
                    System.out.println("Selamat Angka Anda Sesuai");
                }
   
                    
    
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = faris.next().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        System.out.println(bebas);
    }
}
