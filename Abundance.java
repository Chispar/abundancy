import java.util.HashSet;
import java.util.Scanner;

public class Abundance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> factors = new HashSet<>();
        int number;
        int sum = 0;
        System.out.println("Enter a number to check Abundancy");
        number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                factors.add(i);
            }
        }
        for (int factor : factors){
            sum += factor;
        }
        if (sum > number){
            System.out.println("Abundancy is achieved.");
        }else {
            System.out.println("Abundancy is not achieved.");
        }
    }
}