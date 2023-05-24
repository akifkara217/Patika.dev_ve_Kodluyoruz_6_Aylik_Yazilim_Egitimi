import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("muzik Notunuz : ");
        muzik = inp.nextInt();

        double sonuc = ((mat + fizik + kimya + turkce + tarih + muzik)/6.0);
        System.out.println("Ortalamaniz : " + sonuc);

        boolean degerlendir = sonuc >= 60;
        String str = degerlendir ? "Gecti" : "Kaldi";
        System.out.println(str);

    }
}