package nl.patrickkostjens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to FizzBuzz");
        try (final InputStreamReader streamReader = new InputStreamReader(System.in);
             final BufferedReader reader = new BufferedReader(streamReader)) {
            final FizzBuzz fizzBuzz = new FizzBuzz();

            while (true) {
                System.out.print("Please enter your number: ");
                String input = reader.readLine();
                Integer inputNumber;
                try {
                    inputNumber = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number");
                    continue;
                }
                if (inputNumber < 0) {
                    return;
                }
                String answer = fizzBuzz.getAnswer(inputNumber);
                System.out.println(answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
