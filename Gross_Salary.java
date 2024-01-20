import java.util.Scanner;
public class Gross{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        double h=0;
        double d=0;
        if (a<=10000)
        {
            h = (0.8)*a;
            d = (0.2)*a;
        }
        
        else if (a<=20000)
        {
            h = (0.9)*a;
            d = (0.25)*a;
        }
        else if(a>20000)
        {
            h = (0.95)*a;
            d = (0.30)*a;
        }
        System.out.printf("%.2f",a+h+d);
    }
}