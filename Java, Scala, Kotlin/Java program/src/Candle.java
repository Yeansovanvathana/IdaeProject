import java.util.Scanner;

public class Candle {
    String color;
    Integer height;
    Integer price;

    Scanner S = new Scanner(System.in);

    public void setcolor()
    {
        System.out.println("Please enter the color of the candle: ");
        String colors = S.next();
        color = colors;
    }
    public void setheight()
    {

        System.out.println("Please enter the height of the candle: ");
        Integer heights = S.nextInt();
        height = heights;
        price = height * 2;
    }

    public String getcolor()
    {
        return color;
    }
    public Integer getheight()
    {
        return height;
    }
    public Integer getprice()
    {
        return price;
    }

    public static void main(String[] args)
    {
        var C = new Candle();
        var SC = new ScentedCandle();
        C.setcolor();
        C.setheight();
        SC.setscent();
        SC.setheight();

        System.out.println("The "+C.getheight()+"inch "+C.getcolor()+" candle cost "+C.getprice()+"$");
        System.out.println("The "+C.getheight()+"inch "+SC.getscent()+" "+C.getcolor()+" candle cost "+SC.getprice()+"$");

    }
}



class ScentedCandle extends Candle {
    String Scent;
    public void setscent()
    {
        System.out.println("The scent of the Candle is: ");
        String Scents = S.next();
        Scent = Scents;
    }
    public String getscent()
    {
        return Scent;
    }
    @Override
    public void setheight()
    {
        super.setheight();
        price = height * 3;
    }

}



