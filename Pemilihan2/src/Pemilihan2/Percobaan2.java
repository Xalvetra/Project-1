package Pemilihan2;
import java.util.Scanner;
public class Percobaan2 {
    public static void main(String [] Args){
        Scanner faris = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
    
        System.out.println("Masukkan kategori: ");
        kategori = faris.nextLine();
        System.out.println("Masukkan besarnya penghasilan: ");
        penghasilan = faris.nextInt();
        
        
        if(kategori.equalsIgnoreCase("pekerja")) {
           if (penghasilan <=0) {
               System.out.println("penghasilan Yang anda masukkan salah");
           }
           else if(penghasilan <=2000000){
               pajak = 0.1;
           }
           else if (penghasilan<= 3000000){
               pajak = 0.15;
           }
           else {
               pajak = 0.2;
           }
           gajiBersih = (int) (penghasilan - (penghasilan*pajak));
           System.out.println("Gaji bersih yang anda terima" +gajiBersih);
        }
       
        else if(kategori.equalsIgnoreCase("pebisnis")){
             if (penghasilan <=0) {
               System.out.println("penghasilan yang anda masukkan salah");
           }
            else if (penghasilan <=2500000){
                pajak = 0.15;
            }
            else if(penghasilan <=3500000){
                pajak = 0.2;
            }
            else{
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan-(penghasilan*pajak));
            System.out.println("Gaji bersih yang anda terima: "+ gajiBersih);
        }
        else {
            System.out.println("Kategori yang Anda masukkan salah");
        }
    }
    
}
