import java.util.Scanner;

public class literals {
    public static void main(String[] args) {
        System.out.println("Take the input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("ENTER number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of the number");
        System.out.println(sum);
    }
}
