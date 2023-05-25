import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kg cinsinden kilonuzu giriniz: ");
        int kg = input.nextInt();

        System.out.println("Metre cinsinden boyunuzu giriniz: ");
        double m = input.nextDouble();

        double index = (kg/(m*m));
        System.out.println("Vucut kitle indexiniz = " + index);

    }
}
