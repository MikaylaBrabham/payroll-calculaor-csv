package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollCalculator {
    //add main
    public static void main(String[] args) {
        //add try to enter file reader

        try {
            //add buff and file
            BufferedReader reader = new BufferedReader(new FileReader("employee.csv"));

            //add input
            String input;

            //add while to print
            while ((input = reader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                int id =
                        Integer.parseInt(tokens[0]);

                String name = tokens[1];

                double hoursWorked =
                        Double.parseDouble(tokens[2]);

                double payRate =
                        Double.parseDouble(tokens[3]);

                Employee employee =
                        new Employee(
                                (float) id,
                                name,
                                (float) hoursWorked,
                                (float) payRate);

                System.out.printf(
                        "ID: %d Name: %s Gross Pay: %.2f%n",
                        employee.getId(),
                        employee.getName(),
                        employee.getGrossPay());
            }

            reader.close();
        }
        catch (Exception e) {

            System.out.println("Error reading payroll file.");
        }
    }
}


