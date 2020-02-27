package fungsi2;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Percobaan3 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal, tahun;
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = input.nextInt();
        System.out.print("Lamanya menabung (tahun): ");
        tahun = input.nextInt();

        System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, (int) tahun));
    }static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungBunga(saldo, tahun - 1);
        }
    }
}