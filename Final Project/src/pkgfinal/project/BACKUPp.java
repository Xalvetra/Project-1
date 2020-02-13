package pkgfinal.project;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Random;

public class BACKUPp {
    //Deklarasi Global Dan Scanner

    static Scanner Final = new Scanner(System.in);
    static Scanner Spasi = new Scanner(System.in);
    static Random bebas = new Random();
    static int save = 0;
    static int save1 = 0;

    //Khusus Array ========================================================================================
    static String[] provinsi
            = {"Jawa Timur", "Jawa Tengah", "Jawa Barat", "Sumatra Selatan", "Bali", "Kalimantan Selatan"};
    static String[][] Kota
            = {
                //Jawa Timur
                {"Gresik", "Surabaya", "Ngawi", "Nganjuk", "Jombang", "Madiun"},
                //Jawa Tengah
                {"Semarang", "Pekalongan", "Pemalang", "Solo", "Sragen", "Magelang"},
                //Jawa Barat
                {"Bandung", "Sukabumi", "Cirebon", "Subang", "Karawang"},
                //Sumatra Selatan
                {"Lampung", "Palembang", "Pagar Alam"},
                //Bali
                {"Denpasar", "Singaraja", "Buleleng", "Gianyar", "Karangasem"},
                //Kalimantan Selatan
                {"Banjarmasin", "Banjarbaru", "Martapura", "Tanjung"}
            };
    static String[] PengecekanResi = {"262131455", "275677856", "133467546"};
    static String[][] PengecekanBarang
            = {
                {"Nama Pengiriman     : Dhimas Arbis Sukma Himawan\n"
                    + "Nama Penerima       : Faris Ikhlasul Haq\n"
                    + "Nomor Resi          : 262131455\n"
                    + "Dari Prov/Kota/Kec  : Kalimantan Selatan/Martapura/Sisingmaraja \n"
                    + "Tujuan              : Jawa Timur/Malang/Karangploso \n"
                    + "Berat Barang        : 10 Kg\n"
                    + "Jenis Pengiriman    : YES (Yakin Esok Sampai)\n"
                    + "Jenis Bahan         : Fragile(Mudah Rusak/ Pecah Belah)\n)"
                    + "Status Pengiriman   : Manifest Martapura"},
                {"Nama Pengiriman     : Khoirul Wahyudin\n"
                    + "Nama Penerima       : Faris Ikhlasul Haq\n"
                    + "Nomor Resi          : 275677856\n"
                    + "Dari Prov/Kota/Kec  : Bali/Denpasar/Buleleng \n"
                    + "Tujuan              : Jawa Timur/Malang/Karangploso \n"
                    + "Berat Barang        : 20 Kg\n"
                    + "Jenis Pengiriman    : Regular \n"
                    + "Jenis Bahan         : Standar\n)"
                    + "Status Pengiriman   : On The Way"},
                {"Nama Pengiriman     : Rasyed Renaldi\n"
                    + "Nama Penerima       : Faris Ikhlasul Haq\n"
                    + "Nomor Resi          : 133467546\n"
                    + "Dari Prov/Kota/Kec  : Kalimantan Selatan/Banjarmasin/Banjar \n"
                    + "Tujuan              : Jawa Timur/Malang/Karangploso \n"
                    + "Berat Barang        : 5 Kg\n"
                    + "Jenis Pengiriman    : Ekonomis\n"
                    + "Jenis Bahan         : Standar \n"
                    + "Status Pengiriman   : Deliver Branch Malang"}

            };

    public static void main(String[] args) {
        String username, password;
        boolean cek = true;
        boolean test;
        System.out.println("SELAMAT DATANG DI SISTEM EKSPEDISI");
        System.out.println("*****Politeknik Negeri Malang*****");
        System.out.println("    ^^^^^ Wilayah Malang ^^^^^^   ");
        System.out.println();
        System.out.println("Silahkan Login Akun Anda");
        System.out.println("========================");
        System.out.print("Masukkan Username Anda : ");
        username = Final.nextLine();
        System.out.print("Masukkan Password Anda : ");
        password = Final.nextLine();
        test = (username.equalsIgnoreCase("faris")) && (password.equalsIgnoreCase("rafi"));
        while (test == !cek) {
            System.out.println();
            System.out.println("Username/Password yang Anda Masukkan Salah");
            System.out.println("==========================================");
            System.out.println();
            System.out.print("Masukkan Username Anda : ");
            username = Final.nextLine();
            System.out.print("Masukkan Password Anda : ");
            password = Final.nextLine();
            test = (username.equalsIgnoreCase("faris")) && (password.equalsIgnoreCase("rafi"));
        }
        System.out.println();
        cek(Login());
    }

    static char Login() {
        char jenis;

        System.out.println("");
        System.out.println("-----] ANDA BERHASIL LOGIN [-----");
        System.out.println("1. Pengiriman Barang");
        System.out.println("2. Pengambilan Barang");
        System.out.println("3. Pengecakan Barang");
        System.out.println("4. Keluar");
        System.out.print("Pilihlah Huruf Yang Anda Inginkan :");
        jenis = Final.next().charAt(0);
        return jenis;
    }

    static void cek(char a) {
        switch (a) {
            case '1':
                PengirimanBarang();
                break;
            case '2':
                PengambilanBarang();
                break;
            case '3':
                PengecekanBarang();
                break;
            case '4':
                Keluar();
                break;
            default:
                cek(Login());

        }
    }

    static void PengirimanBarang() {
        int number = bebas.nextInt(99999999);
        char jenisKirim, jenisBarang, jenisPackaging, Asuransi, CtkResi;
        double berat, MsknUang, total = 0, pajak = 0, kembalian;
        String Wilayah, Kecamatan, Identitas, NamaAnda, NamaTujuan;
        String Provinsi;
        System.out.println("====== Anda Masuk Ke Pengiriman Barang ======");

        System.out.print("Masukkan Nama Anda : ");
        NamaAnda = Spasi.nextLine();
        System.out.print("Masukkan Nama Tujuan : ");
        NamaTujuan = Spasi.nextLine();
        System.out.println();
        System.out.println("1. Pengiriman YES (Yakin Esok Sampai (1 Hari))");
        System.out.println("2. Pengiriman Reguler (3-5 Hari)");
        System.out.println("3. Pengiriman Ekonomis (6-9 Hari)");
        System.out.print("Pilih Jenis Pengiriman Anda :");
        jenisKirim = Final.next().charAt(0);
        if (jenisKirim == '1') {
            System.out.println("===========================");
            System.out.println("Anda Memilih Pengiriman YES");
            System.out.println("1. Bahan Standar");
            System.out.println("2. Bahan Fragile");
            System.out.println("3. Keluar");
            System.out.print("Pilih Jenis Barang Anda :");
            jenisBarang = Final.next().charAt(0);
            if (jenisBarang == '1') {
                System.out.println("Tidak Ada Tambahan Biaya Untuk Jenis Barang Ini");
                System.out.println("Tambahan Pajak 10 % Sesuai Peraturan Pemerintahan Indonesia");
                System.out.println("1. BubbleWrap");
                System.out.println("2. Kayu");
                System.out.print("Pilih Jenis Packaging Anda (1-2) : ");
                jenisPackaging = Final.next().charAt(0);
                if (jenisPackaging == '1') {
                    Pencarian();
                    System.out.print("Masukkan Kecamatan Anda : ");
                    Kecamatan = Spasi.nextLine();
                    System.out.print("Masukkan Berat Barang Anda (Kg) : ");
                    berat = Final.nextDouble();
                    System.out.print("Masukkan Identitas Tambahan Barang Anda :");
                    Identitas = Spasi.nextLine();
                    if (Kota[save][save1] == "Martapura" || Kota[save][save1] == "Banjarbaru" || Kota[save][save1] == "Tanjung") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 5500 + PPN 10%");
                            pajak = berat * 5500 * 0.1;
                            total = (berat * 5500) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 5500 + PPN 10%");
                            pajak = berat * 5500 * 0.1;
                            total = (berat * 5500) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Banjarmasin" || Kota[save][save1] == "Palembang" || Kota[save][save1] == "Pagar Alam") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4900 + PPN 10%");
                            pajak = berat * 4900 * 0.1;
                            total = (berat * 4900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4900 + PPN 10%");
                            pajak = berat * 4900 * 0.1;
                            total = (berat * 4900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Lampung" || Kota[save][save1] == "Denpasar" || Kota[save][save1] == "Singaraja") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4500 + PPN 10%");
                            pajak = berat * 4500 * 0.1;
                            total = (berat * 4500) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4500 + PPN 10%");
                            pajak = berat * 4500 * 0.1;
                            total = (berat * 4500) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Buleleng" || Kota[save][save1] == "Gianyar" || Kota[save][save1] == "Karangasem") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3900 + PPN 10%");
                            pajak = berat * 3900 * 0.1;
                            total = (berat * 3900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3900 + PPN 10%");
                            pajak = berat * 3900 * 0.1;
                            total = (berat * 3900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Bandung" || Kota[save][save1] == "Sukabumi" || Kota[save][save1] == "Karawang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3400 + PPN 10%");
                            pajak = berat * 3400 * 0.1;
                            total = (berat * 3400) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3400 + PPN 10%");
                            pajak = berat * 3400 * 0.1;
                            total = (berat * 3400) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Cirebon" || Kota[save][save1] == "Subang" || Kota[save][save1] == "Pemalang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2900 + PPN 10%");
                            pajak = berat * 2900 * 0.1;
                            total = (berat * 2900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2900 + PPN 10%");
                            pajak = berat * 2900 * 0.1;
                            total = (berat * 2900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Pekalongan" || Kota[save][save1] == "Semarang" || Kota[save][save1] == "Magelang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2400 + PPN 10%");
                            pajak = berat * 2400 * 0.1;
                            total = (berat * 2400) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2400 + PPN 10%");
                            pajak = berat * 2400 * 0.1;
                            total = (berat * 2400) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Solo" || Kota[save][save1] == "Sragen" || Kota[save][save1] == "Ngawi") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1800 + PPN 10%");
                            pajak = berat * 1800 * 0.1;
                            total = (berat * 1800) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1800 + PPN 10%");
                            pajak = berat * 1800 * 0.1;
                            total = (berat * 1800) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Madiun" || Kota[save][save1] == "Nganjuk" || Kota[save][save1] == "Jombang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1300 + PPN 10%");
                            pajak = berat * 1300 * 0.1;
                            total = (berat * 1300) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1300 + PPN 10%");
                            pajak = berat * 1300 * 0.1;
                            total = (berat * 1300) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Gresik" || Kota[save][save1] == "Surabaya") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 900 + PPN 10%");
                            pajak = berat * 900 * 0.1;
                            total = (berat * 900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 900 + PPN 10%");
                            pajak = berat * 900 * 0.1;
                            total = (berat * 900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else {
                        Keluar();
                    }

                } else if (jenisPackaging == '2') {
                    Pencarian();
                    System.out.print("Masukkan Kecamatan Anda : ");
                    Kecamatan = Spasi.nextLine();
                    System.out.print("Masukkan Berat Barang Anda (Kg) : ");
                    berat = Final.nextDouble();
                    System.out.print("Masukkan Identitas Tambahan Barang Anda :");
                    Identitas = Spasi.nextLine();
                    if (Kota[save][save1] == "Martapura" || Kota[save][save1] == "Banjarbaru" || Kota[save][save1] == "Tanjung") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 5500 + PPN 10%");
                            pajak = berat * 5500 * 0.1;
                            total = (berat * 5500) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 5500 + PPN 10%");
                            pajak = berat * 5500 * 0.1;
                            total = (berat * 5500) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Banjarmasin" || Kota[save][save1] == "Palembang" || Kota[save][save1] == "Pagar Alam") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4900 + PPN 10%");
                            pajak = berat * 4900 * 0.1;
                            total = (berat * 4900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4900 + PPN 10%");
                            pajak = berat * 4900 * 0.1;
                            total = (berat * 4900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Lampung" || Kota[save][save1] == "Denpasar" || Kota[save][save1] == "Singaraja") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4500 + PPN 10%");
                            pajak = berat * 4500 * 0.1;
                            total = (berat * 4500) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 4500 + PPN 10%");
                            pajak = berat * 4500 * 0.1;
                            total = (berat * 4500) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Buleleng" || Kota[save][save1] == "Gianyar" || Kota[save][save1] == "Karangasem") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3900 + PPN 10%");
                            pajak = berat * 3900 * 0.1;
                            total = (berat * 3900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3900 + PPN 10%");
                            pajak = berat * 3900 * 0.1;
                            total = (berat * 3900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Bandung" || Kota[save][save1] == "Sukabumi" || Kota[save][save1] == "Karawang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3400 + PPN 10%");
                            pajak = berat * 3400 * 0.1;
                            total = (berat * 3400) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 3400 + PPN 10%");
                            pajak = berat * 3400 * 0.1;
                            total = (berat * 3400) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Cirebon" || Kota[save][save1] == "Subang" || Kota[save][save1] == "Pemalang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2900 + PPN 10%");
                            pajak = berat * 2900 * 0.1;
                            total = (berat * 2900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2900 + PPN 10%");
                            pajak = berat * 2900 * 0.1;
                            total = (berat * 2900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Pekalongan" || Kota[save][save1] == "Semarang" || Kota[save][save1] == "Magelang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2400 + PPN 10%");
                            pajak = berat * 2400 * 0.1;
                            total = (berat * 2400) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 2400 + PPN 10%");
                            pajak = berat * 2400 * 0.1;
                            total = (berat * 2400) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Solo" || Kota[save][save1] == "Sragen" || Kota[save][save1] == "Ngawi") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1800 + PPN 10%");
                            pajak = berat * 1800 * 0.1;
                            total = (berat * 1800) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1800 + PPN 10%");
                            pajak = berat * 1800 * 0.1;
                            total = (berat * 1800) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Madiun" || Kota[save][save1] == "Nganjuk" || Kota[save][save1] == "Jombang") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1300 + PPN 10%");
                            pajak = berat * 1300 * 0.1;
                            total = (berat * 1300) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 1300 + PPN 10%");
                            pajak = berat * 1300 * 0.1;
                            total = (berat * 1300) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else if (Kota[save][save1] == "Gresik" || Kota[save][save1] == "Surabaya") {
                        System.out.print("Apakah Anda Ingin Menambah Asurani Pegiriman (Y/T) : ");
                        Asuransi = Final.next().charAt(0);
                        if (Asuransi == ('Y') || Asuransi == ('y')) {
                            System.out.println("Biaya Asuransi Sebesar Rp.5000");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 900 + PPN 10%");
                            pajak = berat * 900 * 0.1;
                            total = (berat * 900) + pajak + 5000;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        } else {
                            System.out.println("Anda tidak Menambah Asuransi");
                            System.out.println("Biaya Ditambahkan pada Pembayaran");
                            System.out.println("Biaya Per Kilogram (Bahan Standar) Rp. 900 + PPN 10%");
                            pajak = berat * 900 * 0.1;
                            total = (berat * 900) + pajak;

                            System.out.println("Total Pajak Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Biaya Anda Adalah : Rp. " + total);
                            System.out.print("Masukkan Jumlah Uang Anda : Rp. ");
                            MsknUang = Final.nextDouble();
                            kembalian = MsknUang - total;
                            if (MsknUang >= total) {
                                System.out.println("Anda Akan Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                System.out.println();
                                System.out.print("Apakah Anda Ingin Mencetak Resi (Y/T) : ");
                                CtkResi = Final.next().charAt(0);
                                if (CtkResi == ('Y') || CtkResi == ('y')) {

                                    System.out.println("        RESI HiF Ekspress       ");
                                    System.out.println();
                                    System.out.println("Waktu Sekarang          : " + Waktu());
                                    System.out.println("Tanggal Sekarang        : " + Tanggal());
                                    System.out.println("Nama Pengirim           : " + NamaAnda);
                                    System.out.println("Nama Penerima           : " + NamaTujuan);
                                    System.out.println("Tujuan Prov/Kota/Kec    : " + provinsi[save] + "/" + Kota[save][save1] + "/" + Kecamatan);
                                    System.out.println("Berat Barang            : " + berat + " Kg");
                                    System.out.println("Jenis Pengiriman        : YES(Yakin Esok Sampai)");
                                    System.out.println("Jenis Bahan             : Fragile");
                                    System.out.println("Tambahan                : " + Identitas);
                                    System.out.println("Nomor Resi              : " + number);
                                    System.out.println("Total Pembayaran        : Rp. " + total);
                                    System.out.println("Uang Anda               : Rp. " + MsknUang);
                                    System.out.println("Uang Kembalian Anda     : Rp. " + kembalian);
                                    Keluar();
                                } else {
                                    System.out.println("Anda Telah Melakukan Pengiriman Ke Kota " + Kota[save][save1]);
                                    Keluar();
                                }
                            } else {
                                System.out.println("Mohon Maaf Uang Anda Tidak Cukup Anda Tidak Dapat Melakukan Pengiriman");
                                Keluar();
                            }
                        }
                    } else {
                        Keluar();
                    }

                } else {
                    System.out.println("============================");
                    System.out.println("Kode Yang Anda Masukkan Salah");
                    cek(Login());
                }

            } else if (jenisBarang == '2') {
                System.out.println("Tidak Ada Tambahan Biaya Untuk Jenis Barang Ini");
                System.out.println("Tambahan Pajak 10 % Sesuai Peraturan Pemerintahan Indonesia");

            } else if (jenisBarang == '3') {
                Keluar();
            } else {
                Salah();
            }
        }
    }

    static void PengambilanBarang() {
        System.out.println("====== Anda Masuk Ke Pengambilan Barang ======");
        System.out.println("Masukkan Nomor Resi Anda : ");

    }

    static void Pencarian() {
        String Provinsi, Wilayah, Kecamatan;
        double berat;
        char jenisPackaging;

        //Menampilkan Provinsi Yang Tersedia
        System.out.println();
        for (String j : provinsi) {
            System.out.println(" @ " + j + "");
        }
        System.out.println();
        System.out.print("Masukan Provinsi Tujuan Anda : ");
        Provinsi = Spasi.nextLine();

        //System Cek Provinsi
        for (int k = 0; k < provinsi.length; k++) {
            if (Provinsi.equalsIgnoreCase(provinsi[k])) {
                save = k;
                break;

            }
        }
        if (Provinsi.equalsIgnoreCase(provinsi[save])) {

            //Menampilkan Kota Yang Tersedia
            System.out.println();
            for (String ArrayFaris[] : Kota) {
                for (String j : ArrayFaris) {
                    System.out.print(" * " + j);
                }
                System.out.println(" ");
            }
            System.out.println();

            System.out.print("Masukkan Kota Tujuan Anda : ");
            Wilayah = Final.next();

            //System Cek Kota
            for (int l = 0; l < Kota[0].length; l++) {
                if (Wilayah.equalsIgnoreCase(Kota[save][l])) {
                    save1 = l;
                    break;
                }
            }

            if (Wilayah.equalsIgnoreCase(Kota[save][save1])) {
                System.out.println("= === Anda Masuk Ke Data Lanjutan === =");
            } else {
                cek(Login());

            }
        } else {
            cek(Login());
        }
    }
    static void PengecekanBarang() {
        char cekBarang;
        String Resi;
        Scanner cek = new Scanner(System.in);
        System.out.println("===== Anda Masuk Ke Pengecekan Barang ======");
        System.out.println("1. Pengecekan Dengan Resi");
        System.out.println("2. Pengecekan Dengan Nama");
        cekBarang = cek.next().charAt(0);

        if (cekBarang == '1') {
            System.out.println("Masukkan Resi Anda : ");
            Resi = Final.next();

        } else if (cekBarang == '2') {

        } else {
            Salah();
            cek(Login());
        }
    }

    static void Keluar() {
        System.out.println("Terima Kasih Telah Memakai Progam by Faris Ikhlasul Haq");
    }

    static void Salah() {
        System.out.println("Anda Salah Masukkkan Inputan");
    }

    static String Tanggal() {
        DateFormat formatTanggal = new SimpleDateFormat("yyyy/MM/dd");
        Date Tanggal = new Date();
        return formatTanggal.format(Tanggal);
    }

    static String Waktu() {
        DateFormat formatWaktu = new SimpleDateFormat("HH:mm:ss");
        Date waktu = new Date();
        return formatWaktu.format(waktu);
    }
}