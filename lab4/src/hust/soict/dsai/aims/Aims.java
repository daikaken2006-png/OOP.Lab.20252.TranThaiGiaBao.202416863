package hust.soict.dsai.aims;

import java.util.Scanner;

public class Aims {

    public static void showMenu() {

        System.out.println("AIMS:");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        while (true) {

            showMenu();

            int choice =
                    scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println(
                            "View store"
                    );

                    break;

                case 2:

                    System.out.println(
                            "Update store"
                    );

                    break;

                case 3:

                    System.out.println(
                            "Current cart"
                    );

                    break;

                case 0:

                    System.exit(0);
            }
        }
    }
}