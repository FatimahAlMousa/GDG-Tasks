import java.util.*;
import java.time.LocalDate;

public class Task41 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        boolean flag = false;
        
        do {
        try {
        System.out.print("What is your current age? ");
        int age = input.nextInt();
        
        System.out.print("At what age would you like to retire? ");
        int desiredRetirementAge = input.nextInt();
        
        int remainingYears = desiredRetirementAge - age;
        int yearOfRetirement = remainingYears + currentYear;
        
        flag = true;
        
        if(age > desiredRetirementAge )
            System.out.println("You can already retire.");
        
        else {
        System.out.printf("You have %d years left until you can retire.", remainingYears);
        System.out.printf("\nIt's %d, so you can retire in %d.", currentYear, yearOfRetirement); }
        
        } catch(InputMismatchException e) {
            System.err.println("Error: invalid input, please enter integer values.");
            input.nextLine();
        }
        
    }while(!flag); 
        input.close();
}}