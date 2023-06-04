import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        sayi=input.nextInt();
        int tmpSayi=sayi;
        int toplam=0;
        while (tmpSayi != 0) {
            toplam += tmpSayi % 10;
            tmpSayi /= 10;
        }
        System.out.println("Sayının basamakları toplamı = " + toplam);
    }
}