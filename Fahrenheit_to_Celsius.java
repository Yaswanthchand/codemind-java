import java.util.Scanner;
class F
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float fa;
        fa=s.nextFloat(); 
        double c=(float)(fa-32)/1.8;
        System.out.format("%.2f",c);
    }
}