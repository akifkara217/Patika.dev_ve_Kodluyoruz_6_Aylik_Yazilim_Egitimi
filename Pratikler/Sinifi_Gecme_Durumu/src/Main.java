import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double avarage;
        Scanner input = new  Scanner(System.in);

        System.out.println("Mat notunuz : ");
        mat = input.nextInt();

        System.out.println("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();

        if((mat<=100 && mat>=0) && (fizik<=100 && fizik>=0) && (turkce<=100 && turkce>=0) && (kimya<=100 && kimya>=0) && (muzik<=100 && muzik>=0)) {
            avarage = (mat + fizik + turkce + kimya + muzik) / 5;
            if(avarage <= 55) {
                System.out.println("Sinifta kaldiniz !");
            }
            else{
                System.out.println("Tebrikler, sinifi gectiniz !");
            }
            System.out.println("Ortalamaniz :" + avarage);
        }
        else{
            System.out.println("Lutfen 0 ile 100 arasinda bir deger giriniz !");
        }
    }
}