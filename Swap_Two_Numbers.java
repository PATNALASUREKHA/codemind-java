import java.util.Scanner;
public class Swap{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k;
        k = a;
        a = b;
        b = k;
        System.out.print(a);
        System.out.print("
");
        System.out.print(b);
    }
}