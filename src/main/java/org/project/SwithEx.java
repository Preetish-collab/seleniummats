package org.project;

import java.util.Scanner;

public class SwithEx {
    public static void main(String[] args) {
        System.out.println("Enter a day from  the week:");
        Scanner scan=new Scanner(System.in);
        String day=scan.nextLine();
        String message;

        switch (day) {
            case "Monday":
                message = "Start of the work week!";
                break;
            case "Tuesday":
                message = "It's Tuesday, keep going!";
                break;
            case "Wednesday":
                message = "Midweek already!";
                break;
            case "Thursday":
                message = "Almost the weekend!";
                break;
            case "Friday":
                message = "Last day of the work week!";
                break;
            case "Saturday":
            case "Sunday":
                message = "It's the weekend, enjoy!";
                break;
            default:
                message = "Invalid day!";
                break;
        }

        System.out.println(message);
    }
}
