import java.util.Scanner;
public class Color{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a =='V' || a == 'v')
        {
            System.out.printf("Violet");
        }
        else if(a =='I' || a == 'i')
        {
            System.out.printf("Indigo");
        }
        else if(a=='B' || a == 'b')
        {
            System.out.printf("Blue");
        }
        else if(a =='G' || a == 'g')
        {
            System.out.printf("Green");
        }
        else if(a =='Y' || a == 'y')
        {
            System.out.printf("Yellow");
        }
        else if(a =='O' || a == 'o')
        {
            System.out.printf("Orange");
        }
        else if(a =='R' || a == 'r')
        {
            System.out.printf("Red");
        }
        
        else
        {
            System.out.printf("-1");
        }
    }
}