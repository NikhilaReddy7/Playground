import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=0,sum=0;
    while(n>0)
    {
      t=n%10;
      sum=sum+t;
      n=n/10;
    }
    System.out.println(sum);
  }
}