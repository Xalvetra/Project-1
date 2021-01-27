package Pemilihan;
    import java.util.Scanner;
    public class Percobaan4 {
        public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        
    System.out.println("Masukkan angka pertama :");
    angka1 = sc.nextInt();
    System.out.println("Masukkan Angka Kedua :");
    angka2 = sc.nextInt();
    System.out.println("Masukkan Angka (+ - * /) :");
    operator = sc.next().charAt(0);
    
        switch (operator)   {
		case '+' :
                hasil = angka1 + angka2;
		System.out.println(angka1 +"+"+ angka2 +"="+ hasil) ;
		break ;
		
		case 2 :
                     hasil = angka1 - angka2;
		System.out.println(angka1 +"-"+ angka2 +"="+ hasil) ;
		break ;
		
		case 3 :
                     hasil = angka1 * angka2;
		System.out.println(angka1 +"+"+ angka2 +"="+ hasil) ;
		break ;
		
		case 4 :
                     hasil = angka1 / angka2;
		System.out.println(angka1 +"+"+ angka2 +"="+ hasil);
		break ;
		
                default:
                System.out.println("Operator yang Anda masukkan salah"); 
		}
    
}
    }