package kg.ksucta.services;

import java.util.Scanner;

/**
 * Created by Aibek on 12.11.2016.
 */
public class DefaultConsoleIOService implements IOService {


    @Override
    public void write(String message) {
        System.out.println("/////////////////////////////////////////");
        System.out.println(message);
        System.out.println("/////////////////////////////////////////");
    }

    @Override
    public String scan(String message) {
        write(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    @Override
    public Integer scanInt(String message) {
        write(message);
        Scanner scanner = new Scanner(System.in);
        Integer input = null;
        try {
            input = scanner.nextInt();
        } catch (Exception e) {
           return scanInt(message);
        }
        scanner.close();
        return input;
    }
}
