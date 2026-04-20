package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStoriesApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter the name of a story: ");
            String storyName = scanner.nextLine().toLowerCase() + ".txt";

            if (storyName.contains(" ")) {
                storyName = storyName.replace(" ", "_");
            }

            FileReader fileReader = new FileReader("src/main/resources/" + storyName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String currentLine;
            int currentLineNumber = 1;

            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLineNumber + ". " + currentLine);
                currentLineNumber++;
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
        }


    }
}
