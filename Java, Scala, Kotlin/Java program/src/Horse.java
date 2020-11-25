//import java.util.*;
//public class Horse
//{
//    private static String name;
//    private static String color;
//    private static String birthYear;
//
//public static void main(String[] args)
//{
//    Scanner sc= new Scanner(System.in);
//    System.out.print("Please enter name of the horse:");
//    name = sc.nextLine();
//    System.out.print("Please enter color of the horse:");
//    color = sc.nextLine();
//    System.out.print("Please enter birth year of the horse:");
//    birthYear = sc.nextLine();
//
//    System.out.println("Your horse name: "+name);
//    System.out.println("Your horse color: "+color);
//    System.out.println("Your horse birthYear is: "+birthYear);
//
//}
//}


//class RaceHorse extends Horse
//{
//    private static int raceNum;
//
//    public static void main(String[] args) {
//
//        Scanner S1 = new Scanner(System.in);
//        System.out.println("Please enter number of the horse's races:");
//        raceNum = S1.nextInt();
//        System.out.println("your horse for "+raceNum+" time");
//
//    }
//}
import java.util.Scanner;

public class Horse{
    String name;
    String color;
    Integer birth_year;

    Scanner S = new Scanner(System.in);

    public String getname()
    {
        return name;
    }
    public String getcolor()
    {
        return color;
    }
    public Integer getbirth_year()
    {

        return birth_year;
    }

    public void setname(){
        System.out.println("Please Enter the horse name:");
        String names = S.next();
        name = names;
    }
    public void setcolor(){
        System.out.println("Please Enter the horse color:");
        String colors = S.next();
        color = colors;
    }
    public void setbirth_year(){
        System.out.println("Please Enter the horse birth year:")  ;
        Integer birth_years = S.nextInt();
        birth_year = birth_years;
    }
    public static void main(String[] args){

        var Horse = new Horse();
        var Race = new RaceHorse();
        Horse.setname();
        Horse.setcolor();
        Horse.setbirth_year();
        Race.setRacename();


        System.out.println("The horse name is " + Horse.getname());
        System.out.println("The horse color is " + Horse.getcolor());
        System.out.println("The horse birth year is " + Horse.getbirth_year());
        System.out.println("The horse race name is " + Race.getRacename());


    }
}




class RaceHorse extends Horse{
    String racename;
    public String getRacename()
    {
        return racename;
    }
    public void setRacename()
    {
        System.out.println("Please Enter the RaceHorse name");
        String racenames = S.next();
        racename = racenames;
    }
}