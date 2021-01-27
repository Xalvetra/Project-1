package TugasDaspro;
import java.util.Scanner;
public class tugas4 {
   public static void main (String [] Args){
        Scanner input = new Scanner(System.in);
        int pilih,jumlah,pesan,bayar,kembalian,harga_akhir = 01,harga_ayam;
        double pajak ;
        
   System.out.println("1. Ayam Geprek - Rp.100.000");
     System.out.println("2. Ayam Goreng - Rp.80.000");
         System.out.println("3. Bebek Geprek - Rp.150.000");
            System.out.println("Masukan pilihan anda (1-3)");
             pesan = input.nextInt();
              System.out.println("###################################");
               System.out.println("Masukan Jumlah Pesanan Anda:");
                jumlah = input.nextInt();
                    System.out.println("###################################");
                    
                    
   switch(pesan) {
      
       case 1:
       System.out.println("Pesanan Anda : Ayam Geprek");
       System.out.println("Jumlah Pesanan Anda :"+jumlah);
       harga_ayam = 100000 * jumlah;
       pajak = 0.1 * harga_ayam ;
       harga_akhir = (int) (harga_ayam + pajak );
       System.out.println("Harga Yang Harus Dibayar: Rp."+harga_akhir);
       break;
       
       case 2 :
       System.out.println("Pesanan Anda : Ayam Goreng");
       System.out.println("Jumlah Pesanan Anda :"+jumlah);
       harga_ayam = 80000 * jumlah;
       pajak = 0.1 * harga_ayam ;
       harga_akhir = (int) (harga_ayam + pajak );
       System.out.println("Harga Yang Harus Dibayar: Rp." +harga_akhir);
       break;
       
       case 3 :
       System.out.println("Pesanan Anda : Ayam Geprek");
       System.out.println("Jumlah Pesanan Anda :"+jumlah);
       harga_ayam = 150000 * jumlah;
       pajak = 0.1 * harga_ayam ;
       harga_akhir = (int)(harga_ayam + pajak );
       System.out.println("Harga Yang Harus Dibayar: Rp." +harga_akhir);
       break;
       
       default :
        System.out.println("Maaf Sistem Tidak Mengenali Pesanan Anda");
           
   }
   
   
   System.out.println("###################################");
   System.out.println("Bayar: ");
   bayar = input.nextInt();
   kembalian = bayar - harga_akhir ;
   System.out.println("Kembalian : Rp." +kembalian);
           
}
}