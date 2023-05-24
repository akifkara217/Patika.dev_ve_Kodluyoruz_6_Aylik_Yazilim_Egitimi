import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran , kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutari giriniz: ");
        tutar =  input.nextDouble();

        kdvOran = tutar < 1000 ? 0.18 : 0.08;
        kdvTutar = kdvOran*tutar;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("Kdv'siz tutar: " + tutar);
        System.out.println("Kdv orani: " + kdvOran);
        System.out.println("Kdv tutari: " + kdvTutar);
        System.out.println("Kdvli tutari: " + kdvliTutar);

    }
}