import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Choose any options above: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    for (int j = 0; j < 3; j++) {
                        for (int i = 0; i < 7; i++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int a = 0; a < 5; a++) {
                        for (int b = 0; b < a; b++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int c = 5; c >= 1; c--) {
                        for (int d = 1; d < c; d++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
            }
        } while (option != 4);
    }
}


