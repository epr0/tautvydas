package com.tautvydas.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExampleMain {

    public static final String FILE_LOCATION_LOCAL = "D:\\Dropbox\\PROGRAMAVIMAS\\IdeaProjects\\2_JavaFundamentals\\src\\com\\tautvydas\\file_read\\scanner\\TextFileResource.txt";

    public static void main(String[] args) {
        // Need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION_LOCAL));
            System.out.println(fileScanner.hasNext());
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

    }
}