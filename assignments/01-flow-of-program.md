QUESTION :
Input a year and find whether it is a leap year or not.
CODE:
 public class Main {
    public static void main(String[] args) {

        int year = 1994;

        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                ? "Leap Year"
                : "Not a Leap Year";

        System.out.println(result);
    }
}
OUTPUT:
Not a Leap Year

QUESTION:
 Take two numbers and print the sum of both.
 CODE:
 public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
OUTPUT:
Enter first number: 5
Enter second number: 7
Sum = 12

QUESTION:
 Take a number as input and print the multiplication table for it.
 CODE:
 import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
OUTPUT:
Enter a number: 67
67 x 1 = 67
67 x 2 = 134
67 x 3 = 201
67 x 4 = 268
67 x 5 = 335
67 x 6 = 402
67 x 7 = 469
67 x 8 = 536
67 x 9 = 603
67 x 10 = 670

QUESTION:
 Take 2 numbers as inputs and find their HCF and LCM
 CODE:
 import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        // Find HCF using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}

OUTPUT:
Enter first number: 54
Enter second number: 43
HCF = 1
LCM = 2322

QUESTION:
 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all
 CODE:
 import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            sum += Integer.parseInt(input);
        }

        System.out.println("Sum = " + sum);
    }
}
OUTPUT:
Enter a number (or x to stop): 23
Enter a number (or x to stop): 56
Enter a number (or x to stop): 43
Enter a number (or x to stop): x
Sum = 122
