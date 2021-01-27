package quiz1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Quiz1No2Main {

    public static void main(String[] Args) {                                       // Big O                                 
        char huruf[] = {'a', 'f', 'h', 'i','k', 'l', 'q', 'r', 's', 'u'};          //O(1)
        Quiz1No2 hrf = new Quiz1No2();                                             //O(1)
        hrf.Quiz1No2BF(hrf.nama, huruf);                                           //O(1)
        System.out.println("Menggunakan Brute Force");                             //O(1)
        System.out.println("Hasil nya Adalah");                                    //O(1)
        System.out.println("Huruf Terkecil : " + hrf.hurufTerkecil);               //O(1)
        System.out.println("Huruf Terbesar : " + hrf.hurufTerbesar);               //O(1)
        hrf.Quiz1No2DC(hrf.nama , 0, hrf.nama.length-1,hrf);                       //O(1)
        System.out.println("Menggunakan Divide & Conquer");                        //O(1)       
        System.out.println("Huruf Terkecil : " + hrf.hurufTerkecilDC);             //O(1)    
        System.out.println("Huruf Terbesar : " + hrf.hurufTerbesarDC);             //O(1)
    }                                                                              // Total Big O = 11
}                                                                                  // Notasi Big O = O(1)

