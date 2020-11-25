package assignment;
import java.util.Scanner;

public class Doubleinput {

    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    double num;
    try{
        System.out.print("Input a number: ");
        num = Double.parseDouble(S.nextLine());
    }
    catch(NumberFormatException e){
        num = 0;
        System.out.println("An Error message");
    }
        System.out.println(num);
    }

}
