package assignment;
import java.util.Scanner;

public class CategorizeStrings {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        final int size = 10;
        int count = 0;
        int short_word = 0;
        int long_word = 0;
        String[] strArray1 = new String[size];
        String[] strArray2 = new String[size];
        System.out.println("Enter string or enter "+ "\"quit\" to stop");
        System.out.println("Enter string"+(count + 1)+":" );
        String userinput = scan.nextLine();
        while (!userinput.equals("quit") && count <(size-1)) {
            if (userinput.length() <= 10) {
                strArray1[short_word] = userinput;
                short_word++;
            } else {
                strArray2[long_word] = userinput;
                long_word++;
            }
            count++;

            System.out.println("Enter String " + (count + 1) + ":");
            userinput = scan.nextLine();
        }
        String userChoice ="Long";
        System.out.println("Enter short(10 characters" + "or fewer)/long(more than 10" +"Characters) string:");
        userChoice = scan.nextLine();
        if (userChoice.equals("short"))
        {
         System.out.println("list of short thing");
         for(int index = 0; index<short_word; index++)
             System.out.println(strArray1[index]);
        }
        else
        {
            System.out.println("List of long strings");
            for(int index = 0; index<long_word; index++)
                System.out.println(strArray2[index]);
        }

    }
}
