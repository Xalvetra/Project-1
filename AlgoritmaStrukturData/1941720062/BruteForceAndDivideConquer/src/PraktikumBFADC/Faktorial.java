package PraktikumBFADC;

/**
 *
 * @author Faris Ikhlasul H
 */

public class Faktorial {

    public int nilai, i = 1;
    public int FaktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
//        do {
//            fakto = fakto * i;
//            i++;
//        } while (i <= n);
        return fakto;
    }

    public int FaktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * FaktorialDC(n - 1);
            return fakto;
        }
    }

}
