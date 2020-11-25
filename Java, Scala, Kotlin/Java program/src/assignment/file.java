package assignment;
import java.io.FileInputStream;

public class file {

    public static void main(String agr[]){

        try {
            FileInputStream s= new FileInputStream("/home/kit/Vathana/good afternoon");
            int J = 0;
            while ((J = s.read())!= 32){
                System.out.print((char) J);
            }
        }

        catch (Exception e){
            System.out.println(e);

        }
    }
}

