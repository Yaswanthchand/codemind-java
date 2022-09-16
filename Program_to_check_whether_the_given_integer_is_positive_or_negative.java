import java.util.Scanner;
class Pos
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        String res=(n>0)?"Positive Number":"Negative Number";
        System.out.println(res);
    }
}