package bot;

import java.util.Scanner;

public class SimpleBot {
    static String name = "Travis Scott";
    static int yearOfBirth = 2024;
    static final Scanner s = new Scanner(System.in);
    static String userName;

    public static void main(String[] args) {
        introduceBot();
        introduceUser();
        guessingGame();
        countingMethod();
        test();
        end();
    }

    static void introduceBot() {
        System.out.printf("""
                Hello! my name is %s.\s
                I was created in %d.\s
                """, name, yearOfBirth);
    }

    static void introduceUser() {
        System.out.println("Please, remind me your name.");
        userName = s.nextLine();
        System.out.printf("What a great name you have, %s! \n", userName);
    }

    static void guessingGame() {
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = s.nextInt();
        int remainder5 = s.nextInt();
        int remainder7 = s.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming! \n", age);
    }

    static void countingMethod() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = s.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");

        while(true) {
            int answer = s.nextInt();
            if (answer == 2) {
               break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }

}