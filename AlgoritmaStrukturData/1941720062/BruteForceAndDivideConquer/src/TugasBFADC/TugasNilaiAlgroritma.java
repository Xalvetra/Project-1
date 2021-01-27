package TugasBFADC;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasNilaiAlgroritma {

    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public double total;
    public int count;
    TugasNilaiAlgroritma() {
    }

    TugasNilaiAlgroritma(int a, int b, int c, int d) {
        nilaiTugas = a;
        nilaiKuis = b;
        nilaiUTS = c;
        nilaiUAS = d;
    }

    public double hitungTotalNilai() {
        return nilaiTugas * 0.30 + nilaiKuis * 0.20 + nilaiUTS * 0.20 + nilaiUAS * 0.30;
    }

}
