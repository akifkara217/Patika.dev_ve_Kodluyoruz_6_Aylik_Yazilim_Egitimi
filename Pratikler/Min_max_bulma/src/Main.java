import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n, i;
        Scanner input = new Scanner(System.in);

        System.out.println("N sayisi girin : ");
        n = input.nextInt();
        int [] numbers = new int[n];

        System.out.println("Inputlari girin : ");
        for (i=0; i<n; i++){
            numbers [i] = input.nextInt();
        }
        Arrays.sort(numbers);

        System.out.println("Entered minimum number is: "+ numbers[0]);
        System.out.println("Entered maximum number is: "+ numbers[n-1]);
    }
}