package quiz1;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Quiz1No2 {                                                                                     // Big O
    public char[] nama = {'f', 'a', 'r', 'i', 's', 'i', 'k', 'h', 'l','a', 's', 'u', 'l', 'h', 'a', 'q'};   //O(1)
    public char hurufTerbesar, hurufTerkecil;                                                               //O(1)
    public char hurufTerbesarDC, hurufTerkecilDC;                                                           //O(1)
    Quiz1No2() {                                                                                            
    }
    public void Quiz1No2BF(char[] nama, char[] huruf) {
        char simpan;                                                                                        //O(1)
        int k = 0;                                                                                          //O(1)
        for (int i = 0; i < huruf.length; i++) {                                                            //O(n = O(10)
            for (int j = 0; j < nama.length; j++) {                                                         //O(n)= O(16)
                if (nama[j] == huruf[i]) {                                                                  //O(1)
                    simpan = nama[j];                                                                       //O(1)
                    nama[j] = nama[k];                                                                      //O(1)
                    nama[k] = simpan;                                                                       //O(1)
                    k += 1;                                                                                 //O(n)= O(16)
                }
            }
        }
        hurufTerkecil = nama[0];                                                                            //O(1)
        hurufTerbesar = nama[nama.length - 1];                                                              //O(1)
    }
    void Quiz1No2DC(char[] nama, int index_awal, int index_akhir, Quiz1No2 hrf) {
        int index_tengah;                                                                                   //O(1)
        Quiz1No2 hasil1 = new Quiz1No2();                                                                   //O(1)
        Quiz1No2 hasil2 = new Quiz1No2();                                                                   //O(1)
        if (index_awal == index_akhir) {                                                                    //O(1)
            hrf.hurufTerkecilDC = hrf.hurufTerbesarDC = nama[index_awal];                                   //O(1)
        } else {                                    
            index_tengah = (index_awal + index_akhir) / 2;                                                  //O(1)
            Quiz1No2DC(nama, index_awal, index_tengah, hasil1);                                             //O(n) = O(11)
            Quiz1No2DC(nama, index_tengah + 1, index_akhir, hasil2);                                        //O(n) = O(11)
            
            hrf.hurufTerkecilDC = (hasil1.hurufTerkecilDC < hasil2.hurufTerkecilDC) ? hasil1.hurufTerkecilDC : hasil2.hurufTerkecilDC;  //O(1)
            hrf.hurufTerbesarDC = (hasil1.hurufTerbesarDC > hasil2.hurufTerbesarDC) ? hasil1.hurufTerbesarDC : hasil2.hurufTerbesarDC;  //O(1)
            
                                                                                            // Total Big O = 3+2+10*16*16+2+5+11+11+1 = 2595
                                                                                            // Notasi Big O = O(n)
        }
    }
}