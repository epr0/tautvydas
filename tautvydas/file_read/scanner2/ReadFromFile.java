package com.tautvydas.file_read.scanner2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

    public static final String FILE_LOCATION_LOCAL = "src/com/tautvydas/file_read/scanner2/naujas.txt";

    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION_LOCAL));
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
    }
}
