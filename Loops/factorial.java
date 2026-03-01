import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a positive number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) return;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
    }
}
