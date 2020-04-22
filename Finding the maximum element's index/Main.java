import java.util.Scanner;
class Main
{
  public static int max(int a[],int n)
  {
    int max=a[0];
    int h=0;
    for(int i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        h=i;
      }
    }
    return h;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int s=max(a,n);
    System.out.println(s);
  }
}