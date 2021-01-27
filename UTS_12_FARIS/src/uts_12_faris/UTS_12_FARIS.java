package uts_12_faris;
import java.util.Scanner;
public class UTS_12_FARIS {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int tanggalPinjam,tanggalKembali,tanggal,denda;
        String buku = null,nama,alamat,noHp;
        char input;
        
        System.out.println("Perpustakaan Kota Malang");
        System.out.println("a. Peminjaman");
        System.out.println("b. Pengembalian");
        System.out.print("Masukkan Pilihan Anda:");
        input = faris.next().charAt(0);
        
        if(input == 'a'){
            System.out.println("Menu Peminjaman");
            System.out.print("Masukan Nama Anda             :");
            nama=faris.next();
            System.out.print("Alamat Anda                   :");
            alamat=faris.next();
            System.out.print("Masukan Nomor Handphone Anda  :");
            noHp=faris.next();
            System.out.print("Masukan Tanggal Pinjam        :");
            tanggalPinjam=faris.nextInt();
            System.out.print("Buku Yang Dipinjam            :");
            buku=faris.next();
            
            System.out.println("BUKTI PEMINJAMAN");
            System.out.println("Nama Anda              :" +nama);
            System.out.println("Alamat Anda            :" +alamat);
            System.out.println("Nomor Handphone Anda   :" +noHp);
            System.out.println("Tanggal Peminjaan Anda :" +tanggalPinjam);
            System.out.println("Buku Yang Anda Pinjam  :" +buku);
            
            
           
    }else if(input == 'b'){
            
            
            System.out.println("Menu Pengembalian");
            System.out.print("Masukan Nama Anda:");
            nama=faris.next();
            System.out.print("Alamat Anda:");
            alamat=faris.next();
            System.out.print("Masukan Nomor Handphone Anda:");
            noHp=faris.next();
            System.out.print("Masukan Tanggal Pinjam:");
            tanggalPinjam=faris.nextInt();
            System.out.print("Masukan Tanggal Pengembalian:");
            tanggalKembali=faris.nextInt();
            System.out.print("Buku Yang Dipinjam:");
            nama=faris.next();
            tanggal= tanggalKembali-tanggalPinjam;
            
            if(tanggal >3){
                System.out.println("Anda Melebihi Waktu Yang Ditentukan");
                denda = 5000 * tanggal;
                            
            System.out.println("BUKTI PEMINJAMAN");
            System.out.println("Nama Anda              :" +nama);
            System.out.println("Alamat Anda            :" +alamat);
            System.out.println("Nomor Handphone Anda   :" +noHp);
            System.out.println("Buku Yang Anda Pinjam  :" +buku);
            System.out.println("Keterlambatan Anda     :" +tanggal);
            System.out.println("Anda Harus Membayar Denda Sebesar : Rp." +denda);
            
            }else{
            System.out.println("BUKTI PEMINJAMAN");
            System.out.println("ANDA TEPAT WAKTU");
            System.out.println("Nama Anda              :" +nama);
            System.out.println("Alamat Anda            :" +alamat);
            System.out.println("Nomor Handphone Anda   :" +noHp);
            System.out.println("Buku Yang Anda Pinjam  :" +buku);

            }
            
            
           
            
            
    }else{
        System.out.println("Data Yang Anda Masukkan Salah!");
    }
        
       
    
    
}
}