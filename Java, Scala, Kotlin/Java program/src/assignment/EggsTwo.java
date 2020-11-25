package assignment;
import java.util.Scanner;
public class EggsTwo
{
    public static void main(String[] args)
    {
        int eggs, dozen, individual;
        double price;
        final double priceOfDozen = 3.25;
        final double priceOfIndividual = 0.45;
        Scanner num = new Scanner(System.in);
        System.out.println("how many eggs do you want?");
        eggs = num.nextInt();
        dozen = eggs/12;
        individual = eggs %12;
        price = (dozen * priceOfDozen) + (individual * priceOfIndividual);
        System.out.println("You ordered "+eggs +" egg. That's " + dozen +" dozen and "+individual+" loose eggs at 45 cent each for a total of $"+price);

    }
}