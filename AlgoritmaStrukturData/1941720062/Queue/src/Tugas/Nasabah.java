package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Nasabah {

    String noRekening;
    String nama;

    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }
    public Nasabah() {
    }
    public void print() {
        System.out.println("Nama\t: " + nama);
        System.out.println("No.Rek\t: " + noRekening);
    }
}
