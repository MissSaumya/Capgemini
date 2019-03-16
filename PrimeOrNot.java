import java.util.*;
class PrimeOrNot
{
  public static void main(String[] args)
  {
    int num,i,c=0;
    System.out.println("Enter a number to check whether it is prime or not");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
  
    for(i=2;i<num;i++)
    { 
      if((num%i)==0)
      {
        c=1;
      }
    }
    if(c==1)
      System.out.println("The number is not prime");
    else
      System.out.println("The number is prime");
  }
}