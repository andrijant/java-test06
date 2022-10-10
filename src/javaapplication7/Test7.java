package javaapplication7;

import java.util.Scanner;

public class Test7 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the city: ");
        
        String cityName = s.nextLine();
        
        cityName = cityName.trim();
        cityName = cityName.toUpperCase();
        
        if (cityName.equals("BELGRADE") || cityName.equals("NOVI SAD")) {// (cityName == "Beograd")
            System.out.println("We have a representative office in " + cityName + ".");
        } else {
            System.out.println("We do not have a representative office in " + cityName + ".");
        }
            
    }
    
}
