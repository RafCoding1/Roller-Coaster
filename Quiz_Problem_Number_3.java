import java.util.Scanner;  // Imports scanner, allowing user-input to be implemented
public class Quiz_Problem_Number_3 {
    public static void main(String[] args) {
        Scanner myKidName1 = new Scanner(System.in);  // First Scanner Object that will scan the input provided by user
        String Kid_1;  // First variable that will get kid #1's name
        Scanner myKidName2 = new Scanner(System.in); // Second Scanner Object that will scan the input provided by user
        String Kid_2; // Second variable that will get kid #2's name


        Scanner myKidAgeNum_1 = new Scanner(System.in);  // Third Scanner Object that will scan the user's input
        int kidAgeNum; // Variable for kid #1 whose age shall be provided by the user

        Scanner myKidAgeNum_2 = new Scanner(System.in); // Fourth Scanner Object that will scan the user's input
        int kidAgeNum_2; // Variable for kid #2 whose age shall be provided by the user

        Scanner rideAgeLimit = new Scanner(System.in); // Fifth Scanner Object that will scan user input
        int rideAge;  // Variable that shall be used to set the age limit for the roller coaster


        System.out.println("Problem: 2 kids are attempting to ride a roller-coaster at a park. The roller-coaster, " +
                "however, has a age limit that doesn't allow some kids to ride yet. ");
        System.out.println("Enter the age limit of the ride, the names of each kids, and their ages."); // Problem
        System.out.println("The program will display the result.");
        System.out.println("======================================"); // Formatting

        System.out.println("Enter the age limit of the ride: ");  // Prompts user to enter the ride's age limit
        rideAge = rideAgeLimit.nextInt();  /* Statement that assigns the rideAgeLimit Scanner object into the rideAge
        variable and allows the program to assign the user inputted value into the variable */
        System.out.println("The age limit of the roller-coaster is " + rideAge + " years old."); // Displays age limit

        System.out.println("======================================"); // Formatting

        System.out.println("Enter the name of the first child: ");  // Prompts user for the first child's name
        Kid_1 = myKidName1.next(); /* Statement that assigns the myKidName1 Scanner object into the Kid_1 variable and
        allows the program to assign the user inputted value into the variable */
        System.out.println("The first child's name is " + Kid_1); // Displays the user inputted Child name

        System.out.println("Provide the age of " + Kid_1 + ": ");  // Prompts user for the age of the first child
        kidAgeNum = myKidAgeNum_1.nextInt(); /* Statement that assigns the myKidAgeNum_1 Scanner object into the
        KidAgeNum variable and allows the program to assign the user inputted value into the variable */
        System.out.println(Kid_1 + " is " + kidAgeNum + " years old."); // Displays the age of the first child

        System.out.println("======================================");

        System.out.println("Enter the name of the second child: ");
        Kid_2 = myKidName2.next();
        System.out.println("The second child's name is " + Kid_2);

        System.out.println("Provide the age of " + Kid_2 + ": ");
        kidAgeNum_2 = myKidAgeNum_2.nextInt();
        System.out.println(Kid_2 + " is " + kidAgeNum_2 + " years old.");


        // Putsd in conditionals
        if (kidAgeNum_2 < rideAge) {
            System.out.println("The age limit of the roller coaster is " + rideAge);
            System.out.println(Kid_2 + " is too young to ride this roller coaster.");

        } else if (kidAgeNum < rideAge) {
            System.out.println("The age limit of the roller coaster is " + rideAge);
            System.out.println(Kid_1 + " is too young to ride this roller coaster.");


        } else if (kidAgeNum > rideAge) {
            System.out.println("The age limit of the roller coaster is " + rideAge);
            System.out.println(Kid_1 + " is able to ride this roller coaster");


        } else if (kidAgeNum_2 > rideAge) {
            System.out.println("The age limit of the roller coaster is " + rideAge);
            System.out.println(Kid_2 + " is able to ride this roller coaster.");


        }

    }

}