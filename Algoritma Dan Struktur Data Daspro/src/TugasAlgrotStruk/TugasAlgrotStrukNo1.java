package TugasAlgrotStruk;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TugasAlgrotStrukNo1 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int pilih, jumlah, pesan, bayar, kembalian, harga_akhir = 01, harga_ayam;
        System.out.println("==== JENIS PAKET ====");
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket OKE");
        for (String i = "Y"; i.equals("Y") || i.equals("y");) {
            System.out.print("Masukkan JENIS PAKET Anda (1-2) : ");
            pilih = faris.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda Memilih Paket Chicken");
                    System.out.println("==========================");
                    System.out.println("1. Chicken A Rp. 12.000");
                    System.out.println("2. Chicken B Rp. 15.000");
                    System.out.println("3. Chicken C Rp. 20.000");
                    System.out.print("Masukkan JENIS CHICKEN Anda(1-3) : ");
                    int pilihChi = faris.nextInt(); 
                    switch (pilihChi) {

                        case 1:
                            System.out.println(">>> Pesanan Anda : Chicken A <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 12000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        case 2:
                            System.out.println(">>> Pesanan Anda : Chicken B <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 15000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        case 3:
                            System.out.println(">>> Pesanan Anda : Chicken C <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 20000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        default:
                            System.out.println("Maaf Sistem Tidak Mengenali Pesanan Anda");

                    }
                    break;
                case 2:
                    System.out.println("Anda Memilih Paket OKE");
                    System.out.println("==========================");
                    System.out.println("1. OKE A Rp. 10.000");
                    System.out.println("2. OKE B Rp. 12.000");
                    System.out.println("3. OKE C Rp. 15.000");
                    System.out.print("Masukkan JENIS OKE Anda(1-3) : ");
                    int pilihOKE = faris.nextInt();
                    switch (pilihOKE) {

                        case 1:
                            System.out.println(">>> Pesanan Anda : OKE A <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 10000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        case 2:
                            System.out.println(">>> Pesanan Anda : OKE B <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 12000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        case 3:
                            System.out.println(">>> Pesanan Anda : OKE C <<<");
                            System.out.print("Masukan Jumlah Pesanan Anda : ");
                            jumlah = faris.nextInt();
                            harga_ayam = 15000 * jumlah;
                            harga_akhir = harga_akhir + harga_ayam;
                            break;

                        default:
                            System.out.println("Maaf Sistem Tidak Mengenali Pesanan Anda");

                    }
            }
            System.out.print("Apakah anda mau melanjutkan? Y/T : ");
            i = faris.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total Pembayaran Sebesar : Rp." + harga_akhir );
        System.out.println("Terimakasih atas kunjungannya.");

    }
}
