import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("sayı giriniz:");
            n = scan.nextInt();
            if ( n % 4 == 0) {
                sum += n; // varsayılan deger yoksa //  sum=sum+n; seklinde olurdu.
            }
        } while (n % 2 != 1);
        System.out.println("toplam:" + sum);

    }

}