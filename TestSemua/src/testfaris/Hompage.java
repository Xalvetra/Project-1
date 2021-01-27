package testfaris;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Hompage {

    public static void main(String[] Args) {
        int angka = 3, waktu = 1, waktuKonSec,waktuKonMin;
        double percepatan = 0.1, total,yeah = 0;
        waktuKonMin = waktu * 60;
        waktuKonSec = waktuKonMin * 60;
        for (int i = 0; i < waktuKonSec; i++) {

            yeah +=percepatan;
        }
        
        total = yeah + angka;
        System.out.println(total);
    }
}
