import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Logic 1
        int max1;
        if (a > b && a > c)
            max1 = a;
        else if (b > c)
            max1 = b;
        else
            max1 = c;

        // Logic 2
        int max2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Logic 3
        int max3 = Math.max(a, Math.max(b, c));

        System.out.println("Maximum using if-else        : " + max1);
        System.out.println("Maximum using ternary        : " + max2);
        System.out.println("Maximum using Math.max()     : " + max3);

        sc.close();
    }
}
