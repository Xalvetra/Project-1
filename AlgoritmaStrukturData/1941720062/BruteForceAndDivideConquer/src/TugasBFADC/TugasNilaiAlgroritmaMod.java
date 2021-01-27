package TugasBFADC;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasNilaiAlgroritmaMod {

    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public double total;
    public int count;

    TugasNilaiAlgroritmaMod() {
    }

    TugasNilaiAlgroritmaMod(int a, int b, int c, int d,int e) {
        nilaiTugas = a;
        nilaiKuis = b;
        nilaiUTS = c;
        nilaiUAS = d;
        count = e;

    }
    public double hitungRataRataDC(int e) {
        if (e < 1) {
            return 0;
        } else {
            double rsum= (nilaiUAS+nilaiTugas)*0.30;
            double lsum= (nilaiKuis+nilaiUTS)*0.20;
            return(lsum+rsum);
        }
    }

    
}
