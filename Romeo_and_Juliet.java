import java.util.Scanner;
public class Romeo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%d",(a*5+(b*10))/c);
    }
}