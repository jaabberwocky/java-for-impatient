package com.tobias.corejava.exercises.ch02;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ex13 {

    public static void main(String[] args) throws IOException, CsvValidationException {

        var fileName = "src/main/resources/data/testdata1.csv";
        try (var fr = new FileReader(fileName, StandardCharsets.UTF_8);
             var reader = new CSVReader(fr)) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                for (var e : nextLine) {
                    System.out.format("%s | ", e);
                }
                System.out.print("\n");
            }
        }
    }
}
