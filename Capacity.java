import java.util.Scanner;
public class Fun{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        System.out.print((2*t*s*b*512)/1024);
        System.out.print(" KB");
    
    }
}