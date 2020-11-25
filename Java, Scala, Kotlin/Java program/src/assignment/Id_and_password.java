package assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Id_and_password {
        public static void main(String args[])throws Exception {

            File file = new File("/home/kit/Vathana/idandpwd");
            String id;
            String get = "";
            String password;
            String str ;
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((str=br.readLine())!= null) {
                get = str;
            }
            String delimiter =" ";
            String [] I;
            I = get.split(",");

            String Id_username = I[0];
            String pwd = I[1];
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your username:");
            id = s.next();
            System.out.println("Enter your password:");
            password = s.next();
            if (id.equals(Id_username) && password.equals(pwd)){

                System.out.println("Welcome to play game *+*");
            }
            else {
                System.out.println("Your id and password incorrect, let try it again..");
            }
        }
}


