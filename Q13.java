import java.util.*;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 27, guess, count = 0;

        do {
            System.out.print("Enter number: ");
            guess = sc.nextInt();
            count++;
        } while (guess != secret);

        System.out.println("Correct! Attempts = " + count);

        sc.close();
    }
}
