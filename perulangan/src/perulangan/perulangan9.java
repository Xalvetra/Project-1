package perulangan;

public class perulangan9 {

    public static void main(String[] args) {
        int r = 1;
        int i = 1;
        int a = 2;
        int n = 4;

        while (i <= n) {
            r = r * a;
            i++;
        }
        System.out.print(r);   
    }
}
