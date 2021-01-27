package Latihan;

import java.util.Scanner;
public class Test1 {
    public static void main (String [] Args) {
        Scanner sc = new Scanner(System.in);
        int suhu;
        char hujan;
        
    System.out.println("Masukkan Suhu:");
    suhu = sc.nextInt();
    
    
    
    if(suhu>27){
        System.out.println("Memakai Dress");
        
        System.out.println("Apakah Hujan:");
        hujan = sc.next().charAt(0);
        
        if(hujan == 'y'){
            System.out.println("Membawa Payung");
        }
        else {
            System.out.println("Memakai Sunscreen");
        }
    
    }
    else
      System.out.println("Memakai Celana Panjang");
    
   
        
    }
}
