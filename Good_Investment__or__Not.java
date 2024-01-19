import java.util.Scanner;
public class Invest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b*2;
        if(a>=c)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}