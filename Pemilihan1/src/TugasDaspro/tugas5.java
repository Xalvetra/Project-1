package TugasDaspro;
import java.util.Scanner;
public class tugas5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double total_belanja, diskon = 0, harga_akhir;
        
        System.out.println("Masukkan total belanja anda :");
        total_belanja=input.nextInt();
        
        if(total_belanja>1000000){
            diskon = 0.1 * total_belanja ;
            harga_akhir =  total_belanja - diskon ;
            System.out.println("anda mendapat potongan member Silver sebesar 2%");
            System.out.println("Total belanja anda adalah: Rp." +total_belanja);
            System.out.println("Potongan diskon member adalah: Rp." +diskon);
            System.out.println("Total Bayar anda adalah : Rp." +harga_akhir);
        }
        
        else if(total_belanja>500000){
           diskon = 0.2 * total_belanja ;
            harga_akhir =  total_belanja - diskon ;
            System.out.println("anda mendapat potongan member Gold sebesar 5%");
            System.out.println("Total belanja anda adalah: Rp." +total_belanja);
            System.out.println("Potongan diskon member adalah: Rp." +diskon);
            System.out.println("Total Bayar anda adalah : Rp." +harga_akhir); 
        }
        
        else if(total_belanja>200000){
           diskon = 0.05 * total_belanja ;
            harga_akhir =  total_belanja - diskon ;
            System.out.println("anda mendapat potongan member Platinum sebesar 10%");
            System.out.println("Total belanja anda adalah: Rp." +total_belanja);
            System.out.println("Potongan diskon member adalah: Rp." +diskon);
            System.out.println("Total Bayar anda adalah : Rp." +harga_akhir);
        }
        
        else{
            System.out.println("Total belanja anda masih kurang untuk mendapat diskon member");
            System.out.println("Total belanja anda adalah : Rp."+total_belanja);
        }
        
    }
    
}

