import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int t=n1%10;
      int f=n1/100;
      int sum=t+f;
      System.out.println(sum);
	}
}