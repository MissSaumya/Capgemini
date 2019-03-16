import java.util.*;
class TwoDArray
{
  public static void main(String [] args)
  {
    int a[][]=new int[4][4];
    int i,j;
    System.out.println("Enter the numbers you want to insert in 2-D array");
    Scanner sc=new Scanner(System.in);
    for(i=0;i<4;i++)
    {
      for(j=0;j<4;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    
    for(i=0;i<4;i++)
    {
      for(j=0;j<4;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println("");
    }
  }
}