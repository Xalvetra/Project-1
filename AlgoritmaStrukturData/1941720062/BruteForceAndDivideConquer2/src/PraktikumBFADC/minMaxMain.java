package PraktikumBFADC;
import static PraktikumBFADC.minMax.max_min;
import java.util.Scanner;
public class minMaxMain {
         static minMax[] ppArray = new minMax[5];

    public static void main(String[] args) {
        ppArray[0] = new minMax();
        int [] nilaiArray = new int[5];
        Scanner faris = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai Array Indeks Ke-" + i);
            System.out.print("Masukkan Nilai : ");
            nilaiArray [i] = faris.nextInt();
        }
//        int min = ppArray[0].nilaiArray;
//        int max = ppArray[0].nilaiArray;
//        for (int i = 0; i < 5; i++) {
//            if (ppArray[i].nilaiArray < min) {
//                min = ppArray[i].nilaiArray;
//            } else if (ppArray[i].nilaiArray > max) {
//                max = ppArray[i].nilaiArray;
//            }
//
//        }
//        int arr []  = new int [5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = ppArray[i].nilaiArray;
//        }
        minMax Hasil = new minMax();
        Hasil.minmaxBruteForce(nilaiArray);
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal  : " +Hasil.min);
        System.out.println("Nilai Maksimal : " + Hasil.max);
        
       
        maxMin hasil = new maxMin();
        max_min(nilaiArray, 0, 4, hasil);
        System.out.println("Divide Conquer");
        System.out.println("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimal : " + hasil.maximum);
        System.out.println("\n");
    }
}