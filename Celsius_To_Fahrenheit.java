import java.util.Scanner;
class C
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float c;
        c=s.nextFloat();
        double fa=(float)32+(c*1.8);
        System.out.format("%.2f",fa);
    }
}