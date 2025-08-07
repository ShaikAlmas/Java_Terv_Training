package newproject;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        // Process
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';

        // Output
        System.out.println("\n--- Report Card ---");
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);
    }
	}
