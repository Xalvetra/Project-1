package perulangan;

public class perulangan10 {

    public static void main(String[] args) {
        int r = 1;
        int n = 5;
        boolean stop = false;

        int i = 1;
        while (!stop) {
            if (i >= n) {
                stop = true;
            } else {
                if (i % 2 == 1) {
                    System.out.print('#');
                } else {
                    System.out.print("*");
                }
                i++;
            }
        }
    }
}