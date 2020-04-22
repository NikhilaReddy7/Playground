import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=0;
    while(n>0)
    {
      if(n<99)
      {
        t=n%10;
        System.out.println(t);
        break;
      }
      n=n/10;
    }
  }
}