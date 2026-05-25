package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollCalculator {
    //add main
    public static void main(String[] args) {
        //add try to enter file reader

        try {
            //addd buff and file
            BufferedReader reader = new BufferedReader(new FileReader("employee.csv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
