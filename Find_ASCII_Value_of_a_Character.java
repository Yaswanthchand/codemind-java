import java.util.Scanner;
class ascii
{
    public static void main(String args[])
    {
        char c;
        Scanner s=new Scanner(System.in);
        c=s.nextLine().charAt(0);
        System.out.print((int)c);
    }
}