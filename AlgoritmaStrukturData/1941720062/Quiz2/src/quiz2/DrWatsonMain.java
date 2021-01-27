package quiz2;

import java.util.Scanner;

public class DrWatsonMain {

    public static int jumlahPengantri = 0, pilihan = 99, noAntrian = 0;
    public static int no, penyakit, waktu;
    public static String nama;
    public static DrWatsonQueue wq = new DrWatsonQueue();

    public static void menuUtama() {
        System.out.println("=============================");
        System.out.println("	  Menu Utama           ");
        System.out.println("=============================");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek Antrian By No");
        System.out.println("5. Cek Pasien By No");
        System.out.println("6. Rata2 Waktu Penanganan");
        System.out.println("7. Statistik Keluhan");
        System.out.println("8. Hapus Seluruh Antrian");
        System.out.println("9. Keluar");
        System.out.print("Pilih Menu Utama : ");
    }

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        int menu;
        System.out.println("==================");
        System.out.println("FARIS IKHLASUL HAQ");
        System.out.println("  1941720062 - 12 ");
        System.out.println("==================");

        try {
            do {
                menuUtama();
                menu = faris.nextInt();
                DrWatsonQueue data = new DrWatsonQueue();
                switch (menu) {
                    case 1:
                        System.out.println("=============================");
                        System.out.println("           Enqueue           ");
                        System.out.println("=============================");
                        System.out.print("Masukkan Nama Anda : ");
                        data.nama = haq.nextLine();
                        System.out.println("Pilih Salah Satu : ");
                        for (int i = 0; i < wq.keluhan.length; i++) {
                            System.out.println((i + 1) + ". " + wq.keluhan[i]);
                        }
                        System.out.print("Masukkan Keluhan Sakit Anda : ");
                        int penyakit = faris.nextInt();
                        for (int i = 0; i < wq.waktu.length; i++) {
                            if (i == (penyakit - 1)) {
                                data.penyakit = wq.keluhan[i];
                                data.time = wq.waktu[i];
                                data.no = wq.no += 1;
                                break;
                            }
                        }
                        wq.Enqueue(data);
                        break;
                    case 2:
                        System.out.println("=============================");
                        System.out.println("           Dequeue           ");
                        System.out.println("=============================");
                        System.out.println("Panggil Pendaftar");
                        System.out.println("--------------------------");
                        wq.dequeue();
                        break;
                    case 3:
                        System.out.println("=============================");
                        System.out.println("         Cek Antrian         ");
                        System.out.println("=============================");
                        wq.cekAntrian();
                        break;
                    case 4:
                        System.out.println("=============================");
                        System.out.println("      Cek Antrian By No      ");
                        System.out.println("=============================");
                        System.out.print("Masukkan Nomor Pasien: ");
                        no = faris.nextInt();
                        wq.cekAntrianByNo(no);
                        break;
                    case 5:
                        System.out.println("=============================");
                        System.out.println("       Cek Pasien By No      ");
                        System.out.println("=============================");
                        Node tmp = wq.head;
                        System.out.println("Cek Data Pasien");
                        System.out.print("Daftar Antrian: ");
                        while (tmp != null) {
                            System.out.print(tmp.data.no + " ");
                            tmp = tmp.next;
                        }
                        System.out.println("");
                        System.out.print("Masukkan Nomor Pasien: ");
                        no = faris.nextInt();
                        wq.cekPasienByNo(no);
                        break;
                    case 6:
                        System.out.println("=============================");
                        System.out.println("   Rata2 Waktu Penanganan    ");
                        System.out.println("=============================");
                        wq.rataWaktu();
                        break;
                    case 7:
                        System.out.println("=============================");
                        System.out.println("      Statistik Keluhan      ");
                        System.out.println("=============================");
                        wq.statistikKeluhan();
                        break;
                    case 8:
                        wq.clear();
                        System.out.println("  ANTRIAN TELAH DIRESET ");
                        break;
                    case 9:
                        System.out.println("=============================");
                        System.out.println("             EXIT            ");
                        System.out.println("=============================");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Tidak Ditentukan");
                        break;
                }
            } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}