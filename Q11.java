import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int currentSum = 0;
        int totalSum = 0;

        for(int i = 1; i <= n; i++) {
            currentSum = currentSum + i;
            totalSum = totalSum + currentSum;
        }

        System.out.println("Final Sum = " + totalSum);

        sc.close();
    }
}
