import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap, merkezAcisi, pi = 3.14, dilimAlani;
        Scanner input = new Scanner(System.in);

        System.out.print("Yaricapi giriniz: ");
        yaricap = input.nextInt();

        System.out.print("Merkez acisini giriniz: ");
        merkezAcisi = input.nextInt();

        dilimAlani = ((pi*(yaricap*yaricap)*merkezAcisi)/360);

        System.out.print("Dilim alani = " + dilimAlani);

    }
}