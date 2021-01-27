package perulangan;

public class perulangan11 {

    public static void main(String[] args) {
        int n = 5;
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println(n + "!= " + hasil);

    }
}
