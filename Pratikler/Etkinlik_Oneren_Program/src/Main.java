import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if ((heat <= 15) && (heat >= 5)){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if ((heat <= 25) && (heat >= 10)){
            System.out.println("Piknige gidebilirsiniz");
        }
        else{
            System.out.println("Yüzmeye girebilirsiniz");
        }
    }
}