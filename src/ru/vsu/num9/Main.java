package ru.vsu.num9;

import java.util.Scanner;

public class Main {

    private static int count = -1;

    public static void main(String[] args) {
        // Shape width
        int w = readingShapeWidth("(odd number greater than 3) --> ");

        drawingStars(w);
    }

    static boolean checkingForEmptyElement(int i, int j, int w) {
        if (i > 1) {
            if (j >= Math.round(w / 2) + 1 - count && j <= Math.round(w / 2) + 1 + count) {
                return false;
            }
        }
        return true;
    }

    static void drawingStars(int w) {
        boolean print = true;

        if (w >= 3 && w % 2 == 1) {
            for (int i = 1; i <= w - i + 1; i++) {
                for (int j = 1; j <= w; j++) {
                    print = checkingForEmptyElement(i, j, w);
                    if (print) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                count++;
                System.out.println();
            }
        } else {
            System.out.print("None");
        }
    }

    static int readingShapeWidth(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter width %s", name);
        return scanner.nextInt();
    }
}