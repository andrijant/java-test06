package javaapplication6;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter year of birth: ");
        int yearOfBirth = s.nextInt();
        
        if ( yearOfBirth % 2 == 0 ){
            
            System.out.println("Year of birth is an even number.");
            
        } else {
        
            System.out.println("Year of birth is an odd number.");
        }
        
        System.out.println("End.");
        
//      example 2
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year of birth: ");
        int yearOfBirth2 = sc.nextInt();
        
        if ( yearOfBirth2 >= 2000 ){
            
            System.out.println("You were born after 2000.");
            
        } else {
        
            System.out.println("You were born before 2000.");
        }
        
        System.out.println("End.");
        
//      example3
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter year of birth: ");
        int yearOfBirth3 = scan.nextInt();
        
        if ( yearOfBirth3 <= 2000 && yearOfBirth3 %2 == 0 ){
             System.out.println("1. You were born before 2000. and year of birth is an even.");
        } else {
        
            if ( yearOfBirth3 <= 2000 ){
                 System.out.println("2. You were born before 2000.");
            } else {
                 System.out.println("3. You were born after 2000.");
            }
            
            if ( yearOfBirth3 %2 == 0 ){
                System.out.println("4. Year of birth is an even number.");
            }else {
                System.out.println("5. Year of birth is an odd number.");
            }
            
        }
        System.out.println("End!");
    }
    
};
