package uts_semester2;
/**
 *
 * @author Faris Ikhlasul H
 */
public class UTSProcess {
    public char[] nama = {'f', 'a', 'r', 'i', 's', 'i', 'k', 'h', 'l', 'a', 's', 'u', 'l', 'h', 'a', 'q'};
    public UTSProcess() {
    }
    void Merge(char arr[], int x, int y, int z) {
        int n1 = y - x + 1;
        int n2 = z - y;
        char Left[] = new char[n1];
        char Right[] = new char[n2];
        for (int i = 0; i < n1; ++i) {
            Left[i] = arr[x + i];
        }
        for (int j = 0; j < n2; ++j) {
            Right[j] = arr[y + 1 + j];
        }
        int i = 0, j = 0;
        int k = x;
        while (i < n1 && j < n2) {
            if (Left[i] < Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    void Sort(char arr[], int x, int z) {
        if (x < z) {
            int m = (x + z) / 2;

            Sort(arr, x, m);
            Sort(arr, m + 1, z);

            Merge(arr, x, m, z);
        }
    }
    void printArray(char[] arr, int cari) {
        if (arr == null) {
            return;
        }
        int bawah = 0, atas = arr.length - 1;
        int pos = -1;
        while (bawah <= atas) {
            int mid = (atas - bawah) / 2 + bawah;
            if (arr[mid] > cari) {
                atas = mid - 1;
            } else if (arr[mid] == cari) {
                pos = mid;
                atas = mid - 1;
            } else {
                bawah = mid + 1;
            }
        }
        int posEnd = -1;
        bawah = 0;
        atas = arr.length - 1;
        while (bawah <= atas) {
            int mid = (atas - bawah) / 2 + bawah;
            if (arr[mid] > cari) {
                atas = mid - 1;
            } else if (arr[mid] == cari) {
                posEnd = mid;
                bawah = mid + 1;
            } else {
                bawah = mid + 1;
            }
        }
        if (pos != -1 && posEnd != -1) {
            System.out.print("ditemukan pada indeks ke: ");
            for (int i = 0; i + pos <= posEnd; i++) {
                if (i > 0) {
                    System.out.print(',');
                }
                System.out.print(i + pos);
            }
        }
    }
    void SeqSearch(char[] arr, char cari) {
        boolean cek = false;
        int name = arr.length;
        int[] temp = new int[name];

        for (int j = 0; j < name; j++) {
            if (arr[j] == cari) {
                temp[j] = j;
                cek = true;
            }
        }
        System.out.print("Huruf '" + cari + "' ditemukan pada indeks ke: ");
        for (int i : temp) {
            if (i > 0) {
                System.out.print(i + ",");
            }
        }

        if (!cek) {
            System.out.println("Data " + cari + " Tidak Ada");
        }
    }
    void TampilData(char arr[]) {
        int name = arr.length;
        for (int i = 0; i < name; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}