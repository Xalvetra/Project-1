package quiz1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Quiz1 {

    Quiz1() {
    }

    public void Quiz1(char[] nama, char[] huruf) {                                   // Big O
        int[] count = new int[huruf.length];                                         // O(1)
        for (int i = 0; i < 16; i++) {                                               // O(n)= O(16)
            for (int j = 0; j < 10; j++) {                                           // O(n)= O(10)
                if (nama[i] == huruf[j]) {                  
                    count[j] += 1;                                                   // O(1)*16
                }           
            }
        }
        System.out.print("Nama Saya : ");                                           //O(1)
        for (char i : nama) {                                                       //O(n) = O(16)
            System.out.print(nama);                                                 //O(1)
            break;                                                                  //O(1)  
        }
        System.out.println("");                                                     //O(1)

        for (int i = 0; i < 10; i++) {                                              //O(n)= O(10)
            System.out.println(huruf[i] + " = " + count[i]);                        //O(1)
        }                                                                           // Total Big O = 1+10*16*16+1+16+1+10 = 2589
    }                                                                               // Notasi Big O = O(n)
}