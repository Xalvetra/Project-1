package perulangan;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        int angka, fac, i;
        Scanner faris = new Scanner(System.in);
        System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
        System.out.println("Masukan Bilangan : ");
        angka = faris.nextInt();
        fac =1;
        for (i=1; i<=angka;i++){
            fac = fac*i;
        }
        System.out.printf("Nilai Faktorial Bilangan Tersebut Adalah : %d \n", fac);
        

    }
    
}
