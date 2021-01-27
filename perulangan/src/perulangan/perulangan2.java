package perulangan;
import java.util.Scanner;
public class perulangan2 {
    public static void main(String[] args) {
        int angka, fac, i;
        Scanner faris = new Scanner(System.in);
        System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
        System.out.println("Masukan Bilangan : ");
        angka = faris.nextInt();
        fac = 1;
        i = 1;
        while (i<=angka)
        {
            fac = fac*i;
            i++;
        }
        System.out.printf("Nilai Faktorial Bilangan Tersebut Adalah : %d \n", fac);
                        
    
}
}