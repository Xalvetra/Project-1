package quiz1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Quiz1MainClass {

    public static void main(String[] args) {                                                            // Big O
        char[] nama = {'f', 'a', 'r', 'i', 's', 'i', 'k', 'h', 'l', 'a', 's', 'u', 'l', 'h', 'a', 'q'}; // O(1)
        char huruf[] = {'a', 'f', 'h', 'i', 'k', 'l', 'q', 'r', 's', 'u'};                              // O(1)
        Quiz1 hrf = new Quiz1();                                                                        // O(1)
        hrf.Quiz1(nama, huruf);                                                                         // O(1)
    }                                                                                                   // Total Big O = 4
}                                                                                                       // Notasi Big O = O(1)
