import java.util.Scanner;
import java.lang.Math;
public class Capacity{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = (a+b+c)/2.0;
        double e = Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.printf("%.2f",e);
    }
}