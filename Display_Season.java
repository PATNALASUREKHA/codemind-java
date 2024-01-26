import java.util.Scanner;
public class Season{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=4 && a<=6)
        {
            System.out.printf("Summer");
        }
        else if(a>=7 && a<=10)
        {
            System.out.printf("Rainy");
        }
        else if(a==11 || a==12 || a==1)
        {
            System.out.printf("Winter");
        }
        else if(a >=2 && a<=3)
        {
            System.out.printf("Spring");
        }
        else
        {
            System.out.printf("-1");
        }
    }
}