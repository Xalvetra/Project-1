package TugasDaspro2;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String []Args){
        Scanner faris =new Scanner(System.in);
        String namaMakanan;
        int jenisPengiriman,hargaMakanan,total;
        
    System.out.println("|------MakanYUK-----|");
    System.out.print("Masukkan Jenis Makanan :");
    namaMakanan = faris.nextLine();
    System.out.print("Masukkan Harga Makanan :");
    hargaMakanan = faris.nextInt();
    
    System.out.println("::::::: Apakah Anda ingin pengiriman ekspres"+"  (0 = Tidak, 1 = Ya) :::::::");
    System.out.print("Masukkan Jenis Pengiriman :");
    jenisPengiriman = faris.nextInt();
    System.out.println("=======Struk Pembayaran=======");
    
        if(jenisPengiriman == 0 ){
            if(hargaMakanan < 100000){
                System.out.println("Biaya Pengiriman Ekspedisi Anda \tRp.20.000");
                System.out.println(namaMakanan+("\t\t\t\tRp.")+ hargaMakanan);
                total = hargaMakanan + 20000;
                System.out.println("TOTAL BIAYA ANDA SEMUA \t\tRp." +total);
            }
            else{
                System.out.println("Biaya pengiriman Ekspedisi Anda \tRp.30.0000");
                System.out.println(namaMakanan+("\t\t\t\tRp.")+ hargaMakanan);
                total = hargaMakanan + 30000;
                System.out.println("TOTAL BIAYA ANDA SEMUA \t\tRp." +total);
            }
        }
            
        else{
            if(hargaMakanan < 100000){
                System.out.println("Biaya Pengiriman Ekspedisi Anda \tRp.45.000");
                System.out.println(namaMakanan+("\t\t\t\tRp.")+ hargaMakanan);
                total = hargaMakanan + 45000;
                System.out.println("TOTAL BIAYA ANDA SEMUA Rp." +total);
            }
            else{
                System.out.println("Biaya Pengiriman Ekspedisi Anda \tRp.55.000");
                System.out.println(namaMakanan+("\t\t\t\tRp.")+ hargaMakanan);
                total = hargaMakanan + 55000;
                System.out.println("TOTAL BIAYA ANDA SEMUA \t\tRp." +total);
            }
        }
    
        

        
    }
}