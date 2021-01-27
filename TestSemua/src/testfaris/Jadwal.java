package testfaris;

public class Jadwal 
{
    public int kode;
    public String waktu;
    public int jam_berangkat;
    public int jam_sampai;
    public int durasi;
    public int biaya;

    public Jadwal(int kode, String waktu, int jam_berangkat, int jam_sampai, int biaya){
        this.kode = kode;
        this.waktu = waktu;
        this.jam_berangkat = jam_berangkat;
        this.jam_sampai = jam_sampai;  
        durasi = jam_sampai - jam_berangkat;       
        this.biaya = biaya;
    }
}