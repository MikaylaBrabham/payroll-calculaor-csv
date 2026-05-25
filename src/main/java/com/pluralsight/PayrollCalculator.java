package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    //add main
    public static void main(String[] args) {
        //add try to enter file reader

        //add my scanner
        Scanner myScanner = new Scanner(System.in);

        //prompt the  user to enter name of file
        System.out.println("Enter the name of the employee file to process: ");
        String input = myScanner.nextLine();

        //prompt the user to create name of file
        System.out.println("Enter the name of the payroll file to create: ");
        String output = myScanner.nextLine();

        try {
            //add buff and file reader and writer
            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            //add input
            String inputs;

            //add while to print
            while ((inputs = reader.readLine()) != null) {
                String[] tokens = inputs.split("\\|");
                int id =
                        Integer.parseInt(tokens[0]);

                String name = tokens[1];

                double hoursWorked =
                        Double.parseDouble(tokens[2]);

                double payRate =
                        Double.parseDouble(tokens[3]);

                Employee employee =
                        new Employee(
                                id,
                                name,
                                hoursWorked,
                                payRate);

               writer.write(employee.getId() + "|" +
                       employee.getName() + "|" +
                       String.format("%.2f", employee.getGrossPay()));

                writer.newLine();
            }
// close reader and writer
            reader.close();
            writer.close();
            //create output that allows the user to know their state was successfully created

            System.out.println("file successfully created");
        }catch (Exception e) {

            System.out.println("Error creating payroll file.");
            e.printStackTrace();
        }
    }
}


