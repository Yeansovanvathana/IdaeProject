package assignment;
import java.util.Scanner;
public class B8C {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Integer[] Class_C = {82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100
                , 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113,
                114, 115};
        Integer input = sc.nextInt();

        try {

            if
            (input >= 82 && input <= 99) {
                System.out.println("Welcome Section C student your ID is 11019010" + Class_C[input - 82].toString());
            } else if (input >= 99 && input <= 115) {
                System.out.println(("Welcome Section C student your ID is 1101901" + Class_C[input - 82].toString()));
            } else {
                throw new Exception("demo");
            }
        } catch (Exception e) {
            System.out.println("You are not from Section C");
        }
    }
}