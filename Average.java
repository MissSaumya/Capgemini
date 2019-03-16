import java.util.*;
class Average
{
  public void calAvg(int n,int a[])
  {
    int i;
    double avg,sum=0.0;
    for(i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
    avg=sum/n;
    System.out.println("Average is "+avg);
  }
  public static void main(String[] args)
  {
    Average obj=new Average();
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("For how many numbers you want calculate average  of");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the numbers");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    obj.calAvg(n,a);
  }
}