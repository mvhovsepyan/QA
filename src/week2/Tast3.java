package week2;

import java.util.Scanner;

public class Tast3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double r =scanner.nextDouble();
        double perimeter = 2 * pi * r;
        System.out.println(perimeter);
        double rad = pi*r*r;
        System.out.println(rad);
    }
}
