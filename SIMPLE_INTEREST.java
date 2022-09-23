import java.util.Scanner;
class S
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int res=(p*t*r)/100;
        System.out.print(res);
    }
}