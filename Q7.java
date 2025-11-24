import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int min = (a < b && a < c) ? a : (b < c ? b : c);

        System.out.println("Minimum of " + a + ", " + b + " and " + c + " is: " + min);

        sc.close();
    }
}
