package testfaris;

import java.util.Scanner;

public class TestDoWhile {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("Masukkan Username :");
        username = sc.next();
        System.out.println("Masukkan Password :");
        password = sc.next();

        while ( !(username.equalsIgnoreCase("faris"))  &&   !(password.equalsIgnoreCase("rafi"))) {
            System.out.println("Masukkan Username :");
            username = sc.next();
            
            System.out.println("Masukkan Password :");
            password = sc.next();
        }
                    System.out.println("Welcome Faris");

    }

    }


