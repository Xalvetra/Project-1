package quiz2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class DrWatsonQueue {

    public static String[] keluhan = {"Demam", "Flue", "Sakit Kepala", "Asma", "Diare", "Sakit Gigi", "Sakit Mata", "Keseleo", "Susah Tidur"};
    public static int[] waktu = {7, 5, 8, 4, 3, 11, 13, 6, 5};
    public static int[] count = new int[9];
    Node head;
    int size, time, no;
    double rataWaktu;
    String penyakit, nama;

    public DrWatsonQueue() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
        size = 0;
    }

//---------------------ENQUEUE--------------------------------
    public void Enqueue(DrWatsonQueue data) {
        if (isEmpty()) {
            head = new Node(data, head);
            size++;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data, null);
            size++;
        }
        add(data);
    }

    public void add(DrWatsonQueue data) {
        Node tmp = head;
        boolean cek = false;
        while (tmp.next != null) {
            if (tmp.data.equals(data)) {
                cek = true;
                break;
            }
            tmp = tmp.next;
        }
        if (!cek) {
            System.out.println("Antrian Sudah Ada");
            print(tmp);
            rataWaktu();
            System.out.println("");
        } else {
            System.out.println("Antrian Belum Ada");
        }
    }

//-------------------------ENQUEUE END-------------------------------
//-----------------------DEQUEUE--------------------------------
    public void dequeue() {
        Node tmp = head;
        System.out.println("Pasien Dipanggil");
        if (isEmpty()) {
            System.out.println("Antrian Tidak Ada");
        } else {
            if (tmp != null) {
                print(tmp);
                System.out.println("");
            } else {
                System.out.println("Antrian masih kosong");
            }
            head = head.next;
            size--;
        }
    }
//----------------------DEQUEUE END---------------------------------
//-----------------------SEARCH------------------------------------ 

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.data.nama;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data.nama;
    }
//----------------------SEARCH END------------------------------------
//----------------------CEK ANTRIAN------------------------------

    public int[] totalWaktu() {
        int count[] = new int[2];
        Node tmp = head;
        while (tmp != null) {
            count[0]++;
            count[1] += tmp.data.time;
            tmp = tmp.next;
        }
        return count;
    }

    public void rataWaktu() {
        int total[] = new int[2];
        total = totalWaktu();
        if (total[0] > 1) {
            rataWaktu = total[1] / total[0];
            System.out.println("Rata-rata Waktu Penanganan Pasien: " + rataWaktu + " menit");
        }
    }

    public void cekAntrian() throws Exception {
        int total[] = new int[2];
        total = totalWaktu();
        Node tmp = head;
        if (total[0] > 0 && tmp.next != null) {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
        }
        if (total[0] > 0) {
            System.out.println("\nData Antrian Saat ini\n------------------");
            System.out.println("Total antrian       : " + total[0]);
            System.out.println("Total waktu antrian :" + total[1] + " menit");
            System.out.println("Antrian Terdepan Pasien Bernama        : " + getFirst());
            System.out.println("Antrian Terbelakang Pasien Bernama     : " + getLast());
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong\n");
        }
    }

    public void cekAntrianByNo(int no) {
        int countQueue = 1, countTime = 0, i = no;
        Node tmp = head;

        if (tmp != null && no < tmp.data.no) {
            System.out.println("Pasien Telah Pulang");
        } else if (no >= tmp.data.no) {
            while (tmp != null && i < no) {
                countQueue++;
                countTime += tmp.data.time;
                tmp = tmp.next;
                i++;
            }
            int total[] = new int[2];
            total = totalWaktu();
            if (total[0] > 0 && tmp.next != null) {
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
            }

            System.out.println("Data Antrian");
            System.out.println("Antrian Sebelum Pasien No " + no + " = " + (total[0] - 1));
            System.out.println("Waktu Tunggu Pasien No " + no + " = " + (total[1] - total[0]) + " Menit");
            rataWaktu();
            System.out.println("");

        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void cekPasienByNo(int no) {
        Node temp = head;
        if (temp != null && no >= temp.data.no) {
            if (no > 1 && head.data.no != no) {
                temp = temp.next;
                for (int i = 2; temp != null && i < no; i++) {
                    if (no > i && temp.next != null && temp.data.no != no) {
                        temp = temp.next;
                    }
                }
            }
            System.out.println("Data Pasien No. Antrian " + no);
            print(temp);
            System.out.println("");
        } else if (temp != null && no < temp.data.no) {
            System.out.println("Pasien Sudah Pulang");
        } else {
            System.out.println("Antrian Kosong");
        }
    }
//------------------------CEK ANTRIAN- END----------------------------
//--------------------------STATISTIK---------------------------------   

    public void statistikKeluhan() {
        Node tmp = head;
        for (int i = 0; i < keluhan.length; i++) {
            tmp = head;
            while (tmp != null) {
                if (tmp.data.penyakit.equals(keluhan[i])) {
                    count[i] += 1;
                }
                tmp = tmp.next;
            }
            if (count[i] > 0) {
                System.out.println(keluhan[i] + "=" + count[i]);
            }
        }
        System.out.println("");
    }
//--------------------------STATISTIK END---------------------------------   

    private void print(Node index) {
        if (!isEmpty()) {
            Node tmp = index;
            System.out.println("Nomor Antrian Pasien: " + tmp.data.no);
            System.out.println("Nama Pasien: " + tmp.data.nama);
            System.out.println("Keluhan Pasien: " + tmp.data.penyakit);
            System.out.println("Perkiraan Penanganan: " + tmp.data.time + " menit");
        } else {
            System.out.println("Antrian kosong");
        }
    }
}