

package perulangan;

import java.util.Scanner;

public class Perulangan3 {

    public static void main(String[] args) {
        int angka, fac, i;
        Scanner faris = new Scanner(System.in);
        System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
        System.out.println("Masukan Bilangan : ");
        angka = faris.nextInt();
        
        fac=1;
        i=1;
        do{
         fac=fac*i;
         i++;
        }
        while(i<=angka);
        System.out.printf("Nilai Faktorial Bilangan Tersebut Adalah : %d \n", fac);


    }

}
