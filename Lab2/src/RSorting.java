import java.util.*;
public class RSorting {
	public static void getSorted(int[] a)
	{
		for(int i=0;i<a.length/2;i++)
		{
			int m=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=m;
		}
		int rev[]=new int[a.length];
		System.out.println("reversed elements ");
		for(int i=0;i<a.length;i++)
		{
			rev[i]=a[i];
		}
		for(int ii:rev)
		{
			System.out.println(ii);
		}
		System.out.println();
		System.out.println("Sorted Reversed Elements");
		Arrays.sort(rev);
		for(int ii:rev)
		{
			System.out.println(ii);
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		RSorting rs=new RSorting();
		System.out.println("Enter Range ");
		int n=in.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		rs.getSorted(a);
		in.close();
	}
}
