import java.util.Scanner;
class D
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n*(n-3)/2;
        System.out.print(res);
    }
}