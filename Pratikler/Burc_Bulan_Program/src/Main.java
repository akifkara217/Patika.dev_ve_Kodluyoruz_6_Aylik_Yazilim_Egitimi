import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Kacinci ayda dogdunuz?");
        month = input.nextInt();

        System.out.println("Kacinci gunde dogdunuz?");
        day = input.nextInt();

        if (month == 1){
            if (day>=1 && day<=31) {
                if (day < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";
                }
            }
            else {
                isError = true;
            }
        } else if (month == 2) {
            if (day>=1 && day<=31) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balik";
                }
            }
            else {
                System.out.println("Gecersiz gun girdiniz !");
            }

        }
        else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz !");
        }
        else{
            System.out.println("Merhaba, burcunuz : " + burc);
        }
    }
}