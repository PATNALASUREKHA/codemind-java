import java.util.Scanner;
public class Registration{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((b-c)>a)
            {
                System.out.printf("YES
");
            }
            else
            {
                System.out.printf("NO
");
            }
        }
    }
}