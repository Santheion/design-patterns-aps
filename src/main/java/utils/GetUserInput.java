package utils;

import java.util.Scanner;

public class GetUserInput {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }
}
