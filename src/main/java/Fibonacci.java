import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Find the number in the Fibonacci range");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index in the Fibonacci range");
        int index = scanner.nextInt();

        int result = findValue(index);
        System.out.println("The value at position " + index + " in the Fibonacci range is " + result);
    }
    public static int findValue(int index) {
        if(index<3) return 1;

        return findValue(index - 2) + findValue(index - 1);


    }
}
