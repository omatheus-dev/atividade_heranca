package application;

import entitties.Employee;
import entitties.OurSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Employeed #" + i + " data:");
            System.out.print("Outsourced (y/n)?: ");
            char confirmation = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (confirmation == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();

                Employee emp = new OurSourcedEmployee(name, hour, valuePerHour, additional);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hour, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp : list) {
            System.out.print(emp.getName() + " - $" + emp.Payment());
            System.out.println();
        }


        sc.close();
    }
}
