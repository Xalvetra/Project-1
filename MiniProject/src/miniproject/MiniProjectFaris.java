package miniproject;

import java.util.Scanner;

public class MiniProjectFaris {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        String username, password, tujuan, kasir;
        int penumpang;
        double pajak, biaya, total, berat, jarak;
        char jenis;

        System.out.println("========] Selamat Datang Di Aplikasi Get-Jek [=======");
        System.out.print("Masukkan Username Anda :\t");
        username = faris.nextLine();
        System.out.print("Masukkan Password Anda :\t");
        password = faris.nextLine();

        while (!(username.equalsIgnoreCase("faris")) && !(password.equalsIgnoreCase("rafi"))) {
            System.out.println("========] Selamat Datang Di Aplikasi Get-Jek [=======");
            System.out.print("Masukkan Username Anda :\t");
            username = faris.nextLine();
            System.out.print("Masukkan Password Anda :\t");
            password = faris.nextLine();
        }

                System.out.println("===] Anda Berhasil Masuk Ke Akun Get-Jek Anda [===");
                System.out.println("a.Get-Car");
                System.out.println("b.Get-MotorCycle");
                System.out.println("c.Get-Food");
                System.out.println("d.Get-Box");
                System.out.print("Pilihlah Huruf Yang Anda Inginkan :");
                jenis = faris.next().charAt(0);

                if (jenis == 'a') {
                    System.out.println("-----Anda Memilih Get-Car-----");
                    System.out.print("Masukkan Tujuan Anda                  :");
                    tujuan = faris.next();
                    System.out.print("Masukkan Jarak Anda  (Dalam Bentuk Km):");
                    jarak = faris.nextInt();
                    System.out.print("Masukkan Jumlah Penumpang Anda        :");
                    penumpang = faris.nextInt();

                    if (jarak < 30) {
                        biaya = jarak * 800;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else if (jarak < 60) {
                        biaya = jarak * 1200;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else if (jarak >= 60) {
                        biaya = jarak * 2000;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else {
                        System.out.println("Jarak Yang Anda Masukkan Salah");
                    }
                } else if (jenis == 'b') {
                    System.out.println("^^^^^^^]]]] Anda Memilih Get-MotorCycle [[[[^^^^^^^");
                    System.out.println("Masukkan Tujuan Anda                 :");
                    tujuan = faris.next();
                    System.out.print("Masukkan Jarak Anda (Dalam Bentuk Km)  :");
                    jarak = faris.nextInt();
                    System.out.print("Masukkan Jumlah Penumpang Anda         :");
                    penumpang = faris.nextInt();

                    if (jarak < 30) {
                        biaya = jarak * 300;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else if (jarak < 60) {
                        biaya = jarak * 500;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else if (jarak >= 60) {
                        biaya = jarak * 700;
                        total = penumpang * biaya;
                        System.out.println("");
                        System.out.println("Tujuan Anda Adalah                 : " + tujuan);
                        System.out.println("Jarak Anda Adalah                  : " + jarak + "km");
                        System.out.println("Jumlah Penumpang Anda Adalah       : " + penumpang);
                        System.out.println("Total Biaya Anda Seluruhnya Adalah : Rp." + total);
                    } else {
                        System.out.println("Jarak Yang Anda Masukkan Salah");
                    }

                } else if (jenis == 'c') {
                    System.out.println("1.Berkuah Rp. 55.000");
                    System.out.println("2.Bakar   Rp. 57.000");
                    System.out.println("3.Goreng  Rp. 65.000");
                    System.out.print("Masukkan Jenis Makanan Yang Anda Inginkan     :");
                    jenis = faris.next().charAt(0);
                    System.out.print("Masukkan Jarak Rumah Anda (Dalam Bentuk Km)   : ");
                    jarak = faris.nextInt();

                    if (jenis == '1') {

                        if (jarak < 30) {
                            pajak = 55000 * 0.01;
                            biaya = pajak * jarak;
                            System.out.println("");
                            System.out.println("Anda Memilih Makanan Jenis Berkuah");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + "km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp." + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp." + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);
                        } else if (jarak >= 30) {
                            pajak = 55000 * 0.03;
                            biaya = pajak * jarak;
                            System.out.println("");
                            System.out.println("Anda Memilih Makanan Jenis Berkuah");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + "km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp." + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp." + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);

                        } else {
                            System.out.println("Jarak Yang Anda Masukkan Salah");
                        }
                    } else if (jenis == '2') {

                        if (jarak < 30) {
                            pajak = 57000 * 0.01;
                            biaya = pajak * jarak;
                            System.out.println("");
                            System.out.println("Anda Memilih Makanan Jenis Bakar");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + "km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp." + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp." + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);
                        } else if (jarak >= 30) {
                            pajak = 57000 * 0.03;
                            biaya = pajak * jarak;
                            System.out.println("");
                            System.out.println("Anda Memilih Makanan Jenis Bakar");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + "km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp." + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp." + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);

                        } else {
                            System.out.println("Jarak Yang Anda Masukkan Salah");
                        }
                    } else if (jenis == '3') {

                        if (jarak < 30) {
                            pajak = 65000 * 0.01;
                            biaya = pajak * jarak;
                            System.out.println("");
                            System.out.println("Anda Memilih Makanan Jenis Goreng");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + "km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp." + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp. " + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);
                        } else if (jarak >= 30) {
                            pajak = 65000 * 0.03;
                            biaya = pajak * jarak;
                            System.out.println("Anda Memilih Makanan Jenis Goreng");
                            System.out.println("jarak Rumah Anda Adalah : " + jarak + " km");
                            System.out.println("Pajak Makanan Anda Adalah : Rp. " + pajak);
                            System.out.println("Total Pembayaran Anda Seluruhnya adalah : Rp. " + biaya);
                            System.out.println("Kasir Yang Bertanggung Jawab       :" + username);

                        } else {
                            System.out.println("Jarak Yang Anda Masukkan Salah");
                        }

                    } else {
                        System.out.println("Data Yang Anda Masukkan Salah");
                    }
                } else if (jenis == 'd') {
                    System.out.println("===] Anda Memilih Get-Box [===");
                    System.out.println("Untuk Jenis Plastik Mendapat Diskon 20%");
                    System.out.println("---------------------------------------");
                    System.out.println("1.Gelas");
                    System.out.println("2.Plastik");
                    System.out.print("Pilihlah Jenis Barang Yang Akan Anda Kirimkan                     :");
                    jenis = faris.next().charAt(0);
                    System.out.print("Masukkan Berat Barang Anda (Dalam Bentuk Kg)                      :");
                    berat = faris.nextInt();
                    System.out.print("Masukkan Jarak Barang Yang Akan Anda Kirimkan (Dalam Bentuk Km)   :");
                    jarak = faris.nextDouble();

                    if (jenis == '1') {
                        System.out.println("Anda Memilih Gelas");
                        System.out.println("------------------");
                        System.out.println("a.Mudah Pecah");
                        System.out.println("b.Tidak Mudah Pecah");
                        System.out.print("Pilih Tipe Barang Gelas Anda:");
                        jenis = faris.next().charAt(0);

                        if (jenis == 'a') {
                            biaya = 25000 * berat * jarak;
                            System.out.println("");
                            System.out.println("Berat Barang Anda   : " + berat + " kg");
                            System.out.println("Jarak Barang Anda   : " + jarak + " km");
                            System.out.println("Biaya Barang Anda   : Rp." + biaya);
                        } else if (jenis == 'b') {
                            biaya = 15000 * berat * jarak;
                            System.out.println("");
                            System.out.println("Berat Barang Anda   : " + berat + "kg");
                            System.out.println("Jarak Barang Anda   : " + jarak + "km");
                            System.out.println("Biaya Barang Anda   : Rp." + biaya);
                        } else {
                            System.out.println("Data Yang Anda Masukkan Salah");

                        }
                    } else if (jenis == '2') {
                        System.out.println("Anda Memilih Plastik");
                        System.out.println("------------------");
                        System.out.println("a.Mudah Pecah");
                        System.out.println("b.Tidak Mudah Pecah");
                        System.out.print("Pilih Tipe Barang Plastik Anda:");
                        jenis = faris.next().charAt(0);

                        if (jenis == 'a') {
                            biaya = 14000 * berat * jarak * 0.2;
                            System.out.println("");
                            System.out.println("Berat Barang Anda   : " + berat + " kg");
                            System.out.println("Jarak Barang Anda   : " + jarak + " km");
                            System.out.println("Biaya Barang Anda   : Rp." + biaya);
                        } else if (jenis == 'b') {
                            biaya = 7000 * berat * jarak * 0.2;
                            System.out.println("");
                            System.out.println("Berat Barang Anda   : " + berat + " kg");
                            System.out.println("Jarak Barang Anda   : " + jarak + " km");
                            System.out.println("Biaya Barang Anda   : RP." + biaya);
                        } else {
                            System.out.println("Data Yang Anda Masukkan Salah");

                        }
                    }

                } else {
                    System.out.println("Data Yang Anda Tidak Terdeteksi");
                }
            
            }

      
        }
    

