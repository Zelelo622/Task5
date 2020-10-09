package ru.vsu.num9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Shape width
        int w = readShapeWidth("(odd number greater than 3) --> ");

        drawFigure(w);
    }

    static boolean checkForEmptyElement(int i, int j, int w, int count) {

        if (i > 1) {
            if (j >= Math.round(w / 2) + 1 - count && j <= Math.round(w / 2) + 1 + count) {
                return false;
            }
        }
        return true;
    }

    static void drawFigure(int w) {
        int count = -1;

        if (w >= 3 && w % 2 == 1) {
            for (int i = 1; i <= w - i + 1; i++) {
                for (int j = 1; j <= w; j++) {
                    boolean print = checkForEmptyElement(i, j, w, count);
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
            System.out.print("You entered a variable value that does not meet the requirements!");
        }
    }

    static int readShapeWidth(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter width %s", name);
        return scanner.nextInt();
    }
}