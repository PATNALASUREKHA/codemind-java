import java.util.Scanner;
import java.lang.Math;
public class Hyp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double k = Math.sqrt(x*x+y*y);
        System.out.printf("%.2f",k);
    }
}