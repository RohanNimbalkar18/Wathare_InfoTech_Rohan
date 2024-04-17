import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) { 
                System.out.println(n + " is a prime number!");
            }
        }
    }   
}
