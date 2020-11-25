package assignment;
import java.util.Scanner;
public class
BadSubscriptCaught {

    public static void main(String[] args)
    {
        String[] names = {"Vid", "Tong", "Heng", "long", "lin", "Vathana", "kid", "vuthy", "biv", "sna"};
        String integer;
        try
        {
            System.out.println("Please, enter an integer from 1 to 10 to display a name:");
            Scanner input= new Scanner(System.in);
            integer = input.next();
            int i = Integer.parseInt(integer);
            i = i-1;
            System.out.println(names[i]);
            input.close();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An Error message");
        }

    }

}
