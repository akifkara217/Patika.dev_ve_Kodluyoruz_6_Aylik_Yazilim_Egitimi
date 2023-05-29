import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int km,yas,tip;
        double netfiyat,brutfiyat;

        System.out.print("Lütfen Km değerini giriniz");
        km=input.nextInt();
        if(km>0)
        {
            brutfiyat=km*0.1;
            System.out.print("Yaşınızı Giriniz");
            yas=input.nextInt();
            if (yas>=0 && yas<=12)
            {
                netfiyat=brutfiyat-brutfiyat*0.5;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip=input.nextInt();
                if (tip==1)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
                else if (tip==2)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
            }
            else if (yas>12 && yas<24)
            {
                netfiyat=brutfiyat-brutfiyat*0.5;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip=input.nextInt();
                if (tip==1)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
                else if (tip==2)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
            }
            else if (yas>=65)
            {
                netfiyat=brutfiyat-brutfiyat*0.3;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip=input.nextInt();
                if (tip==1)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
                else if (tip==2)
                {
                    netfiyat=netfiyat-netfiyat*0.2;
                    System.out.println("mesafe: "+km);
                    System.out.println("indrimsiz fiyat: "+ brutfiyat);
                    System.out.println("yaş " +yas);
                    System.out.println("tutar: "+ netfiyat);
                }
            }
            else if (yas<0)
            {
                System.out.print("Geçersiz bir yaş değeri girdiniz");
            }

        }
        else
            System.out.print("Hatalı Bir ifade girdiniz");
        
    }
}
