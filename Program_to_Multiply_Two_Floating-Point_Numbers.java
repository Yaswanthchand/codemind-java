import java.util.Scanner;
class fmul
{
    public static void main(String args[])
    {
        float a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        b=s.nextFloat();
        System.out.format("%.2f",a*b);
    }
}