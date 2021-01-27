package Tugas7;
/**
 *
 * @author Faris Ikhlasul H
 */
public class No4 {
        int nik[];
        String nama[];
        String alamat[];
        String kelamin[];
        No4(int jumDat) {
            this.nik = new int[jumDat];
            this.nama = new String[jumDat];
            this.alamat = new String[jumDat];
            this.kelamin = new String[jumDat];
        }
        public void TampilData() {
            for (int i = 0; i < alamat.length; i++) {
                System.out.println("Penduduk ke-" + (i + 1));
                System.out.println("NIK\t\t: " + nik[i]);
                System.out.println("Nama\t\t: " + nama[i]);
                System.out.println("alamat\t\t: " + alamat[i]);
                System.out.println("kelamin\t\t: " + kelamin[i]);
                System.out.println("===========================");
            }
        }
        public void Sort() {
            for (int i = 0; i < nik.length - 1; i++) {
                for (int j = 1; j < nik.length; j++) {
                    if (nik[j] < nik[j - 1]) {
                        int temp = nik[j];
                        nik[j] = nik[j - 1];
                        nik[j - 1] = temp;
                    }
                }
            }
        }
        public int BinarySearch(int cari, int left, int right) {
            Sort();
            if (right >= left) {
                int mid = (left + right) / 2;
                if (cari == nik[mid]) {
                    return (mid);
                } else if (nik[mid] > cari) {
                    return BinarySearch(cari, left, mid - 1);
                } else {
                    return BinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
        public void Tampil(int cari, int posisi) {
            if (posisi != -1) {
                System.out.println("Data NIK " + cari + " Ditemukan padaindeks ke - " + posisi);
                System.out.println("Penduduk ke-" + (posisi + 1));
                System.out.println("NIK\t\t: " + nik[posisi]);
                System.out.println("Nama\t\t: " + nama[posisi]);
                System.out.println("alamat\t\t: " + alamat[posisi]);
                System.out.println("kelamin\t\t: " + kelamin[posisi]);
                System.out.println("===========================");
            } else {
                System.out.println("Maaf, Data tidak ditemukan");
            }
        }
    }