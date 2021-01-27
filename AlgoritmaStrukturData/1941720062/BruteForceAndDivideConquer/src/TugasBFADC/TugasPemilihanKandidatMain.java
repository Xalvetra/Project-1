package TugasBFADC;
import java.util.Scanner;
public class TugasPemilihanKandidatMain {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner (System.in);
        System.out.print("Masukkan jumlah kandidat: ");
        int jml = faris.nextInt();
        System.out.print("Masukkan jumlah pemilih: ");
        int jmlPemilih = faris.nextInt();
        TugasPemilihanKandidat ps = new TugasPemilihanKandidat(jml,jmlPemilih);
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nama kandidat-" + (i + 1)+": ");
            ps.nama[i] = haq.nextLine();
            ps.noUrut[i] = (i+1);
            System.out.println(ps.noUrut[i]);
        }
        for(int i=0;i<jmlPemilih;i++){
            System.out.print("Masukkan pilihan (1-"+jml+"): ");
            ps.suara[i] = faris.nextInt();
        }
        for (int i = 0; i < jml; i++) {
            System.out.println(ps.suara[i]);
            System.out.println("Perhitungan total suara kandidat " + ps.nama[i] + " : " + ps.hitungPemilihan(ps.suara, 0, ps.jmlKandidat-1, jmlPemilih));
        }
    }
}