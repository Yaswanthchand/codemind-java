import java.util.Scanner;
class Pal
{  
 public static void main(String args[])
 {  
  int n;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int r,rev=0,temp;    
  temp=n;    
  while(n>0)
  {    
   r=n%10; 
   rev=(rev*10)+r;    
   n=n/10;    
  }    
  if(temp==rev)    
   System.out.println("True");    
  else    
   System.out.println("False");    
  }  
}  