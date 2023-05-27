import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, cevap, yeniSifre;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adi giriniz : ");
        userName = input.nextLine();

        System.out.println("Sifre giriniz : ");
        password = input.nextLine();

        if( userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris basarili !");
        }
        else {
            System.out.println("Bilgiler yanlis, sifreyi sifirlamak ister misiniz? !");
            cevap = input.nextLine();
            if((cevap.equals("Evet") || cevap.equals("evet"))){
                System.out.println("Yeni sifreyi giriniz : ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("java123")){
                    System.out.println("Sifre önceki sifreyle ayni, lütfen baska sifre giriniz !");
                }
                else{
                    System.out.println("Sifre olusturuldu !");
                }
            }
            else{
                System.out.println("Sistemden cikis yapildi !");
            }
        }

    }
}