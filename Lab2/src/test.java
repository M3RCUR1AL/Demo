import java.util.Scanner;
public class test {
	public static void getSorted(int[] a)
	{
		int m,t=0;
		int rev[]=new int[10];
		for(m=5-1;m>=0;m--)
		{
			rev[t]=a[m];
			t++;
		}
		System.out.println (rev[m]);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,n;
		int a[]=new int[10];
		System.out.println("Enter the range :");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the number: ");
			a[i]=in.nextInt();
		}
		getSorted(a);
		in.close();
	}
}
