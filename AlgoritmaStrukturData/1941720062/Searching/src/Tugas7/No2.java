package Tugas7;

/**
 *
 * @author Faris Ikhlasul H
 */
public class No2 {

    public int[][] data;
    public int baris, kolom, posisiBar, posisiKol, posisi;

    public No2(int[][] Data, int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
        data = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }
    public int FindSeqSearch(int cari) {
        posisiKol = -1;
        posisiBar = -1;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (data[i][j] == cari) {
                    this.posisiBar = i;
                    this.posisiKol = j;
                    posisi = data[posisiBar][posisiKol];
                    break;
                }
            }
        }
        return posisi;
    }
    public int getPosisiBar() {
        return posisiBar;
    }
    public void setPosisiBar(int posisiBar) {
        this.posisiBar = posisiBar;
    }
    public int getPosisiKol() {
        return posisiKol;
    }
    public void setPosisiKol(int posisiKol) {
        this.posisiKol = posisiKol;
    }
    public void TampilData() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}