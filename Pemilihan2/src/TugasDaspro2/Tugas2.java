package TugasDaspro2;
import java.util.Scanner;
public class Tugas2 {
    public static void main (String []Args){
    Scanner faris = new Scanner(System.in);
    String username,password;
    System.out.println("|-----LOGIN MAHASISWA-----|");
    System.out.println("Masukan Username:");
    username = faris.nextLine();
    
    if(username.equalsIgnoreCase("Mahasiswa")){
        System.out.println("Masukan Password:");
        password = faris.nextLine();
        if(password.equalsIgnoreCase("RaHaSiA")){
            System.out.println("Anda Berhasil Login");
        }
            else{
             System.out.println("Maaf, password salah");
                    }
        
        
    }
    else{
        System.out.println("Username Tidak Ditemukan");
    }
    }    
}
