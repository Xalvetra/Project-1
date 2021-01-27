package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tiket {

    String[] namaPesawat;
    float[] hargaTiket;
    int[] jumlahTiketTersedia;
    int[] jumlahTiketTerjual;
    int[] jumlahTiket;
    char choose, pilih;
    float tmp;
    int temp;

    Tiket() {
    }

    Tiket(String[] a, float[] b, int[] c, int[] d, char e, char f, int[] g) {
        namaPesawat = a;
        hargaTiket = b;
        jumlahTiketTersedia = c;
        jumlahTiketTerjual = d;
        jumlahTiket = g;
        choose = e;
        pilih = f;
    }

    void Pemilihan(char m) {
        if (choose == '1') {
            bubbleSortDESC();
        } else if (choose == '2') {
            selectionSortASC();
        } else {
            System.out.println("Pilihan Salah");
        }
    }

    void tampil() {
        if (pilih == '1') {
            for (int i = 0; i < namaPesawat.length; i++) {
                jumlahTiketTersedia[i] = jumlahTiket[i] - jumlahTiketTerjual[i];
                System.out.println((i + 1) + ". " + namaPesawat[i]);
                System.out.println("Tiket " + (jumlahTiketTersedia[i] + jumlahTiketTerjual[i]));
                System.out.println("Tiket terjual " + jumlahTiketTerjual[i]);
                System.out.println("Tiket tersedia " + jumlahTiketTersedia[i]);
                System.out.println();
            }
        } else if (pilih == '2') {
            for (int i = 0; i < namaPesawat.length; i++) {
                jumlahTiketTersedia[i] = jumlahTiket[i] - jumlahTiketTerjual[i];
                System.out.println((i + 1) + ". " + namaPesawat[i]);
                System.out.println("Tiket " + (jumlahTiketTersedia[i] + jumlahTiketTerjual[i]));
                System.out.println("Tiket terjual " + jumlahTiketTerjual[i]);
                System.out.println("Tiket tersedia " + jumlahTiketTersedia[i]);
                System.out.println();
            }
        } else {
            System.out.println("Data Yang Anda Masukkan Salah");
        }
    }

    void bubbleSortDESC() {
        if (choose == '2') {
            if (pilih == '1') {
                for (int i = 0; i < hargaTiket.length - 1; i++) {
                    for (int j = 1; j < hargaTiket.length - i; j++) {
                        if (hargaTiket[j] > hargaTiket[j - 1]) {
                            tmp = hargaTiket[j];
                            hargaTiket[j] = hargaTiket[j - 1];
                            hargaTiket[j - 1] = tmp;
                        }
                    }
                }
            } else if (pilih == '2') {
                for (int i = 0; i < jumlahTiketTersedia.length - 1; i++) {
                    for (int j = 1; j < jumlahTiketTersedia.length - i; j++) {
                        if (jumlahTiketTersedia[j] > jumlahTiketTersedia[j - 1]) {
                            tmp = jumlahTiketTersedia[j];
                            jumlahTiketTersedia[j] = jumlahTiketTersedia[j - 1];
                            jumlahTiketTersedia[j - 1] = temp;
                        }
                    }
                }
            } else {
                System.out.println("Inputan Yang Anda Masukkan Salah");
            }
        }
    }

    void selectionSortASC() {
        if (pilih == '1') {
            for (int i = 0; i < hargaTiket.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < hargaTiket.length; j++) {
                    if (hargaTiket[j] < hargaTiket[idxMin]) {
                        idxMin = j;
                    }
                }
                tmp = hargaTiket[idxMin];
                hargaTiket[idxMin] = hargaTiket[i];
                hargaTiket[i] = tmp;
            }
        }else if(pilih == '2'){
            for (int i = 0; i < jumlahTiketTersedia.length - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < jumlahTiketTersedia.length; j++) {
                    if (jumlahTiketTersedia[j] < jumlahTiketTersedia[idxMin]) {
                        idxMin = j;
                    }
                }
                tmp = jumlahTiketTersedia[idxMin];
                jumlahTiketTersedia[idxMin] = jumlahTiketTersedia[i];
                jumlahTiketTersedia[i] = temp;
            }
        }
    }
}
