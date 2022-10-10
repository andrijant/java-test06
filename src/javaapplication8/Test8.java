
package javaapplication8;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter real number: ");
        
        double number = s.nextDouble();
        
        double sqrtNumber = Math.sqrt(number);
        
        if (sqrtNumber == 5.0){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect*!");
        }
      
        
    }
    
}
