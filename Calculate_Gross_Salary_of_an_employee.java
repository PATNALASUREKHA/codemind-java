import java.util.Scanner;
import java.lang.Math;
public class Capacity{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double pf = (0.12)*a;
        double gs = a+b+c+pf;
        System.out.printf("%.2f",pf);
        System.out.printf("
");
        System.out.printf("%.2f",gs);
        
        
    }
}