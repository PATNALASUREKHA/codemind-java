import java.util.Scanner;
public class Name{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0); 
        if(s == 'V')
        {
            System.out.printf("Violet");
        }
        else if(s == 'I')
        {
            System.out.printf("Indigo");
        }
        else if(s == 'B')
        {
            System.out.printf("Blue");
        }
        else if(s == 'G')
        {
            System.out.printf("Green");
        }
        else if(s == 'Y')
        {
            System.out.printf("Yellow");
        }
        else if(s == 'O')
        {
            System.out.printf("Orange");
        }
        else if(s == 'R')
        {
            System.out.printf("Red");
        }else 
        {
            System.out.printf("-1");
        }
    }
}