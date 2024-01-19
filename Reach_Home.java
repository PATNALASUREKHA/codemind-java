import java.util.Scanner;
public class Reach{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*5;
        if(c>=b)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}