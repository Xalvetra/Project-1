package TugasDaspro2;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String []Args){
        Scanner Faris = new Scanner(System.in);
        double sisiA, sisiB = 0, sisiC = 0;
       
        System.out.println("Masukan Sisi Pertama :");
        sisiA = Faris.nextDouble();
        System.out.println("Masukan Sisi Kedua :");
        sisiB = Faris.nextDouble();
        System.out.println("Masukan Sisi Ketiga :");
        sisiC = Faris.nextDouble();
        
    if(sisiA == sisiB){
        if(sisiB == sisiC){
        System.out.println("Segitiga Sama Sisi ");
    }
        else{
        System.out.println("Segitiga Sama Kaki");
    }
    }
    else if(sisiB == sisiC){
        System.out.println("Segitiga Sama Kaki");
    }
    else if(sisiA == sisiC){
        System.out.println("Segitiga Sama Kaki");
    }
    else{
        System.out.println("Segitiga Sembarang");
    }
        
        
    }
    
}
