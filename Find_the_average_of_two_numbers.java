import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        int a,b;
        float avg;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        avg=(float)(a+b)/2;
        System.out.format("%.4f",avg);
    }
}