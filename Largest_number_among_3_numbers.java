import java.util.Scanner;
public class Largeest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.max(a,b);
        int e = Math.max(c,d);
        System.out.println(e);
    }
}