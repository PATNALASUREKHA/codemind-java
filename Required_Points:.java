import java.util.Scanner;
public class Fun{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<y)
        {
            System.out.print(y/x);
            
        }
        else
        {
            System.out.print("0");
        }
    }
}