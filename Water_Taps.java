import java.util.Scanner;
public class Water{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = (a*b)/(a+b);
        System.out.printf("%d",z);
    }
}