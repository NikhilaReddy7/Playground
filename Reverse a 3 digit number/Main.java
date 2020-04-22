import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int rev=0;
    while(n>0)
      
    {
      int t=n%10;
      rev=rev*10+t;
      n=n/10;
    }
    System.out.println(rev);
      
    
  }
}