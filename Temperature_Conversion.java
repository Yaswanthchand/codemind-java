import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        int c;
        Scanner s=new Scanner(System.in);
        c=s.nextInt();
        double f=(float) 32+(c*1.8);
        System.out.format("%.2f",f);
    }
}