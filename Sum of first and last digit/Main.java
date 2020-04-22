import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=0;
    int a=n;
    while(n>0)
    {
      if(n<10)
        t=n;
     n=n/10;
    }
    int l=a%10;
    int sum=t+l;
    System.out.println(sum);
  }
}