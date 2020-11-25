package assignment;

import java.util.Scanner;

class QuartsToGallonslnteractive {
    public static void main(String[] arge){
        System.out.println("Enter the amount of quart:");
        Scanner s = new Scanner(System.in);
        String quart = s.next();
        try {
            Double Quallon=Double.parseDouble(quart)/4;
            System.out.println("The amount of Quallon is:" +Quallon);
        }
        catch (Exception e){
            System.out.println("Do not enter the Nonnumeric value");
        }
    }
}