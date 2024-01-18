import java.util.Scanner;
public class Fun{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = 32+(a*9/5);
        System.out.printf("%.2f",b);
    }
}