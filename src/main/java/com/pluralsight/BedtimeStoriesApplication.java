package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStoriesApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Enter the name of a story: ");
            String storyName = scanner.nextLine().toLowerCase() + ".txt";

            if(storyName.contains(" ")) {
                storyName = storyName.replace(" ", "_");
            }

            FileReader fileReader = new FileReader(storyName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String currentLine;

            while((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (Exception e) {
            System.out.println("Error occurred");
        }


    }
}
