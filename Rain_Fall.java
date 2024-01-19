import java.util.Scanner;
public class Rain{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<3)
        {
            System.out.printf("LIGHT");
        }
        else if(a>=3 && a<7)
        {
            System.out.printf("MODERATE");
        }
        else if(a>=7)
        {
            System.out.printf("HEAVY");
        }
    }
}