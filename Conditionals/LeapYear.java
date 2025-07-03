Input a year and find whether it is a leap year or not.

  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year % 100 != 0 && year % 4 == 0)
        {
            System.out.println("Leap year");
        }
        else if(year % 100 == 0 && year % 400 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
