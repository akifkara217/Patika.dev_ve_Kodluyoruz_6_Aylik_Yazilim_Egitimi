import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int us, taban, i, j, sonuc=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Us girin");
        us = input.nextInt();

        System.out.println("Taban girin");
        taban = input.nextInt();

        for ( i=1 ; i<=us ; i++) {
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}